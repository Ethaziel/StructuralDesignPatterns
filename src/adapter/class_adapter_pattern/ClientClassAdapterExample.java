package adapter.class_adapter_pattern;


import tester.HelperMethods;

public class ClientClassAdapterExample {

    private ClientClassAdapterExample(){}

    public static void classAdapterExample(){

        HelperMethods.exampleSeparator();

        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class adapter returns: " + ca1.getInteger());

        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object adapter returns: " + oa.getInteger());

        HelperMethods.exampleSeparator();

    }

}
