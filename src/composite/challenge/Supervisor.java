package composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements FacultyInterface{
    private String name;
    private String departmentName;

    private ArrayList<FacultyInterface> employeeList = new ArrayList<>();

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    @Override
    public String getDetails() {
        String details = "Name: " + name + ", Department name: " + departmentName
                + "\nSupervising: \n";
        for (FacultyInterface f : employeeList){
            details = details.concat(f.getDetails() + "\n");
        }
        return details;
    }

    public void addEmployee(FacultyInterface fac){
        employeeList.add(fac);
    }

    public void removeEmployee(FacultyInterface fac){
        employeeList.remove(fac);
    }

    public ArrayList<FacultyInterface> getMyFaculty(){
        return employeeList;
    }
}
