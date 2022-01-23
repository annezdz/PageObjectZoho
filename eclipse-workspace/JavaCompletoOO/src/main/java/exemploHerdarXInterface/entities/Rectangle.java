package exemploHerdarXInterface.entities;

import exemploHerdarXInterface.enums.Color;

public class Rectangle extends AbstractShape{

    private double n1;
    private double n2;
    public Rectangle(Color color, double n1, double n2) {
        super(color);
        this.n1 = n1;
        this.n2 = n2;
    }



    @Override
    public double area() {
        return 0;
    }
}
