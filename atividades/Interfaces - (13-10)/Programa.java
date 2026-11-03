public class Programa {

    public static void main(String[] args) {

        Jutsu[] ninjas = new Jutsu[4];

        ninjas[0] = new Naruto("Naruto Uzumaki", "Konoha", 100);
        ninjas[1] = new Sasuke("Sasuke Uchiha", "Konoha", 90);
        ninjas[2] = new Naruto("Naruto Modo Sábio", "Konoha", 150);
        ninjas[3] = new Sasuke("Sasuke Sharingan", "Konoha", 130);

        for (int i = 0; i < ninjas.length; i++) {
            ninjas[i].usarJutsu();
        }
    }
}