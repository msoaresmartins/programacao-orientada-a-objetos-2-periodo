import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private Database database;

    @Override public void start(Stage palco) throws Exception {
        database = new Database("alphafield.db");
        ProdutoRepository repositorio = new ProdutoRepository(database);
        palco.setTitle("AlphaField - Cadastro de produtos");
        palco.setScene(new ProdutoController(repositorio).criarTela());
        palco.show();
    }

    @Override public void stop() { if (database != null) database.close(); }
    public static void main(String[] args) { launch(args); }
}
