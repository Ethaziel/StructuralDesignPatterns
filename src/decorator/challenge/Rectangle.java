package decorator.challenge;

// concrete component
public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}
