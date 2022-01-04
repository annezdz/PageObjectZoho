package ooppt1;

public class WallArea {

    private double width;
    private double height;

    public WallArea() {}

    public WallArea(double width, double height) {
        this.height = height;
        this.width = width;
        if(width < 0) {
            this.width = 0;
        }
        if(height < 0) {
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if(height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        return width * height;
    }
}
