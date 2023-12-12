package exercises.blackjack;

import static com.diogonunes.jcolor.Ansi.colorize;

public enum Palo {
    SPADE("\u2660", Color.NEGRO),
    HEARTS("\u2665", Color.ROJO),
    DIAMOND("\u2666", Color.ROJO),
    CLUB("\u2663", Color.NEGRO);

    // ATRIBUTOS PALO
    private String typeOf;
    private Color color;

    // CONSTRUCTOR
    Palo(String typeOf, Color color) {
        this.typeOf = typeOf;
        this.color = color;
    }

    @Override
    public String toString() {
        return colorize(typeOf, color.getAtributoColor());
    }


}
