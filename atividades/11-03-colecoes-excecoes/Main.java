public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionar(new Produto("P01", "Arroz", 6.50));
        estoque.adicionar(new Produto("P02", "Feijão", 8.90));
        System.out.println("Lista inicial: " + estoque.listar());
        try {
            System.out.println("Busca P01: " + estoque.buscar("P01"));
            estoque.remover("P02");
            System.out.println("Após remover P02: " + estoque.listar());
        } catch (ProdutoNaoEncontradoException e) { System.out.println(e.getMessage()); }

        try { estoque.adicionar(new Produto("P01", "Duplicado", 1.0));
        } catch (IllegalArgumentException e) { System.out.println("Erro tratado: " + e.getMessage()); }
        try { estoque.adicionar(new Produto("P03", "Inválido", -2));
        } catch (IllegalArgumentException e) { System.out.println("Erro tratado: " + e.getMessage()); }
        try { estoque.buscar("P99");
        } catch (ProdutoNaoEncontradoException e) { System.out.println("Erro tratado: " + e.getMessage()); }

        estoque.adicionar(new Produto("P04", "Leite", 5.20));
        System.out.println("Programa continua: " + estoque.listar());
    }
}
