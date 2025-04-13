package bridge.challenge;

public class Rectangle extends Shape{
    public Rectangle (IColor color, int border){
        super(color, border);
    }

    @Override
    protected void drawShapes() {
        System.out.println("Drawing rectangle, using: " );
        color.fillWithColor(border);
    }
}
