# 27/10 - AT-10-27-1: Implementar ORM de uma classe Modelo do Projeto

Nome no Turing: **[LAB] AT-10-27-1: Implementar ORM de uma classe Modelo do Projeto (prazo até 02/11)**.

[Enunciado do professor](https://turing.inf.ufg.br/mod/forum/view.php?id=77433). Aulas 19 (TEO) e 20 (LAB), de 27/10: Projeto CRUD-MVC (Banco de Dados).

Escolhi a classe `Produto` do AlphaField, um projeto de controle de estoque para pequenas mercearias. Nesta parte, o cadastro fica salvo em um banco SQLite usando o ORMLite. Os testes foram feitos pelas chamadas de métodos no BlueJ.

## Organização

- `Produto.java`: dados do produto e mapeamento para a tabela `produtos`. O ID é gerado pelo banco e o código do produto não pode se repetir.
- `Database.java`: conexão com o arquivo `alphafield.db`.
- `ProdutoRepository.java`: métodos para cadastrar, consultar, atualizar e excluir produtos.
- `+libs/`: bibliotecas usadas pelo projeto.
- `prints/`: capturas dos testes, incluindo as imagens complementares.

## Testes do CRUD

### 1. Cadastrar (Create)

O primeiro produto foi o Arroz 5kg, código `P001`, preço de R$ 24,90, quantidade 12 e validade 31/12/2027. A chamada `produtoR1.create(produto1)` retornou um objeto `Produto`.

![Retorno do método create no BlueJ](prints/01-create.png)

O terminal também registra `Produto cadastrado! ID: 1`. Esse registro aparece junto com as mensagens dos outros testes na [captura do terminal](prints/complementares/04-delete-linha-excluida.png).

### 2. Consultar (Read)

A consulta `loadFromId(1)` retornou um produto, como mostra a [chamada por ID](prints/complementares/02-read-consulta-por-id.png). Ao chamar `toString()` no objeto retornado, apareceram os dados do Arroz 5kg, ainda com quantidade 12.

![Dados do produto P001 consultado](prints/02-read.png)

### 3. Atualizar (Update)

A quantidade do Arroz 5kg passou de 12 para 20. O método `update` informou que uma linha foi atualizada. Depois da atualização, a consulta mostrou o produto com a nova quantidade.

![Uma linha atualizada no banco](prints/complementares/03-update-linha-atualizada.png)

![Produto P001 com quantidade 20](prints/03-update.png)

### 4. Excluir (Delete)

O produto foi passado ao método `delete`, conforme a [captura da chamada](prints/complementares/04-delete-execucao.png). O terminal informou `Produtos excluidos: 1`.

![Mensagens dos testes no terminal, incluindo a exclusão](prints/complementares/04-delete-linha-excluida.png)

Depois, `loadFromId(1)` retornou `null`, ou seja, o registro não foi encontrado na nova consulta.

![Consulta do ID 1 retornando null](prints/04-delete.png)

## Teste de persistência

Para esse teste, o produto usado foi o Feijao 1kg, código `P002`, preço de R$ 8,50, quantidade 15 e validade 15/10/2027. O cadastro recebeu o ID 2.

![Dados do segundo produto](prints/complementares/05-persistencia-cadastro-p002.png)

![ID 2 do produto cadastrado](prints/complementares/05-persistencia-id2.png)

Na sequência registrada para a reabertura do projeto, aparecem a conexão configurada e a tabela pronta. Em seguida, a consulta usa o ID 2 e o resultado mostra os mesmos dados do Feijao 1kg.

![Conexão e tabela prontas no projeto reaberto](prints/complementares/05-persistencia-reabertura-conexao.png)

![Consulta pelo ID 2](prints/complementares/05-persistencia-consulta-id2.png)

![Dados do produto P002 recuperado](prints/05-persistencia.png)

Essas capturas registram a consulta do produto salvo. O fechamento e a reabertura do BlueJ fazem parte do relato do teste; uma imagem isolada não mostra essa passagem inteira.

## Como abrir no BlueJ

1. Abra a pasta do projeto, que contém `package.bluej` e a pasta `+libs`.
2. Compile as três classes.
3. Crie um objeto `Database` com o nome `"alphafield.db"` e um `ProdutoRepository` passando esse objeto.
4. Crie um `Produto` e use os métodos `create`, `loadFromId`, `loadAll`, `update` e `delete` do repositório.

O campo de validade recebe uma data. Um exemplo é `java.sql.Date.valueOf("2027-12-31")`. Use o ID retornado no seu cadastro nas consultas, pois ele pode ser diferente dos IDs dos prints. Para repetir o teste de persistência, reabra a mesma pasta e use o mesmo arquivo de banco.

As bibliotecas da pasta `+libs` são ORMLite 6.1, SQLite JDBC 3.46.0.0 e SLF4J 2.0.13.

## Sobre os prints

As imagens foram mantidas como vieram no ZIP. O arquivo complementar `01-create-id-gerado.png` mostra o ID 2, apesar do nome; por isso ele não foi usado como evidência do ID 1.

Referência: [tutorial de ORM com Java, ORMLite e SQLite](https://github.com/marceloakira/tutorials/blob/main/orm/README.md).
