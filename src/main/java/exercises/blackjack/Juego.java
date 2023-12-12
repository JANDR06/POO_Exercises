package exercises.blackjack;

public class Juego {

    public static void main(String[] args) {

        Carta carta = new Carta(Palo.SPADE, Numero.DOS);
        System.out.println(carta);

        for (Palo palo : Palo.values()) {
            System.out.print(palo + " ");
        }

    }
}
