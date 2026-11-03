import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o raio?");
        double raio = leitor.nextDouble();
        double circunferencia = 2*Math.PI*raio;
        System.out.printf("O valor da circunferencia e: %.2f%n", circunferencia);
    }
}