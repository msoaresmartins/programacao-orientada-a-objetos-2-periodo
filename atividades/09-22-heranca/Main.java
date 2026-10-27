public class Main
{
    public static void main(String[] args)
    {
        Ninja ninja = new Ninja();

        ninja.apresentar();
        ninja.treinar();

        Hokage hokage = new Hokage();

        hokage.apresentar();
        hokage.treinar();
        hokage.governarVila();

        Ninja personagem = new Hokage();

        personagem.apresentar();
        personagem.treinar();
    }
}