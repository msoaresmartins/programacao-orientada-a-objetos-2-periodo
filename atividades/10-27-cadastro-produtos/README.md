# 27/10 - AT-10-27-1: Implementar ORM de uma classe Modelo do Projeto

[LAB] · Prazo: 02/11 · [Enunciado no Turing](https://turing.inf.ufg.br/mod/forum/view.php?id=77433)

Usei a classe `Produto` do AlphaField, um projeto de estoque para pequenas mercearias. O cadastro fica salvo no SQLite com ORMLite. Os testes abaixo foram feitos chamando os métodos pelo BlueJ.

## Arquivos

- `Produto.java`: dados do produto e tabela `produtos`. O ID é automático e o código não pode se repetir.
- `Database.java`: abre a conexão com `alphafield.db`.
- `ProdutoRepository.java`: faz o cadastro, a consulta, a atualização e a exclusão.
- `+libs/`: bibliotecas do projeto.
- `prints/`: capturas dos testes.

## Testes do CRUD

### 1. Cadastrar (Create)

Cadastrei o Arroz 5kg (`P001`), com preço de R$ 24,90, quantidade 12 e validade 31/12/2027. O método `create(produto1)` retornou o produto.

![Retorno do método create no BlueJ](prints/01-create.png)

O cadastro recebeu o ID 1, como aparece no [terminal](prints/complementares/04-delete-linha-excluida.png).

### 2. Consultar (Read)

Consultei o [ID 1 com `loadFromId(1)`](prints/complementares/02-read-consulta-por-id.png). O `toString()` mostrou o Arroz 5kg com os dados cadastrados e quantidade 12.

![Dados do produto P001 consultado](prints/02-read.png)

### 3. Atualizar (Update)

Mudei a quantidade de 12 para 20 e chamei `update`. O terminal informou uma linha atualizada. Na nova consulta, a quantidade já era 20.

![Uma linha atualizada no banco](prints/complementares/03-update-linha-atualizada.png)

![Produto P001 com quantidade 20](prints/03-update.png)

### 4. Excluir (Delete)

Chamei [`delete` passando o produto](prints/complementares/04-delete-execucao.png). O terminal mostrou `Produtos excluidos: 1`.

![Mensagens dos testes no terminal, incluindo a exclusão](prints/complementares/04-delete-linha-excluida.png)

Depois, a consulta do ID 1 retornou `null`: o produto não estava mais no banco.

![Consulta do ID 1 retornando null](prints/04-delete.png)

## Teste de persistência

Cadastrei outro produto: Feijao 1kg (`P002`), preço de R$ 8,50, quantidade 15 e validade 15/10/2027. Ele recebeu o ID 2.

![Dados do segundo produto](prints/complementares/05-persistencia-cadastro-p002.png)

![ID 2 do produto cadastrado](prints/complementares/05-persistencia-id2.png)

Na sequência do teste após reabrir o projeto, criei a conexão novamente e consultei o ID 2. Os dados do Feijao 1kg continuaram salvos.

![Conexão e tabela prontas no projeto reaberto](prints/complementares/05-persistencia-reabertura-conexao.png)

![Consulta pelo ID 2](prints/complementares/05-persistencia-consulta-id2.png)

![Dados do produto P002 recuperado](prints/05-persistencia.png)

O fechamento do BlueJ foi relatado durante o teste. Os prints mostram a conexão e a consulta feitas depois.

## Como abrir no BlueJ

1. Abra a pasta do projeto, que contém `package.bluej` e a pasta `+libs`.
2. Compile as três classes.
3. Crie um objeto `Database` com o nome `"alphafield.db"` e um `ProdutoRepository` passando esse objeto.
4. Crie um `Produto` e use os métodos `create`, `loadFromId`, `loadAll`, `update` e `delete` do repositório.

Para preencher a validade, use uma data como `java.sql.Date.valueOf("2027-12-31")`. Nas consultas, use o ID que o seu cadastro recebeu. Para testar a persistência, reabra a mesma pasta com o mesmo banco.

As bibliotecas da pasta `+libs` são ORMLite 6.1, SQLite JDBC 3.46.0.0 e SLF4J 2.0.13.

Os prints estão como vieram no ZIP. Obs.: `01-create-id-gerado.png` mostra o ID 2; o registro do ID 1 está na captura do terminal usada acima.

Referência: [tutorial de ORM com Java, ORMLite e SQLite](https://github.com/marceloakira/tutorials/blob/main/orm/README.md).
