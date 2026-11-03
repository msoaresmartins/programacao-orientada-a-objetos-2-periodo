public class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException(String codigo) {
        super("Produto com código " + codigo + " não encontrado.");
    }
}
