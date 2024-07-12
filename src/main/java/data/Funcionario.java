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
@Table(name = "funcionario")
public class Funcionario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    public enum Sexo{Masculino, F, O};
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    protected String cargo;
    protected boolean pcd;
    protected String pcdTexto;
    protected String naturalidade;
    protected String estadoCivil;
    protected String formacao;
     
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    protected EnderecoFunc idEndereco;
    @ManyToOne
    @JoinColumn(name = "id_contato")
    protected ContatoFunc idContato;
    @ManyToOne
    @JoinColumn(name = "id_filiacao")
    protected FiliacaoFunc idFiliacao;
    @ManyToOne
    @JoinColumn(name = "id_acesso")
    protected Acesso idAcesso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public EnderecoFunc getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(EnderecoFunc idEndereco) {
        this.idEndereco = idEndereco;
    }

    public ContatoFunc getIdContato() {
        return idContato;
    }

    public void setIdContato(ContatoFunc idContato) {
        this.idContato = idContato;
    }

    public FiliacaoFunc getIdFiliacao() {
        return idFiliacao;
    }

    public void setIdFiliacao(FiliacaoFunc idFiliacao) {
        this.idFiliacao = idFiliacao;
    }

    public Acesso getIdAcesso() {
        return idAcesso;
    }

    public void setIdAcesso(Acesso idAcesso) {
        this.idAcesso = idAcesso;
    }
}