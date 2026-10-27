# 13/10 - AT-10-13: Interface do Projeto

Nome no Turing: **[TEO+LAB] AT-10-13: Interface do Projeto (prazo até 19/10)**.

[Enunciado do professor](https://turing.inf.ufg.br/mod/forum/view.php?id=77287).

Continuei o exemplo dos ninjas. `Naruto` e `Sasuke` herdam de `Ninja` e implementam a interface `Jutsu`, que declara o método `usarJutsu()`.

No `Programa`, os quatro objetos ficam em um array do tipo `Jutsu`. O laço chama o mesmo método para todos, mas cada objeto executa a implementação da sua classe. Isso é polimorfismo: o programa trabalha com a interface sem precisar separar os tipos de ninja.

## Saída

```text
Naruto Uzumaki usa Rasengan!!
Sasuke Uchiha usa Chidori!!
Naruto Modo Sábio usa Rasengan!!
Sasuke Sharingan usa Chidori!!
```

Compile as cinco classes e execute `Programa`.

[Minha entrega no Turing](https://turing.inf.ufg.br/mod/forum/discuss.php?d=15924#p28685).
