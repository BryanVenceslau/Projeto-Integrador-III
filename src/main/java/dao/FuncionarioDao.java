package dao;
import data.Acesso;
import data.Funcionario;
import data.ContatoFunc;
import data.EnderecoFunc;
import data.FiliacaoFunc;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class FuncionarioDao {
    public void inserirFuncionario(Funcionario func){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(func);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public void inserirEnderecoFunc(EnderecoFunc endereco){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(endereco);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public void inserirResponsavel(FiliacaoFunc filiacao){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(filiacao);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public void inserirContatoFunc(ContatoFunc contato){
        EntityManager em = JPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(contato);
        em.getTransaction().commit();
        
        JPA.closeEntityManager();
    }
    
    public int getIdEnderecoFunc(String cep){
        EntityManager em = JPA.getEntityManager();
        int idEnderecoFunc = 0;
        
        try {
            String query = "SELECT f FROM FuncionarioEndereco f"
                    + " WHERE f.cep = :CEP";
            
            TypedQuery<EnderecoFunc> consulta = em.createQuery(query, EnderecoFunc.class);
            consulta.setParameter("CEP", cep);
            if (cep.equals(consulta.getSingleResult().getCep())){
                idEnderecoFunc = consulta.getSingleResult().getId();
            }
        } finally {
            JPA.closeEntityManager();
        }
        return idEnderecoFunc;
    }
    
    public int getIdFiliacao(String nomePai, String nomeMae){
        EntityManager em = JPA.getEntityManager();
        int idFiliacao = 0;
        
        try {
            String query = "SELECT f FROM FuncionarioFiliacao f"
                    + " WHERE f.nomePai = :NOMEPAI"
                    + " AND f.nomeMae = :NOMEMAE";
           
            TypedQuery<FiliacaoFunc> consulta = em.createQuery(query, FiliacaoFunc.class);
            consulta.setParameter("NOMEPAI", nomePai);
            consulta.setParameter("NOMEMAE", nomeMae);
            if (nomePai.equals(consulta.getSingleResult().getNomePai()) && nomeMae.equals(consulta.getSingleResult().getNomeMae())){
                idFiliacao = consulta.getSingleResult().getId();
            }
        } finally {
            JPA.closeEntityManager();
        }
        return idFiliacao;
    }
    
    public int getIdContato(String celular){
        EntityManager em = JPA.getEntityManager();
        int idContato = 0;
        
        try {
            String query = "SELECT f FROM FuncionarioContato f"
                    + " WHERE f.celular = :CELULAR";
            
            TypedQuery<ContatoFunc> consulta = em.createQuery(query, ContatoFunc.class);
            consulta.setParameter("CELULAR", celular);
            if (celular.equals(consulta.getSingleResult().getCelular())){
                idContato = consulta.getSingleResult().getId();
            }
        } finally {
            JPA.closeEntityManager();
        }
        return idContato;
    }
    
    public List<Funcionario> getFuncionario(){
        EntityManager em = JPA.getEntityManager();
        List<Funcionario> listaRetorno = null;
        
        try {
            String query = "SELECT f FROM Funcionario f";
            
            TypedQuery<Funcionario> consulta = em.createQuery(query, Funcionario.class);
            listaRetorno = consulta.getResultList();
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    } 
    
    public List<Funcionario> getFuncNome(String nomeFunc){
        EntityManager em = JPA.getEntityManager();
        List<Funcionario> listaRetorno = null;
        
        try {
            String query = "SELECT f FROM Funcionario f"
                    + " WHERE f.nome = :NOME";
            
            TypedQuery<Funcionario> consulta = em.createQuery(query, Funcionario.class);
            consulta.setParameter("NOME", nomeFunc);
            if (nomeFunc.equals(consulta.getSingleResult().getNome())){
                listaRetorno = consulta.getResultList();
            }
        }catch (NoResultException e){
            System.out.println("=====\n\n" + e.getMessage() + "\n\n=====");
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public List<Funcionario> getFuncCargo(String cargo){
        EntityManager em = JPA.getEntityManager();
        List<Funcionario> listaRetorno = null;
        
        try {
            String query = "SELECT f FROM Funcionario f"
                    + " WHERE f.cargo = :CARGO";
            
            TypedQuery<Funcionario> consulta = em.createQuery(query, Funcionario.class);
            consulta.setParameter("CARGO", cargo);
            if (cargo.equals(consulta.getSingleResult().getCargo())){
                listaRetorno = consulta.getResultList();
            }
        }catch (NoResultException e){
            System.out.println("=====\n\n" + e.getMessage() + "\n\n=====");
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public List<Funcionario> getFuncCpf(String cpf){
        EntityManager em = JPA.getEntityManager();
        List<Funcionario> listaRetorno = null;
        
        try {
            String query = "SELECT f FROM Funcionario f"
                    + " WHERE f.cpf = :CPF";
            
            TypedQuery<Funcionario> consulta = em.createQuery(query, Funcionario.class);
            consulta.setParameter("CPF", cpf);
            if (cpf.equals(consulta.getSingleResult().getCpf())){
                listaRetorno = consulta.getResultList();
            }
        }catch (NoResultException e){
            System.out.println("=====\n\n" + e.getMessage() + "\n\n=====");
        } finally {
            JPA.closeEntityManager();
        }
        return listaRetorno;
    }
    
    public void definirRelacionamento(EnderecoFunc endereco, ContatoFunc contato, FiliacaoFunc filiacao, Funcionario func){
        func.setIdEndereco(endereco);
        func.setIdContato(contato);
        func.setIdFiliacao(filiacao);
    }
    
    public void definirRelAcesso(Acesso acesso, Funcionario func){
        func.setIdAcesso(acesso);
    }
    
    public void excluirFuncionario(Funcionario funcPar){
        EntityManager em = JPA.getEntityManager();
        Funcionario func = em.find(Funcionario.class, funcPar.getId());
        
        em.getTransaction().begin();
        em.remove(func);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
    public void excluirFuncionarioContato(ContatoFunc funcPar){
        EntityManager em = JPA.getEntityManager();
        ContatoFunc funcContato = em.find(ContatoFunc.class, funcPar.getId());
        
        em.getTransaction().begin();
        em.remove(funcContato);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
    public void excluirFuncionarioFiliacao(FiliacaoFunc funcPar){
        EntityManager em = JPA.getEntityManager();
        FiliacaoFunc funcFiliacao = em.find(FiliacaoFunc.class, funcPar.getId());
        
        em.getTransaction().begin();
        em.remove(funcFiliacao);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
    public void excluirFuncionarioEndereco(EnderecoFunc funcPar){
        EntityManager em = JPA.getEntityManager();
        EnderecoFunc funcEndereco = em.find(EnderecoFunc.class, funcPar.getId());
        
        em.getTransaction().begin();
        em.remove(funcEndereco);
        em.getTransaction().commit();

        JPA.closeEntityManager();
    }
}