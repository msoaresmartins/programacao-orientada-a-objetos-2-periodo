import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        Ninja ninja1 = new Ninja();

        System.out.println("Digite o nome do seu ninja 2:");
        String nome2 = entrada.nextLine();
        
        Ninja ninja2 = new Ninja(nome2);
        System.out.println();
        
        System.out.println("Digite o nome do seu ninja 3:");
        String nome3 = entrada.nextLine();

        System.out.println("Digite o chakra do seu ninja 3:");
        int chakra3 = entrada.nextInt();

        System.out.println("Digite o nivel do seu ninja 3:");
        int nivel3 = entrada.nextInt();

        Ninja ninja3 = new Ninja(nome3, chakra3, nivel3);
        System.out.println();

        System.out.println("O total de ninjas até agora é " + Ninja.getTotalNinjas());
        System.out.println();
        
        System.out.println("Agora, o Ninja 1 está treinando e o Ninja 2 descansando");
        System.out.println("Como o Ninja 1 foi criado por um construtor sem parâmetros, ele não tem chakra suficiente para treinar");
        
        ninja1.treinar();
        ninja2.descansar();
        
        System.out.println("Nível Ninja 1: " + ninja1.getNivel());
        System.out.println("Chakra Ninja 1: " + ninja1.getChakra());
        System.out.println("Chakra Ninja 2: " + ninja2.getChakra());
        System.out.println();
        
        System.out.println("Agora, o Ninja 1 vai começar um treino de 3 rodadas ");
        System.out.println();
        
        for (int i = 1; i <= 3; i++){
            
            double j = Math.random()*100;
            System.out.println("Rodada " + i);
            
            if(j <=50) {
                ninja1.treinar();
                System.out.println("Nivel atual: " + ninja1.getNivel());
                System.out.println("Chakra atual: " + ninja1.getChakra());
            } else {
                ninja1.descansar();
                System.out.println("O ninja precisou descansar primeiro");
            }
        }
    }
}