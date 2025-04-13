package bridge.challenge;

import tester.HelperMethods;

public class ClientBridgePatternChallenge {
    // color - implementer
    // shape - abstraction
    // shape has a color

    private ClientBridgePatternChallenge(){}

    public static void bridgeChallenge(){
        HelperMethods.exampleSeparator();

        Shape shape1 = new Triangle(new GreenColor(), 15);
        shape1.drawShapes();
        shape1.modifyBorders(37);
        shape1.drawShapes();

        Shape shape2 = new Rectangle(new RedColor(), 25);
        shape2.drawShapes();
        shape2.modifyBorders(22);
        shape2.drawShapes();

        HelperMethods.exampleSeparator();
    }

}
