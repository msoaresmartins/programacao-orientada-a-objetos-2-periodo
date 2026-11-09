# AT-11-03-b · Coleções e exceções

Este exemplo usa o produto do estoque AlphaField, com código, nome e preço. A classe `Estoque` adiciona, lista, busca e remove produtos em memória. A classe `Main` executa a demonstração no terminal.

## Por que usar HashMap?

O `Estoque` usa um `HashMap<String, Produto>` em que a chave é o código do produto. Assim, a busca e a remoção acessam o item pela chave, e o cadastro pode verificar se ela já está em uso antes de inserir. A listagem retorna uma cópia dos valores em um `ArrayList`. A ordem dos produtos nessa lista pode variar.

## Erros tratados

| Situação | Exceção |
| --- | --- |
| Tentar cadastrar um produto com um código já usado | `IllegalArgumentException` |
| Informar código ou nome em branco ou preço negativo | `IllegalArgumentException` |
| Buscar ou remover um código que não existe no estoque | `ProdutoNaoEncontradoException` (exceção da atividade) |

As classes `Produto` e `Estoque` lançam as exceções. No teste, o `Main` usa `try/catch` para mostrar as mensagens e prosseguir com a execução.

## Como executar

Com o JDK 21, abra o terminal nesta pasta e rode:

```sh
javac -encoding UTF-8 *.java
java Main
```

No BlueJ, abra esta pasta como projeto, clique em **Compilar** e execute o método `void main(String[])` da classe `Main` com os argumentos vazios (`{}`).

## Resultado do teste

A execução inclui Arroz (`P01`) e Feijão (`P02`), lista os dois, busca o Arroz e remove o Feijão. Em seguida, tenta cadastrar um código duplicado, cadastrar um produto com preço negativo e buscar o código inexistente `P99`. Na última linha, o Leite (`P04`) aparece na lista, confirmando que o estoque continua aceitando cadastros após os erros.

![Saída do BlueJ com inclusão, listagem, busca, remoção, três erros tratados e novo cadastro](prints/02-execucao-e-erros-tratados.png)
