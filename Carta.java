enum Naipe{
    COPAS,OURO,ESPADA,PAUS
}

enum Valor{
    AS,DOIS,TRES,QUATRO,CINCO,SEIS,SETE,OITO,NOVE,DEZ,VALETE,DAMA,REI
}

class Carta{
    private Naipe naipe;
    private Valor valor;

    Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}