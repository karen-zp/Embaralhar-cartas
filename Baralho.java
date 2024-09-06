public class Baralho {
    private Carta[] cartas;
    private int topo;

    public Baralho() {
        cartas = new Carta[52];
        int index = 0;
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                cartas[index] = new Carta(naipe, valor);
                index++;
            }
        }
        topo = 0;
    }

    public void embaralhar() {
        Carta temp = cartas[51];
        for (int i = 51; i > 0; i--) {
            cartas[i] = cartas[i - 1];
        }
        cartas[0] = temp;
    }

    public Carta comprar() {
        return cartas[topo++];
    }

    public int cartasRestantes() {
        return 52 - topo;
    }
}