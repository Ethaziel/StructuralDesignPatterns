package bridge.example;

public class ClientBridgePatternExample {

    private ClientBridgePatternExample(){}

    public static void exampleBridge(){
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
