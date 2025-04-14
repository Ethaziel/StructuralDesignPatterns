package facade.example;

public class DvdPlayer {
    String description;
    int currentTrack;
    String movie;

    public DvdPlayer(String description) {
        this.description = description;
    }

    public void play (String movie){
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " playing \"" + movie + "\".");
    }

    public void stop (){
        System.out.println(description + "stopped playing \"" + movie + "\".");
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
