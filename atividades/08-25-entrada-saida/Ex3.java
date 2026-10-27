import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o capital inicial:");
        double C = entrada.nextDouble();
        System.out.println("Digite a taxa de juros em decimal:");
        double i = entrada.nextDouble();
        System.out.println("Digite o tempo em meses:");
        double t = entrada.nextDouble();
        double M = C*Math.pow(1 + i, t); 
        System.out.printf("O montante final e: R$ %.2f%n", M);
    }
}