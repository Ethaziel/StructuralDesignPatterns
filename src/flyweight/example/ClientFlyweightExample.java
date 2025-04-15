package flyweight.example;

import tester.HelperMethods;

import java.util.Random;

public final class ClientFlyweightExample {
    private ClientFlyweightExample(){}

    public static void flyweightExample() throws Exception {
        HelperMethods.exampleSeparator();

        RobotFactory myFactory = new RobotFactory();

//        RobotInterface shape = myFactory.getRobotFromFactory("small");
//        shape.print();

        Robot shape;

        for (int i = 0; i < 5; i++){
            shape = (Robot) myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        for (int i = 0; i < 5; i++){
            shape = (Robot) myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int robotAmount = myFactory.totalObjectsCreated();
        System.out.println("Total amount of robots created: " + robotAmount);



        HelperMethods.exampleSeparator();
    }

    static String getRandomColor(){
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0){
            return "red";
        } else {
            return "green";
        }
    }

}
