package bridge.challenge;

// abstraction
public abstract class Shape {
    protected int border;
    protected IColor color;

    protected Shape(IColor color, int border){
        this.color = color;
        this.border = border;
    }

    protected void modifyBorders (int newBorder){
        border = newBorder;
    }

    protected void drawShapes(){}
}
