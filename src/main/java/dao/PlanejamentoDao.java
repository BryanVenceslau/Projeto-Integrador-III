package dao;
import data.Planejamento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.sql.Date;
import java.util.List;

public class PlanejamentoDao {
    public void inserirPlan(Planejamento plan){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(plan);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public List<Planejamento> getPlanejamentoData(Date dataInicial, Date dataFinal){
        EntityManager em = JPA.getEntityManager();
        List<Planejamento> listaRetorno = null;
        
        try {
            String query = "SELECT p FROM Planejamento p"
                    + " WHERE p.dataInicial >= :INICIAL"
                    + " AND p.dataFinal <= :FINAL";
            
            TypedQuery<Planejamento> consulta = em.createQuery(query, Planejamento.class);
            consulta.setParameter("INICIAL", dataInicial);
            consulta.setParameter("FINAL", dataFinal);
            
            listaRetorno = consulta.getResultList();
        } catch (Exception e) {
            System.out.println("Erro ao executar a consulta: " + e.getMessage());
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public Planejamento getDescPlanejamento(String descricao){
        EntityManager em = JPA.getEntityManager();
        Planejamento plan = null;
        
        try {
            String query = "SELECT p FROM Planejamento p"
                    + " WHERE p.descricao = :DESCRICAO";
            
            TypedQuery<Planejamento> consulta = em.createQuery(query, Planejamento.class);
            consulta.setParameter("DESCRICAO", descricao);
            if (descricao.equals(consulta.getSingleResult().getDescricao())){
                plan = consulta.getSingleResult();
            }
        } finally {
            JPA.closeEntityManager();
        }
        return plan;
    } 
    
    public void excluirPlanejamento(Planejamento planPar){
        EntityManager em = JPA.getEntityManager();
        Planejamento plan = em.find(Planejamento.class, planPar.getId());
        
        em.getTransaction().begin();
        em.remove(plan);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
}