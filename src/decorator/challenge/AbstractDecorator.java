package decorator.challenge;

public abstract class AbstractDecorator extends Shape{
    protected Shape shape;

    public void setShape(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (shape != null){
            shape.draw();
        }
    }
}
