package dao;
import data.Funcionario;

public class ProfessorAula extends Funcionario{
    //Atributos
    private Disciplina disciplina;
    private Aula aula;
    //Construtor
    public ProfessorAula(Disciplina disciplina, Aula aula){
        this.disciplina = disciplina;
        this.aula = aula;
    }
    //Métodos
    //Professor entra no sistema
    public void entrarAula(ProfessorAula this){
        aula.receberProfessor(this);
    }
    //Mostrar disciplina do professor
    public Disciplina mostrarDisciplinaProfessor(){
        return disciplina;
    }
    //Ver a chamada em uma aula específica
    public void verChamadaAula(){
        aula.fazerChamada();
    }
    //O professor poderá ver a descrição de sua aula
    public String verDescricaoAula(){
        return aula.getDescricao();
    }
    //O professor realizará a descrição de sua aula
    public void fazerDescricaoAula(){
        aula.setDescricao();
    }
    //Mostra a data da aula
    public String mostrarDataAula(){
        return aula.getData();
    }
    //Muda a data da aula
    public void mudarDataAula(String data){
        aula.setData(data);
    }
    //Mostrará a disciplina da aula
    public Disciplina mostrarDisciplinaAula(){ 
        return aula.getDisciplina();
    }
    //O professor selecionará a disciplina a ser lecionada
    public void selecionarDisciplinaAula(Disciplina disciplina){
        aula.setDisciplina(disciplina);
    }
}
