package composite.challenge;

public class Professor implements FacultyInterface{
    private String name;
    private String position;
    private int officeNumber;

    public Professor(String name, String position, int officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public String getDetails() {
        return "\t\tName: " + name + ", position: " + position + ", office number: " + officeNumber;
    }
}
