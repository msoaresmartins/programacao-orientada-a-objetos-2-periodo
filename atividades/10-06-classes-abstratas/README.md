# Classes abstratas

`Ninja` é a classe abstrata. `Naruto` e `Sasuke` herdam dela e cada um tem sua versão de `usarJutsu()`.

O `Programa` cria os dois objetos usando referências do tipo `Ninja` e chama seus métodos.

## Questão respondida

Não dá para criar um objeto diretamente de uma classe abstrata. Dá para usar uma referência dela para guardar um objeto da subclasse. Por exemplo, uma variável `Conta` pode receber uma `ContaPoupanca`. No código, isso acontece com `Ninja`, `Naruto` e `Sasuke`.

Para testar, compile as quatro classes e execute `Programa`.
