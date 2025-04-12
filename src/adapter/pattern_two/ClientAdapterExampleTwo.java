package adapter.pattern_two;

import tester.HelperMethods;

public class ClientAdapterExampleTwo {
    private ClientAdapterExampleTwo(){};

    public static void adapterExampleTwo(){
        HelperMethods.exampleSeparator();

        System.out.println("Testing the adapter example with triangle, rectangle and calculator");

        Triangle t = new Triangle(20, 10);
        CalculatorInterface calcAdapter = new CalculatorAdapter(t);

        System.out.println("Area of triangle is: " + calcAdapter.getArea(null));

        HelperMethods.exampleSeparator();

    }
}
