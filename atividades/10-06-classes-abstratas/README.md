# 06/10 - AT-10-06-3: Classe Abstrata do Projeto

[TEO+LAB] · Prazo: 12/10 · [Enunciado no Turing](https://turing.inf.ufg.br/mod/forum/view.php?id=77232)

`Ninja` é a classe abstrata. `Naruto` e `Sasuke` herdam dela e cada um tem sua versão de `usarJutsu()`.

O `Programa` cria os dois objetos usando referências do tipo `Ninja` e chama seus métodos.

## Questão respondida

Não dá para criar um objeto diretamente de uma classe abstrata. Dá para usar uma referência dela para guardar um objeto da subclasse. Por exemplo, uma variável `Conta` pode receber uma `ContaPoupanca`. No código, isso acontece com `Ninja`, `Naruto` e `Sasuke`.

Para testar, compile as quatro classes e execute `Programa`.

[Minha entrega no Turing](https://turing.inf.ufg.br/mod/forum/discuss.php?d=15860#p28593).
