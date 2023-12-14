package exercises.blackjack;

public class Juego {

    private Baraja baraja;
    private Jugador[] jugadores;
    private Jugador jugadorPC;

    public Juego(Jugador[] jugadores) {
        this.jugadores = jugadores;
        baraja = new Baraja();
        jugadorPC = new Jugador("BANCA");
    }

    public void start() {
        // repartir las 2 cartas

        // jugara cada jugador
        for (Jugador jugador : jugadores) {
            juegaJugador(jugador);
        }

        juegaPC(jugadorPC);

        mostrarGanador();
    }

    public void juegaJugador(Jugador jugador) {

    }

    private int maxPuntuacionJugadores() {
        return 0;
    }

    public void juegaPC(Jugador jugador) {


    }

    public void mostrarGanador() {

    }
}
