package decorator.example_two;

import tester.HelperMethods;

import java.io.*;

public final class ClientDecoratorExampleTwo {
    private ClientDecoratorExampleTwo(){}

    public static void decoratorExampleTwo(){
        HelperMethods.exampleSeparator();

        int c;

        StringBuffer stringBuffer = new StringBuffer("Bla bla test test test\n" +
                "lkasdADFDSOFSDK APSKFDDAKF APSKOAKD jlkjas lkd jlksaj dlksadjlksa djlk");
        byte[] bytes = stringBuffer.toString().getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            System.out.println();

            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        HelperMethods.exampleSeparator();

    }
}
