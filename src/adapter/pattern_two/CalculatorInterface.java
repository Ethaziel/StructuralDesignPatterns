package adapter.pattern_two;

public interface CalculatorInterface {

    // target interface
    public double getArea (Rectangle r);

}

// Adaptee
class Calculator implements CalculatorInterface{
    Rectangle rectangle;

    public double getArea(Rectangle r){
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}
