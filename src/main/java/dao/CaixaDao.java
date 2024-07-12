package dao;
import data.Caixa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class CaixaDao {
    public List<Caixa> getCaixa(){
        EntityManager em = JPA.getEntityManager();
        List<Caixa> listaRetorno;
        
        try {
            String query = "SELECT c FROM Caixa c";
            
            TypedQuery<Caixa> consulta = em.createQuery(query, Caixa.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public void inserirCaixa(Caixa caixa){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(caixa);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public List<Caixa> getEntrada(){
        EntityManager em = JPA.getEntityManager();
        List<Caixa> listaRetorno;
        
        try {
            String query = "Select c FROM Caixa c"
                    + " WHERE c.saida = 0";
            
            TypedQuery<Caixa> consulta = em.createQuery(query, Caixa.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public float somaEntrada(){
        List<Caixa> listaEntrada = getEntrada();
        float totalEntrada = (float) 0.0;
        
        for (int i = 0; i < listaEntrada.size(); i++){
            totalEntrada += listaEntrada.get(i).getEntrada();
        }
        return totalEntrada;
    }
    
    public List<Caixa> getSaida(){
        EntityManager em = JPA.getEntityManager();
        List<Caixa> listaRetorno;
        
        try {
            String query = "Select c FROM Caixa c"
                    + " WHERE c.entrada = 0";
            
            TypedQuery<Caixa> consulta = em.createQuery(query, Caixa.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public float somaSaida(){
        List<Caixa> listaSaida = getSaida();
        float totalSaida = (float) 0.0;
        
        for (int i = 0; i < listaSaida.size(); i++){
            totalSaida += listaSaida.get(i).getSaida();
        }
        return totalSaida;
    }
    
    public float somaTotal(){
        return somaEntrada() - somaSaida();
    }
}