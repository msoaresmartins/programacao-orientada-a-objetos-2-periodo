import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        Ninja ninja1 = new Ninja();
        ninja1.nome = "Naruto";
        ninja1.chakra = 200;
        ninja1.nivel = 5;

        Ninja ninja2 = new Ninja();
        ninja2.nome = "Sasuke";
        ninja2.chakra = 80;
        ninja2.nivel = 7;

        System.out.println();
        System.out.println("ANTES DO TREINO");
        System.out.println("Nome: " + ninja1.nome);
        System.out.println("Chakra: " + ninja1.chakra);
        System.out.println("Nivel: " + ninja1.nivel);

        ninja1.treinar();

        System.out.println();
        System.out.println("DEPOIS DO TREINO");
        System.out.println("Nome: " + ninja1.nome);
        System.out.println("Chakra: " + ninja1.chakra);
        System.out.println("Nivel: " + ninja1.nivel);

        System.out.println();
        System.out.println("ANTES DE DESCANSAR");
        System.out.println("Nome: " + ninja2.nome);
        System.out.println("Chakra: " + ninja2.chakra);
        System.out.println("Nivel: " + ninja2.nivel);

        ninja2.descansar();

        System.out.println();
        System.out.println("DEPOIS DE DESCANSAR");
        System.out.println("Nome: " + ninja2.nome);
        System.out.println("Chakra: " + ninja2.chakra);
        System.out.println("Nivel: " + ninja2.nivel);


        System.out.println();
        System.out.println("CRIE SEU NINJA");

        Ninja ninja3 = new Ninja();

        System.out.print("Nome: ");
        ninja3.nome = entrada.nextLine();

        System.out.print("Nivel: ");
        ninja3.nivel = entrada.nextInt();

        System.out.print("Chakra: ");
        ninja3.chakra = entrada.nextInt();

        System.out.println();
        System.out.println("NINJA CRIADO");
        System.out.println("Nome: " + ninja3.nome);
        System.out.println("Chakra: " + ninja3.chakra);
        System.out.println("Nivel: " + ninja3.nivel);

        entrada.close();
    }
}