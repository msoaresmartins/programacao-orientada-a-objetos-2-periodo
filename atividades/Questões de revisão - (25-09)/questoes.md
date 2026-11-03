# Questões para a P1

## 1) Sobre alguns conceitos básicos de Java, marque cada alternativa como verdadeira
(V) ou falsa (F).

a) Um código feito em Java normalmente é salvo em um arquivo com a extensão .java.

b) O javac é o compilador do Java e pode transformar o código em bytecode.

c) Depois de compilar um programa Java, normalmente é criado um arquivo com a
extensão .class.

d) A JVM é responsável por executar o bytecode do programa.

e) O JDK possui ferramentas usadas para programar em Java, como o compilador javac.

## 2) Sobre variáveis e estruturas de controle em Java, marque cada alternativa como
verdadeira (V) ou falsa (F).

a) O tipo int é usado para guardar textos, como o nome de uma pessoa.

b) Uma variável boolean pode receber valores como 1, 5 ou 10.

c) O if e o else são usados para repetir um trecho do programa várias vezes.

d) O for não possui nenhuma condição para controlar até quando deve repetir.

e) O comando break faz o laço continuar até terminar todas as repetições.

## 3) Sobre entrada e saída de dados em Java, marque cada alternativa como verdadeira
(V) ou falsa (F).

a) Scanner entrada = new Scanner(System.in); pode ser usado para receber informações
digitadas pelo usuário.

b) O método entrada.nextInt() é usado para ler uma frase digitada pelo usuário.

c) System.out.println() mostra uma informação no terminal e depois passa para a próxima
linha.

d) Math.random() sempre gera o mesmo valor quando o programa é executado.

e) O método entrada.nextLine() pode ser usado para ler um texto digitado pelo usuário.

## 4) Observe esse trecho do programa que utiliza a classe Ninja:

```java
Ninja ninja1 = new Ninja();
Ninja ninja2 = new Ninja();
ninja1.treinar();
```
Sobre esse código, marque cada alternativa como verdadeira (V) ou falsa (F).

a) ninja1 e ninja2 são o mesmo objeto, pois os dois foram criados usando a classe Ninja.

b) new Ninja() serve apenas para dar um nome à variável e não cria nenhum objeto.

c) Quando ninja1.treinar() é executado, quem realiza o método treinar() é o ninja2.

d) Como ninja1 e ninja2 foram criados pela mesma classe, os valores dos atributos dos dois
sempre serão iguais.

e) Depois que um objeto Ninja é criado, não é possível criar outro objeto da mesma classe.

## 5) Considere o código abaixo:
```java
public class Ninja
{
private String nome;
private int chakra;
private static int totalNinjas;
public Ninja()
{
totalNinjas++;
}
public void setNome(String nome)
{
this.nome = nome;
}
public String getNome()
{
return nome;
}
public static int getTotalNinjas()
{
return totalNinjas;
}
}
```

Sobre esse código, marque cada alternativa como verdadeira (V) ou falsa (F).


a) Como o atributo nome é private, ele não pode ser acessado diretamente por outra classe.

b) O método setNome() pode ser usado para mudar o nome de um objeto Ninja.

c) O método getNome() retorna o valor que está guardado no atributo nome.

d) Como totalNinjas é static, esse valor é compartilhado pelos objetos da classe Ninja.

e) Toda vez que o construtor Ninja() é chamado, totalNinjas++ aumenta o valor de
totalNinjas em 1.
