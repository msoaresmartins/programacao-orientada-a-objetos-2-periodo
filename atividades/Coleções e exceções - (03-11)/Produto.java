public class Produto {
    private final String codigo;
    private final String nome;
    private final double preco;

    public Produto(String codigo, String nome, double preco) {
        if (codigo == null || codigo.isBlank() || nome == null || nome.isBlank() || preco < 0)
            throw new IllegalArgumentException("Código, nome e preço devem ser válidos.");
        this.codigo = codigo.trim();
        this.nome = nome.trim();
        this.preco = preco;
    }

    public String getCodigo() { return codigo; }
    @Override public String toString() { return codigo + " - " + nome + " - R$ " + String.format("%.2f", preco); }
}
