public class Ninja
{
    private String nome;
    private int chakra;
    private int nivel;
    
    void treinar()
    {
        nivel++;
        chakra = chakra - 10;
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
    
}