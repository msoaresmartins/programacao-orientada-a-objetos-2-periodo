import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
    private final Map<String, Produto> produtos = new HashMap<>();

    public void adicionar(Produto produto) {
        if (produto == null) throw new IllegalArgumentException("Produto não pode ser nulo.");
        if (produtos.containsKey(produto.getCodigo()))
            throw new IllegalArgumentException("Código já cadastrado: " + produto.getCodigo());
        produtos.put(produto.getCodigo(), produto);
    }

    public List<Produto> listar() { return new ArrayList<>(produtos.values()); }

    public Produto buscar(String codigo) throws ProdutoNaoEncontradoException {
        Produto produto = produtos.get(codigo);
        if (produto == null) throw new ProdutoNaoEncontradoException(codigo);
        return produto;
    }

    public void remover(String codigo) throws ProdutoNaoEncontradoException {
        if (produtos.remove(codigo) == null) throw new ProdutoNaoEncontradoException(codigo);
    }
}
