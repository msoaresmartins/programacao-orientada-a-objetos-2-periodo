public class Sasuke extends Ninja implements Jutsu {

    public Sasuke(String nome, String aldeia, int chakra) {
        super(nome, aldeia, chakra);
    }

    @Override
    public void usarJutsu() {
        System.out.println(getNome() + " usa Chidori!!");
    }
}