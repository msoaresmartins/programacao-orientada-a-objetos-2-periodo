import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;

public class ProdutoView {
    final TableView<Produto> tabela = new TableView<>();
    final TextField codigo = new TextField();
    final TextField nome = new TextField();
    final TextField preco = new TextField();
    final TextField quantidade = new TextField();
    final DatePicker validade = new DatePicker();
    final Label mensagem = new Label();
    final Button cadastrar = new Button("Cadastrar produto");
    final Button atualizar = new Button("Atualizar lista");

    private <T> TableColumn<Produto, T> coluna(String titulo, String propriedade) {
        TableColumn<Produto, T> coluna = new TableColumn<>(titulo);
        coluna.setCellValueFactory(new PropertyValueFactory<>(propriedade));
        return coluna;
    }

    public Scene criarTela() {
        codigo.setId("codigo"); nome.setId("nome"); preco.setId("preco"); quantidade.setId("quantidade");
        tabela.getColumns().addAll(coluna("Código", "codigo"), coluna("Nome", "nome"),
                coluna("Preço", "preco"), coluna("Quantidade", "quantidade"), coluna("Validade", "validade"));
        tabela.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        GridPane formulario = new GridPane();
        formulario.setHgap(10); formulario.setVgap(8);
        formulario.addRow(0, new Label("Código:"), codigo, new Label("Nome:"), nome);
        formulario.addRow(1, new Label("Preço:"), preco, new Label("Quantidade:"), quantidade);
        formulario.addRow(2, new Label("Validade:"), validade);
        cadastrar.setId("cadastrar");
        HBox botoes = new HBox(10, cadastrar, atualizar, mensagem);
        VBox raiz = new VBox(12, new Label("AlphaField - Estoque"), tabela, formulario, botoes);
        raiz.setPadding(new Insets(16));
        return new Scene(raiz, 850, 520);
    }
}
