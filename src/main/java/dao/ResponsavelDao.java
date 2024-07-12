package dao;
import data.Responsavel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ResponsavelDao {
    public List<Responsavel> getResponsavel(){
        EntityManager em = JPA.getEntityManager();
        List<Responsavel> listaRetorno = null;
        
        try {
            String query = "SELECT r FROM Responsavel r";
            
            TypedQuery<Responsavel> consulta = em.createQuery(query, Responsavel.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    } 
    
    public void excluirResponsavel(Responsavel respPar){
        EntityManager em = JPA.getEntityManager();
        Responsavel responsavel = em.find(Responsavel.class, respPar.getId());
        
        em.getTransaction().begin();
        em.remove(responsavel);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
}
