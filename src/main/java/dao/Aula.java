package dao;
import data.Aluno;
import java.util.Scanner;
public class Aula {
    private ProfessorAula professor;
    private Disciplina disciplina;
    private String descricao;
    private String data;
    //Recebe o professor
    public void receberProfessor(ProfessorAula professor){
        this.professor = professor;
        this.disciplina = professor.mostrarDisciplinaProfessor();
    }
    //Mostra a chamada em ordem alfabética de uma disciplina específica
    public void fazerChamada(){
        System.out.println("------------------");
        byte i = 1;
        for (Aluno aluno : getDisciplina().getAlunos()) {
            System.out.println(i++ + "°- " + aluno.getNome());
        }
        System.out.println("------------------");
    }
    //Mostra a descrição da aula
    public String getDescricao(){
        return descricao;
    } 
    //Faz a descrição da aula em específico
    public void setDescricao(){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Escreva a descrição da aula \nR: ");
        this.descricao = ler.nextLine();
    }
    //Mostra a disciplina da aula
    public Disciplina getDisciplina() {
        return disciplina;
    }
    //Muda a disciplina da aula
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    //Mostra a data da aula
    public String getData() {
        return data;
    }
    //Muda a data da aula
    public void setData(String data) {
        this.data = data;
    }
}