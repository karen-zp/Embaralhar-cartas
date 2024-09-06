public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        for (int i = 0; i < 5; i++) {
            Carta carta = baralho.comprar();
            System.out.println(carta);
        }

        System.out.println("Cartas restantes no baralho: " + baralho.cartasRestantes());
    }
}