import java.util.Scanner;

public class TesteBateria
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        Bateria bateria1 = new Bateria("Li-Ion 5000", 75, 5000);
        Bateria bateria2 = new Bateria("NiMH 4000", 4000);
        Bateria bateria3 = new Bateria();
        
        System.out.println("SISTEMA DE GERENCIAMENTO DE BATERIAS");
        System.out.println();
        
        System.out.println("STATUS INICIAL");
        System.out.println();
        
        bateria1.exibirStatus();
        System.out.println();
        
        bateria2.exibirStatus();
        System.out.println();
        
        bateria3.exibirStatus();
        System.out.println();
        
        System.out.println("SIMULAÇÃO DE USO - Bateria Li-Ion 5000");
        System.out.println("Quantas operações deseja realizar?");
        int operacoes = entrada.nextInt();
        System.out.println();
        
        for(int i = 1; i <= operacoes; i++){
            
            double consumo = 5 + Math.random() * 15;
            System.out.println("Operação " + i + ": Consumindo " + consumo);
            bateria1.consumir(consumo);
            System.out.println("Nova carga: " + bateria1.getCargaAtual());
            boolean precisa = bateria1.precisaRecarregar();
            
            if(precisa){
                System.out.println("ALERTA: Bateria precisa recarregar!");
                bateria1.recarregar(30);
                System.out.println("Recarregando 30%");
                System.out.println("Nova carga: " + bateria1.getCargaAtual());
            }
            
            System.out.println();
        }
        
        System.out.println("TESTE - Bateria NiMH 4000");
        System.out.println("Consumindo 85%");
        bateria2.consumir(85);

        System.out.println("Nova carga: " + bateria2.getCargaAtual());
    
        boolean precisa2 = bateria2.precisaRecarregar();
        
        if(precisa2){
            System.out.println("ALERTA: Bateria precisa recarregar!");
            System.out.println("Recarregando até 100...");
            bateria2.recarregar(100);
        }
        
        System.out.println();
        System.out.println("STATUS FINAL");
        System.out.println();
        
        bateria1.exibirStatus();
        
        if(bateria1.estaCarregada()){
            System.out.println("Classificação: Bateria OK");
        } else if(bateria1.precisaRecarregar()){
            System.out.println("Classificação: Recarregue imediatamente!");
        } else {
            System.out.println("Classificação: Carga em nível aceitável");
        }
        
        System.out.println();
        
        bateria2.exibirStatus();
        
        if(bateria2.estaCarregada()){
            System.out.println("Classificação: Bateria OK");
        } else if(bateria2.precisaRecarregar()){
            System.out.println("Classificação: Recarregue imediatamente!");
        } else {
            System.out.println("Classificação: Carga em nível aceitável");
        }
        
        System.out.println();
        
        bateria3.exibirStatus();
        
        if(bateria3.estaCarregada()){
            System.out.println("Classificação: Bateria OK");
        } else if(bateria3.precisaRecarregar()){
            System.out.println("Classificação: Recarregue imediatamente!");
        } else {
            System.out.println("Classificação: Carga em nível aceitável");
        }
    }
}