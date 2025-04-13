package composite.challenge;

import tester.HelperMethods;

public class UniversityComposition {
    private UniversityComposition (){}

    public static void compositeChallenge(){
        HelperMethods.exampleSeparator();

        Supervisor dean = new Supervisor("Tatka Smoula", "Smouli Vesnicka");

        Supervisor compScienceDepartment = new Supervisor("Smoula Sikula", "Computer Science");
        Supervisor mathDepartment = new Supervisor("Smoula Koumak", "Math department");
        dean.addEmployee(compScienceDepartment);
        dean.addEmployee(mathDepartment);

        Professor math1 = new Professor("Smoula Silak", "Math professor", 120);
        mathDepartment.addEmployee(math1);
        Professor math2 = new Professor("Smoula Nesika", "Statistics professor", 121);
        mathDepartment.addEmployee(math2);

        Professor comp1 = new Professor("Smoula Mrzout", "Computer Science Professor", 135);
        compScienceDepartment.addEmployee(comp1);
        Professor comp2 = new Professor("Smoula Mlsoun", "Algorithms Professor", 136);
        compScienceDepartment.addEmployee(comp2);
        Professor comp3 = new Professor("Smoula Hezoun", "Java Programming Professor", 137);
        compScienceDepartment.addEmployee(comp3);

        System.out.println(dean.getDetails());

        compScienceDepartment.removeEmployee(comp2);

        System.out.println(dean.getDetails());

        HelperMethods.exampleSeparator();

    }

}
