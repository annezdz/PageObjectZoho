package exemploHerdarXInterface.entities;

import exemploHerdarXInterface.enums.Color;

public class Circle extends AbstractShape {

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }


    public Double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
