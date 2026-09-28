import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        Ninja ninja1 = new Ninja();
        Ninja ninja2 = new Ninja();
        
        System.out.println("Digite o nome do Ninja 1:");
        ninja1.setNome(entrada.nextLine());
        
        System.out.println("Digite o chakra do Ninja 1:");
        ninja1.setChakra(entrada.nextInt());
        
        System.out.println("Digite o nivel do Ninja 1:");
        ninja1.setNivel(entrada.nextInt());
        
        entrada.nextLine();
        
        System.out.println("Nome Ninja 1: " + ninja1.getNome());
        System.out.println("Chakra Ninja 1: " + ninja1.getChakra());
        System.out.println("Nível Ninja 1: " + ninja1.getNivel());
        System.out.println();

        System.out.println("Digite o nome do Ninja 2:");
        ninja2.setNome(entrada.nextLine());
        
        System.out.println("Digite o chakra do Ninja 2:");
        ninja2.setChakra(entrada.nextInt());
        
        System.out.println("Digite o nivel do Ninja 2:");
        ninja2.setNivel(entrada.nextInt());
        
        entrada.nextLine();
        
        System.out.println("Nome Ninja 2: " + ninja2.getNome());
        System.out.println("Chakra Ninja 2: " + ninja2.getChakra());
        System.out.println("Nível Ninja 2: " + ninja2.getNivel());
        System.out.println();
        
        System.out.println("Agora, o Ninja 1 está treinando e o Ninja 2 descansando");
        System.out.println();
        
        ninja1.treinar();
        ninja2.descansar();
        
        System.out.println("Nome Ninja 1: " + ninja1.getNome());
        System.out.println("Chakra Ninja 1: " + ninja1.getChakra());
        System.out.println("Nível Ninja 2: " + ninja2.getNivel());
        System.out.println();
    }
}