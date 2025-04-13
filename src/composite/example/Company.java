package composite.example;

import tester.HelperMethods;

public class Company {
    private Company(){}

    public static void compositeExample(){
        HelperMethods.exampleSeparator();

        Employee dev1 = new Developer("John", 487, "senior developer");
        Employee dev2 = new Developer("Tom", 678, "junior developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Charles", 168, "Manager");
        Employee man2 = new Manager("Martin", 258, "Head Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();

        HelperMethods.exampleSeparator();

    }
}
