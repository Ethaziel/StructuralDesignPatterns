package proxy.example;

import tester.HelperMethods;

public final class ClientProxyExample {
    private ClientProxyExample(){}

    public static void proxyExample (){
        HelperMethods.exampleSeparator();

        Image image = new ProxyImage("some_file.jpg");

        image.display();
        System.out.println();

        image.display();

        HelperMethods.exampleSeparator();
    }
}
