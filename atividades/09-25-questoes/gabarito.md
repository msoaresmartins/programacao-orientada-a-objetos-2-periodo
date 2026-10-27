# Gabarito comentado

## 1) V - V - V - V - V

a) Verdadeira. Um programa escrito em Java normalmente é salvo em um arquivo com a
extensão .java. Esse é o arquivo que contém o código-fonte.

b) Verdadeira. O javac é o compilador do Java. Ele é utilizado para compilar o código que
escrevemos e gerar o bytecode.

c) Verdadeira. Após a compilação do código Java, normalmente é gerado um arquivo .class,
que contém o bytecode.

d) Verdadeira. A JVM, que significa Java Virtual Machine, é responsável pela execução do
bytecode gerado na compilação.

e) Verdadeira. O JDK é o kit utilizado para desenvolver em Java e possui ferramentas como
o compilador javac.
Indicação do material de referência: Alura - O que é Java.

## 2) F - F - F - F - F

a) Falsa. O tipo int é utilizado para armazenar números inteiros. Para armazenar um texto,
podemos utilizar String.

b) Falsa. Uma variável boolean não recebe números. Ela pode armazenar somente os
valores true ou false.

c) Falsa. O if e o else não são estruturas de repetição. Eles são utilizados para decidir qual
trecho do programa será executado dependendo de uma condição.

d) Falsa. O for pode possuir uma condição que controla até quando o laço deve continuar.
Por exemplo, no código for (int i = 1; i <= 3; i++), a condição é i <= 3.

e) Falsa. O break faz o contrário do que a frase afirma. Ele pode ser utilizado para
interromper a execução de um laço antes que todas as repetições sejam feitas.
Indicação do material de referência: Alura - Variáveis Primitivas e Controle de Fluxo.

## 3) V - F - V - F - V

a) Verdadeira. A instrução Scanner entrada = new Scanner(System.in); cria um objeto
Scanner que pode ser usado para receber dados digitados pelo usuário.


b) Falsa. O nextInt() é utilizado para ler um valor do tipo int e não uma frase. Para ler uma
linha de texto, pode ser utilizado o nextLine().

c) Verdadeira. System.out.println() mostra uma informação no console e, depois dela, faz
uma quebra de linha.

d) Falsa. Math.random() não retorna sempre o mesmo valor. Ele é utilizado para gerar
valores aleatórios durante a execução do programa.

e) Verdadeira. O método nextLine() pode ser utilizado com Scanner para ler uma linha de
texto digitada pelo usuário.
Indicação do material de referência: Conteúdo Acessível - Entrada e saída padrão em Java.
e Classe Math.

## 4) F - F - F - F - F

a) Falsa. ninja1 e ninja2 não são o mesmo objeto. Foram utilizados dois comandos new
Ninja(), então foram criados dois objetos diferentes.

b) Falsa. A expressão new Ninja() é utilizada para criar uma nova instância da classe Ninja.

c) Falsa. Ao escrever ninja1.treinar(), o método treinar() será chamado no objeto que é
referenciado por ninja1 e não em ninja2.

d) Falsa. Dois objetos podem ser criados a partir da mesma classe e possuir valores
diferentes em seus atributos. A classe define quais atributos eles possuem, mas cada objeto
pode guardar seus próprios valores.

e) Falsa. Uma mesma classe pode ser utilizada para criar vários objetos. Cada utilização do
new pode criar uma nova instância da classe.
Indicação do material de referência: Alura - Orientação a Objetos Básica.

## 5) V - V - V - V - V

a) Verdadeira. Quando um atributo é declarado como private, ele não pode ser acessado
diretamente por outra classe.

b) Verdadeira. Como nome é private, o método público setNome() pode ser utilizado para
modificar o valor desse atributo.

c) Verdadeira. O método getNome() possui return nome;, então ele devolve o valor que está
armazenado no atributo nome.

d) Verdadeira. O modificador static faz com que totalNinjas seja um atributo da classe e não
uma cópia diferente para cada objeto. Dessa forma, o valor é compartilhado.


e) Verdadeira. No construtor Ninja() existe a instrução totalNinjas++. Por isso, cada vez que
esse construtor é executado, o valor de totalNinjas aumenta em uma unidade.
Indicação do material de referência: Alura - Modificadores de Acesso e Atributos de Classe.
