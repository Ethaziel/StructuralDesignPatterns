package decorator.challenge;

public class RedShapeDecorator extends AbstractDecorator {
    @Override
    public void draw() {
        System.out.println("Setting filling color to RED.");
        super.draw();
    }
}
