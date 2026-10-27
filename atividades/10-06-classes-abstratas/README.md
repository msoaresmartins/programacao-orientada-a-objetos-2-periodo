# Classes abstratas - 06/10

Criei a classe abstrata `Ninja`, com o método abstrato `usarJutsu()`. `Naruto` e `Sasuke` são as subclasses e cada uma implementa um jutsu diferente.

O `Programa` cria os dois objetos usando referências do tipo `Ninja` e chama seus métodos.

## Questão respondida

Uma classe abstrata não pode ser instanciada diretamente, mas uma referência desse tipo pode apontar para um objeto de uma subclasse concreta. Por isso, um método pode receber uma `Conta` e trabalhar com uma `ContaPoupanca` ou outra subclasse. A mesma ideia aparece no exemplo dos ninjas.

Para testar, compile as quatro classes e execute `Programa`.

[Minha entrega no Turing](https://turing.inf.ufg.br/mod/forum/discuss.php?d=15860#p28593).
