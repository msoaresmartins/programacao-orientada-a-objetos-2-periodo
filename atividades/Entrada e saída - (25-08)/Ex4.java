import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da força:");
        double F = leitor.nextDouble();
        System.out.println("Digite a distância percorrida em metros:");
        double d = leitor.nextDouble();
        System.out.println("Digite o ângulo em graus:");
        double angulo = leitor.nextDouble();
        double radiano = Math.toRadians(angulo);
        double trabalho = F*d*Math.cos(radiano);
        System.out.printf("O trabalho realizado e: %.2f Joules%n", trabalho);
    }
}