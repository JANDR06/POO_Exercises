package exercises.blackjack;

import com.diogonunes.jcolor.Attribute;

public enum Color {
    ROJO(Attribute.RED_TEXT()),
    NEGRO(Attribute.BRIGHT_BLACK_TEXT());

    // ATRIBUTOS COLOR
    private Attribute atributoColor;

    // CONSTRUCTOR
    Color(Attribute atributoColor) {
        this.atributoColor = atributoColor;
    }

    // GETTERS
    public Attribute getAtributoColor() { return  atributoColor; }

}
