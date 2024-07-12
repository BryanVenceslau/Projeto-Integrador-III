package dao;
import data.Aluno;
import data.EnderecoAluno;
import data.Responsavel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class AlunoDao {
    public void inserirAluno(Aluno aluno){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public void inserirEnderecoAluno(EnderecoAluno endereco){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(endereco);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public void inserirResponsavel(Responsavel responsavel){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(responsavel);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public int getIdEnderecoAluno(String cep){
        EntityManager em = JPA.getEntityManager();
        int idEnderecoAluno = 0;
        
        try {
            String query = "SELECT e FROM AlunoEndereco e"
                    + " WHERE e.cep = :CEP";
            
            TypedQuery<EnderecoAluno> consulta = em.createQuery(query, EnderecoAluno.class);
            consulta.setParameter("CEP", cep);
            if (cep.equals(consulta.getSingleResult().getCep())){
                idEnderecoAluno = consulta.getSingleResult().getId();
            }
        } finally {
            JPA.closeEntityManager();
        }
        return idEnderecoAluno;
    }
    
    public int getIdResponsavel(String cpf){
        EntityManager em = JPA.getEntityManager();
        int idResponsavel = 0;
        
        try {
            String query = "SELECT r FROM Responsavel r"
                    + " WHERE r.cpf = :CPF";
            
            TypedQuery<Responsavel> consulta = em.createQuery(query, Responsavel.class);
            consulta.setParameter("CPF", cpf);
            if (cpf.equals(consulta.getSingleResult().getCpf())){
                idResponsavel = consulta.getSingleResult().getId();
            }
        } finally {
            JPA.closeEntityManager();
        }
        return idResponsavel;
    }
    
    public void inserirId(EnderecoAluno endereco, Responsavel pai, Responsavel mae, Aluno aluno){
        aluno.setIdEndereco(endereco);
        aluno.setIdResponsavel1(pai);
        aluno.setIdResponsavel2(mae);
    }
    
    public List<Aluno> getAlunoNome(String nomeAluno){
        EntityManager em = JPA.getEntityManager();
        List<Aluno> listaRetorno = null;
        
        try {
            String query = "SELECT a FROM Aluno a"
                    + " WHERE a.nome = :NOME";
            
            TypedQuery<Aluno> consulta = em.createQuery(query, Aluno.class);
            consulta.setParameter("NOME", nomeAluno);
            if (nomeAluno.equals(consulta.getSingleResult().getNome())){
                listaRetorno = consulta.getResultList();
            }
        }catch (NoResultException e){
            System.out.println("=====\n\n" + e.getMessage() + "\n\n=====");
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public Aluno getAlunoMatricula(String matricula){
        EntityManager em = JPA.getEntityManager();
        Aluno aluno = null;
        
        try {
            String query = "SELECT a FROM Aluno a"
                    + " WHERE a.matricula = :MATRICULA";
            
            TypedQuery<Aluno> consulta = em.createQuery(query, Aluno.class);
            consulta.setParameter("MATRICULA", matricula);
            
            List<Aluno> resultados = consulta.getResultList();
            if (!resultados.isEmpty()) {
                aluno = resultados.get(0);
            }
        } finally {
            JPA.closeEntityManager();
        }
        return aluno;
    } 
    
    public List<Aluno> getAluno(){
        EntityManager em = JPA.getEntityManager();
        List<Aluno> listaRetorno = null;
        
        try {
            String query = "SELECT a FROM Aluno a";
            
            TypedQuery<Aluno> consulta = em.createQuery(query, Aluno.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    } 
    
    public void excluirAluno(Aluno alunoPar){
        EntityManager em = JPA.getEntityManager();
        Aluno aluno = em.find(Aluno.class, alunoPar.getId());
        
        em.getTransaction().begin();
        em.remove(aluno);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
    
    public void excluirAlunoEndereco(EnderecoAluno enderecoPar){
        EntityManager em = JPA.getEntityManager();
        EnderecoAluno endereco = em.find(EnderecoAluno.class, enderecoPar.getId());
        
        em.getTransaction().begin();
        em.remove(endereco);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
}