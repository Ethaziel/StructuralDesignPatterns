package adapter.pattern_one;

import tester.HelperMethods;

public class ClientAdapterExample {

    public static void adapterExample (){
        HelperMethods.exampleSeparator();

        System.out.println("Testing the adapter example with duck and turkey");
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says: ");
        testDuck(duck);

        System.out.println("The turkey adapter says: ");
        testDuck(turkeyAdapter);

        HelperMethods.exampleSeparator();

    }

    static void testDuck (Duck duck){
        duck.quack();
        duck.fly();
    }

    private ClientAdapterExample(){}
}
