public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int chakra;

    public Ninja(String nome, String aldeia, int chakra) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.chakra = chakra;
    }

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getChakra() {
        return chakra;
    }

    public abstract void usarJutsu();
}