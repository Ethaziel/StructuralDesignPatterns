package facade.example;

public class Lights {
    String description;

    public Lights(String description) {
        this.description = description;
    }

    public void on (){
        System.out.println(description + " on");
    }

    public void off (){
        System.out.println(description + " off");
    }

    public void dim (int lvlPercentage){
        System.out.println(description + " dimming to " + lvlPercentage + "%");
    }

    public String toString(){
        return description;
    }
}
