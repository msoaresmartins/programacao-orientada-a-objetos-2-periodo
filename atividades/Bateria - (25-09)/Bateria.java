public class Bateria
{
    private String modelo;
    private double cargaAtual;
    private int capacidadeMah;
    private static final double CARGA_MINIMA = 20.0;
    
    public Bateria(String modelo, double cargaAtual, int capacidadeMah) {
        this.modelo = modelo;
        this.cargaAtual = cargaAtual;
        this.capacidadeMah = capacidadeMah;
    }
    
    public Bateria(String modelo, int capacidadeMah) {
        this.modelo = modelo;
        this.capacidadeMah = capacidadeMah;
        this.cargaAtual = 100;
    }
    
    public Bateria() {
        modelo = "Genérica";
        capacidadeMah = 3000;
        cargaAtual = 100;
    }
    
    public String getModelo(){ return modelo; }
    public double getCargaAtual(){ return cargaAtual;  }
    public int getCapacidadeMah(){return capacidadeMah; }
    public static double getCargaMinima(){ return CARGA_MINIMA;}
    
    public void setCargaAtual(double cargaAtual){ this.cargaAtual = cargaAtual;}
    
    public void consumir(double percentual){
        cargaAtual = cargaAtual - percentual;
        
        if(cargaAtual < 0){
            cargaAtual = 0;
        }
    }
    
    public void recarregar(double percentual){
        cargaAtual = cargaAtual + percentual;
        
        if(cargaAtual > 100){
            cargaAtual = 100;
        }
    }
    
    public boolean estaCarregada(){
        if(cargaAtual > 80){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean precisaRecarregar(){
        if(cargaAtual < CARGA_MINIMA){
            return true;
        } else {
            return false;
        }
    }
    
    public void exibirStatus(){
        System.out.println("Bateria: " + modelo);
        System.out.println("Carga Atual: " + cargaAtual);
        System.out.println("Capacidade: " + capacidadeMah + " mAh");
    }
}