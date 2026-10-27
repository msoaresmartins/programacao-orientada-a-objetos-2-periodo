public class Naruto extends Ninja implements Jutsu {

    public Naruto(String nome, String aldeia, int chakra) {
        super(nome, aldeia, chakra);
    }

    @Override
    public void usarJutsu() {
        System.out.println(getNome() + " usa Rasengan!!");
    }
}