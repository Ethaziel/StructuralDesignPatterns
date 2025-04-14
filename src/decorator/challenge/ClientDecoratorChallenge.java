package decorator.challenge;

import tester.HelperMethods;

public final class ClientDecoratorChallenge {
    private ClientDecoratorChallenge(){}

    public static void decoratorChallenge(){
        HelperMethods.exampleSeparator();

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();


        GreenShapeDecorator greenRect = new GreenShapeDecorator();
        greenRect.setShape(rectangle);

        RedShapeDecorator redCircle = new RedShapeDecorator();
        redCircle.setShape(circle);

        greenRect.draw();
        redCircle.draw();

        HelperMethods.exampleSeparator();
    }
}
