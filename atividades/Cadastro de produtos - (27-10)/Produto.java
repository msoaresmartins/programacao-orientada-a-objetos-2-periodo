
import java.util.Date;
import java.text.SimpleDateFormat;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "produtos")
public class Produto {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false, unique = true)
    private String codigo;

    @DatabaseField(canBeNull = false)
    private String nome;

    @DatabaseField
    private double preco;

    @DatabaseField
    private int quantidade;

    @DatabaseField(dataType = DataType.DATE)
    private Date validade;

    // Construtor sem parametros exigido pelo ORMLite
    public Produto() {
    }

    // Construtor utilizado no cadastro de produtos
    public Produto(String codigo, String nome,
                   double preco, int quantidade, Date validade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        String data = validade == null
            ? "Nao informada"
            : new SimpleDateFormat("dd/MM/yyyy").format(validade);

        return "Produto: " + nome
             + " | Codigo: " + codigo
             + " | Preco: R$ " + preco
             + " | Quantidade: " + quantidade
             + " | Validade: " + data;
    }
}
