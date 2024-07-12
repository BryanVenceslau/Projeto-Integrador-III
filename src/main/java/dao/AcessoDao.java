package dao;
import data.Acesso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class AcessoDao {
    public Acesso verificacao(String login, String senha){
        EntityManager em = JPA.getEntityManager();
        Acesso acesso;
        
        try {
            String query = "SELECT a FROM Acesso a"
                    + " WHERE a.login = :Login"
                    + " AND a.senha = :Senha";

            TypedQuery<Acesso> consulta = em.createQuery(query, Acesso.class);
            consulta.setParameter("Login", login);
            consulta.setParameter("Senha", senha);

            acesso = consulta.getSingleResult();
        } catch (NoResultException e) {
            acesso = null;
        } finally {
            JPA.closeEntityManager();
        }
        return acesso;
    }
    
    public Acesso getAcesso(int id){
        EntityManager em = JPA.getEntityManager();
        Acesso acesso;
        
        try {
            String query = "SELECT a FROM Acesso a"
                    + " WHERE a.id = :ID";
            
            TypedQuery<Acesso> consulta = em.createQuery(query, Acesso.class);
            consulta.setParameter("ID", id);
            
            acesso = consulta.getSingleResult();
        } catch (NoResultException e) {
            acesso = null;
        } finally {
            JPA.closeEntityManager();
        }
        return acesso;
    }
}