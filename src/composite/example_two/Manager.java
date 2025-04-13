package composite.example_two;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    private String name;
    private int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("------------");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("------------");
        for (Employee emp : employeeList){
            emp.showEmployeeDetails();
        }
    }

    public Employee getChild (int i){
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
