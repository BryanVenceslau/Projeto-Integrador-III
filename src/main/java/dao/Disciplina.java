package dao;
//Importações
import data.Aluno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Disciplina {
    //Atributos
    private String nome;
    private List<Aluno> alunos;
    //Construtor
    public Disciplina(String nome){
        this.nome = nome;
        
        alunos = new ArrayList<>();
    }
    //Métodos
    //Adiciona alunos a disciplina específica
    public void addAlunoDisciplina(Aluno aluno){
        getAlunos().add(aluno);
    }
    //Mostra os alunos matriculados na disciplina em ordem alfabética
    public List<Aluno> getAlunos() {
        Collections.sort(alunos, (Aluno aluno1, Aluno aluno2) -> aluno1.getNome().compareTo(aluno2.getNome()));
        return alunos;
    }
    //Mostrar o nome da disciplina
    public String getNome() {
        return nome;
    }
}