package decorator.challenge;

public class GreenShapeDecorator extends AbstractDecorator{
    @Override
    public void draw() {
        System.out.println("Setting filling color to GREEN and border to 5.");
        super.draw();
    }
}
