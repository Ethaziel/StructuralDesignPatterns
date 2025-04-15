package flyweight.example;

public interface RobotInterface {
    void print();

    // extrinsic data passed as arguments
    void setColor(String robotColor);
}

class Robot implements RobotInterface{
    String robotType;
    public String robotColor;       // should not be here, its only for showing purpose

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    public void setColor (String robotColor){
        this.robotColor = robotColor;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + robotColor + " color");

    }
}
