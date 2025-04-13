package bridge.challenge;

public class Triangle extends Shape {
    public Triangle (IColor color, int border){
        super(color, border);
    }

    @Override
    protected void drawShapes() {
        System.out.println("Drawing triangle, using: " );
        color.fillWithColor(border);
    }
}
