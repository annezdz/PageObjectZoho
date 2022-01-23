package exemploHerdarXInterface.entities;

import exemploHerdarXInterface.enums.Color;

public abstract class AbstractShape implements Shape{

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
