package data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table (name = "caixa")
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    Date data;
    String descricao;
    float entrada;
    float saida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public float getSaida() {
        return saida;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }
}