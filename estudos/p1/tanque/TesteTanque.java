import java.util.Scanner;

public class TesteTanque {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Tanque tanque1 = new Tanque("Carro A", 60);
        Tanque tanque2 = new Tanque();
        
        System.out.println("Quantas viagens o Carro A, com tanque em nível 60, realizará?");
        int viagens = entrada.nextInt();
        
        for (int i=1; i <= viagens; i++) {
            double consumo = 5 + (10.0* Math.random());
            
            tanque1.consumir(consumo);
            
            if (tanque1.precisaAbastecer()) {
                System.out.println("Abasteça o veículo");
            } else {
                System.out.println("Nível suficiente. O veículo está em " + tanque1.getNivel() + "%.");
            }
        }
        
        System.out.println("Nível tanque Carro A: " + tanque1.getNivel() + "%.");
        System.out.println("Nível tanque Carro Genérico: " + tanque2.getNivel() + "%.");
    }
}