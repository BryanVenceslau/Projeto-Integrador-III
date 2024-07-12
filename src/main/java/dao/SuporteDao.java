package dao;
import data.Funcionario;
import javax.swing.JOptionPane;

public class SuporteDao extends Funcionario{
    public void verAtividades(){
        JOptionPane.showMessageDialog(null, "Olhando as atividades...");
    }
    
    public void verificarIntegridadeBD(){
        JOptionPane.showMessageDialog(null, "Verificando a integridade do banco de dados...");
    }

    public void otimizarPerformance(){
        JOptionPane.showMessageDialog(null, "Otimizando a performance do sistema...");
    }
}