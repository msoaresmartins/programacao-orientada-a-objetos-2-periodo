import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o x1:");
        double x1 = leitor.nextDouble();
        System.out.println("Digite o y1:");
        double y1 = leitor.nextDouble();
        System.out.println("Digite o x2:");
        double x2 = leitor.nextDouble();
        System.out.println("Digite o y2:");
        double y2 = leitor.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distancia entre os pontos e: " + distancia);
    }
}