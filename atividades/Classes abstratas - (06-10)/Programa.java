public class Programa {

    public static void main(String[] args) {

        Ninja ninja1 = new Naruto("Naruto Uzumaki", "Konoha", 100);
        Ninja ninja2 = new Sasuke("Sasuke Uchiha", "Konoha", 90);

        System.out.println("Nome: " + ninja1.getNome());
        System.out.println("Aldeia: " + ninja1.getAldeia());
        System.out.println("Chakra: " + ninja1.getChakra());
        ninja1.usarJutsu();

        System.out.println();

        System.out.println("Nome: " + ninja2.getNome());
        System.out.println("Aldeia: " + ninja2.getAldeia());
        System.out.println("Chakra: " + ninja2.getChakra());
        ninja2.usarJutsu();
    }
}