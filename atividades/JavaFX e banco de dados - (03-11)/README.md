# AT-11-03: AlphaField JavaFX

Tela em JavaFX para listar e cadastrar produtos do AlphaField. Cada produto tem código, nome, preço, quantidade e validade. `ProdutoView` monta a tela, `ProdutoController` trata os botões e `ProdutoRepository` salva os dados em SQLite com ORMLite.

## Executar

Com JDK 21 e Maven, nesta pasta execute `mvn javafx:run`. O arquivo `alphafield.db` é criado no diretório de execução. Cadastre um produto, feche e abra novamente para conferir a persistência.

## Capturas

Tela antes do cadastro:

![Tabela vazia](prints/01-lista-inicial.png)

Produto cadastrado pelo botão da tela:

![Produto cadastrado](prints/02-produto-cadastrado.png)

Produto recuperado após reabrir o banco:

![Produto recuperado](prints/03-persistencia-apos-reabrir.png)
