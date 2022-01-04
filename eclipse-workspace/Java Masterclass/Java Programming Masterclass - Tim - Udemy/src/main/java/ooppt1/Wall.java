package ooppt1;

public class Wall {

    private double width;
    private double height;


    public Wall() {
        this(0.0,0.0);
    }

    public Wall(double width, double height) {

        this.width = Math.max(width, 0.0);
        this.height = Math.max(height, 0.0);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
