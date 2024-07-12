package data;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno{
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    private String nome;
    private String cpf;
    private String matricula;
    private String dataNasc;
    public enum Sexo{M, F, O};
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private boolean pcd;
    private String pcdTexto;
    
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private EnderecoAluno idEndereco;
    @ManyToOne
    @JoinColumn(name = "id_responsavel1")
    private Responsavel idResponsavel1;
    @ManyToOne
    @JoinColumn(name = "id_responsavel2")
    private Responsavel idResponsavel2;
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }

    public String getPcdTexto() {
        return pcdTexto;
    }

    public void setPcdTexto(String pcdTexto) {
        this.pcdTexto = pcdTexto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnderecoAluno getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(EnderecoAluno idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Responsavel getIdResponsavel1() {
        return idResponsavel1;
    }

    public void setIdResponsavel1(Responsavel idResponsavel1) {
        this.idResponsavel1 = idResponsavel1;
    }

    public Responsavel getIdResponsavel2() {
        return idResponsavel2;
    }

    public void setIdResponsavel2(Responsavel idResponsavel2) {
        this.idResponsavel2 = idResponsavel2;
    }
}