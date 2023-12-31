package exercises.blackjack;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Carta[] mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new Carta[0];
    }

    public String getNombre() { return nombre; }

    public int getPuntuacion() {
        int puntos = 0;

        for(Carta carta : mano) {
            puntos += carta.getNumero().getPuntuacion()[0];
        }

        return puntos;
    }

    public void addCarta(Carta carta) {
        mano = Arrays.copyOf(mano, mano.length + 1);
        mano[mano.length - 1] = carta;
    }

    @Override
    public String toString() {
        return nombre + " mano: " + Arrays.toString(mano) + " puntuacion: " + getPuntuacion();
    }
}
