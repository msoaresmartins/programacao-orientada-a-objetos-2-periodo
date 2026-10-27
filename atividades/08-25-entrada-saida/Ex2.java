import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero quebrado para ele ser arredondado:");
        double num = leitor.nextDouble();
        double numArredondado = Math.round(num);
        System.out.println("O resultado e: " + numArredondado);
    }
}