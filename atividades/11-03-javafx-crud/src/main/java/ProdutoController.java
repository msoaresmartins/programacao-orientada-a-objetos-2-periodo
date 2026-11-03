import java.sql.SQLException;
import java.sql.Date;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;

public class ProdutoController {
    private final ProdutoRepository repositorio;
    private final TableView<Produto> tabela = new TableView<>();
    private final TextField codigo = new TextField();
    private final TextField nome = new TextField();
    private final TextField preco = new TextField();
    private final TextField quantidade = new TextField();
    private final DatePicker validade = new DatePicker();
    private final Label mensagem = new Label();

    public ProdutoController(ProdutoRepository repositorio) { this.repositorio = repositorio; }

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
        Button cadastrar = new Button("Cadastrar produto");
        cadastrar.setId("cadastrar");
        cadastrar.setOnAction(evento -> cadastrar());
        Button atualizar = new Button("Atualizar lista");
        atualizar.setOnAction(evento -> carregar());
        HBox botoes = new HBox(10, cadastrar, atualizar, mensagem);
        VBox raiz = new VBox(12, new Label("AlphaField - Estoque"), tabela, formulario, botoes);
        raiz.setPadding(new Insets(16));
        carregar();
        return new Scene(raiz, 850, 520);
    }

    private void carregar() {
        try {
            tabela.setItems(FXCollections.observableArrayList(repositorio.loadAll()));
            mensagem.setText("Produtos: " + tabela.getItems().size());
        } catch (SQLException e) { mensagem.setText("Erro ao consultar o banco: " + e.getMessage()); }
    }

    private void cadastrar() {
        try {
            String cod = codigo.getText().trim();
            String nom = nome.getText().trim();
            if (cod.isEmpty() || nom.isEmpty()) throw new IllegalArgumentException("Informe código e nome.");
            double valor = Double.parseDouble(preco.getText().trim().replace(',', '.'));
            int qtd = Integer.parseInt(quantidade.getText().trim());
            if (valor < 0 || qtd < 0) throw new IllegalArgumentException("Preço e quantidade devem ser positivos.");
            for (Produto produto : repositorio.loadAll())
                if (produto.getCodigo().equals(cod)) throw new IllegalArgumentException("Código já cadastrado.");
            Date data = validade.getValue() == null ? null : Date.valueOf(validade.getValue());
            repositorio.create(new Produto(cod, nom, valor, qtd, data));
            codigo.clear(); nome.clear(); preco.clear(); quantidade.clear(); validade.setValue(null);
            carregar();
            mensagem.setText("Produto cadastrado com sucesso.");
        } catch (NumberFormatException e) { mensagem.setText("Preço ou quantidade em formato inválido.");
        } catch (IllegalArgumentException e) { mensagem.setText(e.getMessage());
        } catch (SQLException e) { mensagem.setText("Erro ao salvar no banco: " + e.getMessage()); }
    }
}
