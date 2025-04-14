package facade.example;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void down(){
        System.out.println(description + " down.");
    }

    public void up(){
        System.out.println(description + " up.");
    }

    public void on (){
        System.out.println(description + " on");
    }

    public void off (){
        System.out.println(description + " off");
    }

    public String toString(){
        return description;
    }
}
