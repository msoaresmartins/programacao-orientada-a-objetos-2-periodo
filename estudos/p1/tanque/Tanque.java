public class Tanque {
    private String modelo;
    private double nivel;
    private static final double NIVEL_MINIMO = 20.0;
    
    public Tanque(String modelo, double nivel) {
        this.modelo = modelo;
        this.nivel = nivel;
    }
    
    public Tanque() {
        modelo = "Genérico";
        nivel = 100;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getNivel() {
        return nivel;
    }
    
    public void setNivel(double nivel){
        this.nivel = nivel;
    }
    
    void consumir(double valor){
        nivel = nivel - valor;
    
        if (nivel < 0){ nivel = 0; } 
        
        System.out.println ("Nível atual do tanque: " + nivel + "%.");
    }
    
    public boolean precisaAbastecer(){
        if (nivel < NIVEL_MINIMO) {
            return true;
        } else {
            return false;
        }
    }
    
    public static double getNivelMinimo(){
        return NIVEL_MINIMO;
    }
}