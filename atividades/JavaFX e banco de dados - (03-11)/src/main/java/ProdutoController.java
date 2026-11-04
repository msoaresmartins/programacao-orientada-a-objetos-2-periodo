import java.sql.SQLException;
import java.sql.Date;
import javafx.collections.FXCollections;
import javafx.scene.Scene;

public class ProdutoController {
    private final ProdutoRepository repositorio;
    private final ProdutoView view = new ProdutoView();

    public ProdutoController(ProdutoRepository repositorio) { this.repositorio = repositorio; }

    public Scene criarTela() {
        Scene cena = view.criarTela();
        view.cadastrar.setOnAction(evento -> cadastrar());
        view.atualizar.setOnAction(evento -> carregar());
        carregar();
        return cena;
    }

    private void carregar() {
        try {
            view.tabela.setItems(FXCollections.observableArrayList(repositorio.loadAll()));
            view.mensagem.setText("Produtos: " + view.tabela.getItems().size());
        } catch (SQLException e) { view.mensagem.setText("Erro ao consultar o banco: " + e.getMessage()); }
    }

    private void cadastrar() {
        try {
            String cod = view.codigo.getText().trim();
            String nom = view.nome.getText().trim();
            if (cod.isEmpty() || nom.isEmpty()) throw new IllegalArgumentException("Informe código e nome.");
            double valor = Double.parseDouble(view.preco.getText().trim().replace(',', '.'));
            int qtd = Integer.parseInt(view.quantidade.getText().trim());
            if (valor < 0 || qtd < 0) throw new IllegalArgumentException("Preço e quantidade devem ser positivos.");
            for (Produto produto : repositorio.loadAll())
                if (produto.getCodigo().equals(cod)) throw new IllegalArgumentException("Código já cadastrado.");
            Date data = view.validade.getValue() == null ? null : Date.valueOf(view.validade.getValue());
            repositorio.create(new Produto(cod, nom, valor, qtd, data));
            view.codigo.clear(); view.nome.clear(); view.preco.clear(); view.quantidade.clear(); view.validade.setValue(null);
            carregar();
            view.mensagem.setText("Produto cadastrado com sucesso.");
        } catch (NumberFormatException e) { view.mensagem.setText("Preço ou quantidade em formato inválido.");
        } catch (IllegalArgumentException e) { view.mensagem.setText(e.getMessage());
        } catch (SQLException e) { view.mensagem.setText("Erro ao salvar no banco: " + e.getMessage()); }
    }
}
