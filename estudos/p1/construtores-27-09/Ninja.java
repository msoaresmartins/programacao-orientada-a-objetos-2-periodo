public class Ninja
{
    private String nome;
    private int chakra;
    private int nivel;
    private static int totalNinjas;
    
    void treinar()
    {
        if (chakra >=10){
        nivel++;
        chakra = chakra - 10;
        System.out.println("Treino realizado com sucesso");
        } else {
        System.out.println("Recomenda-se descanso");
        }
    }
    
    void descansar()
    {
        chakra = chakra + 20;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setChakra(int chakra)
    {
        this.chakra = chakra;
    }
    
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getChakra()
    {
        return chakra;
    }
    
    public int getNivel()
    {
        return nivel;
    }
    
    public Ninja()
    {
        totalNinjas++;
    }
    
    public static int getTotalNinjas()
    {
        return totalNinjas;
    }
    
    public Ninja(String nome)
    {
        this.nome = nome;
        totalNinjas++;
    }
    
    public Ninja(String nome, int chakra, int nivel)
    {
        this.nome = nome;
        this.chakra = chakra;
        this.nivel = nivel;
        totalNinjas++;
    }
}