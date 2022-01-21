package herancaEPolimorfismo.metodosAbstratos;

public class Rectangle extends Shape{

    private Double width;
    private Double height;


    public Rectangle() {}

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public double area() {

        return width * height;
    }
}