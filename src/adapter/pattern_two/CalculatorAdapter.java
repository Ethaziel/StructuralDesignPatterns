package adapter.pattern_two;

public class CalculatorAdapter implements CalculatorInterface{

    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle myTriangle){
        t = myTriangle;
    }

    public double getArea (Rectangle r){
        calculator = new Calculator();

        Rectangle rect = new Rectangle();
        rect.length = t.base;
        rect.width = 0.5 * t.height;

        return calculator.getArea(rect);
    }

}
