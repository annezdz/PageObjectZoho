package ooppt1;

public class RectangleExampleConstructor {

    private int x;
    private int y;
    private int width;
    private int height;

    public RectangleExampleConstructor() {
        this(0,0); // calls 2nd constructor
    }

    public RectangleExampleConstructor(int width, int height) {
        this(0,0,width,height); // calls 3nd constructor
    }

    //3rd constructor initialize variables
    public RectangleExampleConstructor(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
}
