package decorator.example_one;

import tester.HelperMethods;

public final class ClientDecoratorExampleOne {
    private ClientDecoratorExampleOne(){}

    public static void decoratorExampleOne (){
        HelperMethods.exampleSeparator();

        System.out.println("Decorator example 1");

        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorator1 cd1 = new ConcreteDecorator1();
        cd1.setComponent(cc);
        cd1.doJob();

        ConcreteDecorator2 cd2 = new ConcreteDecorator2();
        cd2.setComponent(cd1);
        cd2.doJob();

        HelperMethods.exampleSeparator();
    }
}
