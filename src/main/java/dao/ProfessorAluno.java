package dao;
//Importações
import java.util.HashMap;
import java.util.Map;
public class ProfessorAluno {
    //Atributos
    private final Map<Disciplina, Integer> faltas;
    private final Map<Disciplina, Float> notas;
    //Contrutor
    public ProfessorAluno(){
        notas = new HashMap<>(); //vai associar uma instancia de disciplina a uma nota
        faltas = new HashMap<>(); //vai associar uma instancia de disciplina a uma falta   
    }
    //Registra uma nota a uma disciplina específica
    public void registrarNotas(Disciplina disciplina, float nota) {
        notas.put(disciplina, nota);
    }
    /*Registra o número de faltas em uma determinada disciplina,
    se não estiver registrada começa com 0, se não incrementa 1*/
    public void registrarFaltas(Disciplina disciplina) {
        faltas.put(disciplina, faltas.getOrDefault(disciplina, 0) + 1);
    }
    /*Retorna a quantidade de faltas em uma disciplina específica,
    se não estiver registrada, começa com 0*/
    public void mostrarFaltas(Disciplina disciplina) {
        System.out.println("Qtd de faltas em " + disciplina.getNome() +": " + faltas.getOrDefault(disciplina, 0));
    }
    //Retorna as notas em uma disciplina específica
    public void mostrarNotas(Disciplina disciplina){
        System.out.println("Nota em " + disciplina.getNome() + ": " + notas.get(disciplina));
    }
}