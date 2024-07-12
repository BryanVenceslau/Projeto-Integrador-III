package dao;
import data.Solicitacao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.util.List;
import javax.swing.JOptionPane;

public class SolicitacaoDao {
    public List<Solicitacao> getSolicitacao(){
        EntityManager em = JPA.getEntityManager();
        List<Solicitacao> listaRetorno;
        
        try {
            String query = "SELECT s FROM Solicitacao s"
                    + " WHERE s.status = 'Não resolvido'";
            
            TypedQuery<Solicitacao> consulta = em.createQuery(query, Solicitacao.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public int getIdSolicitacao(int linhaTabela, List<Solicitacao> lista){
        return lista.get(linhaTabela).getId();
    }
    
    public void atualizarSolicitacao(int idSolicitacao){
        EntityManager em = JPA.getEntityManager();
        Solicitacao solic = null;
        
        try {
            String query = "SELECT s FROM Solicitacao s"
                    + " WHERE s.id = :Id";
            
            TypedQuery<Solicitacao> consulta = em.createQuery(query, Solicitacao.class);
            consulta.setParameter("Id", idSolicitacao);
            
            solic = consulta.getSingleResult();
            if (solic != null){
                solic.setStatus("Resolvido");

                em.getTransaction().begin();
                em.merge(solic);
                em.getTransaction().commit();
            }
        }catch (NoResultException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            JPA.closeEntityManager();
        }
    }
}