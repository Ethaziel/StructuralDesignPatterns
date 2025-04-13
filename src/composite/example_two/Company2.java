package composite.example_two;

import tester.HelperMethods;

public class Company2 {
    private Company2(){}

    public static void compositeExampleTwo(){
        HelperMethods.exampleSeparator();

        Employee dev1 = new Developer("John", 487, "senior developer");
        Employee dev2 = new Developer("Tom", 678, "junior developer");

        Manager engManager = new Manager("Mike", 78500);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer("Thomas", 498, "developer");


        Manager generalManager = new Manager("Petr", 122000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();

        HelperMethods.exampleSeparator();

    }
}
