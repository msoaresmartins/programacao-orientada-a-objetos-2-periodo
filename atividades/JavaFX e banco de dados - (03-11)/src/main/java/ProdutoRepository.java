
import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;

public class ProdutoRepository {

    private Dao<Produto, Integer> dao;

    public ProdutoRepository(Database database)
            throws SQLException {

        dao = DaoManager.createDao(
            database.getConnection(), Produto.class);

        TableUtils.createTableIfNotExists(
            database.getConnection(), Produto.class);

        System.out.println("Tabela produtos pronta!");
    }

    // CREATE - Cadastrar produto
    public Produto create(Produto produto)
            throws SQLException {

        dao.create(produto);

        System.out.println(
            "Produto cadastrado! ID: " + produto.getId());

        return produto;
    }

    // READ - Consultar por ID
    public Produto loadFromId(int id)
            throws SQLException {

        return dao.queryForId(id);
    }

    // READ - Listar todos os produtos
    public List<Produto> loadAll()
            throws SQLException {

        return dao.queryForAll();
    }

    // UPDATE - Atualizar produto
    public void update(Produto produto)
            throws SQLException {

        int linhas = dao.update(produto);

        System.out.println(
            "Produtos atualizados: " + linhas);
    }

    // DELETE - Excluir produto
    public void delete(Produto produto)
            throws SQLException {

        int linhas = dao.delete(produto);

        System.out.println(
            "Produtos excluidos: " + linhas);
    }
}
