public class Ninja
{
    String nome;
    int chakra;
    int nivel;

    void treinar()
    {
        nivel = nivel + 1;
        chakra = chakra - 10;
    }

    void descansar()
    {
        chakra = chakra + 20;
    }
}