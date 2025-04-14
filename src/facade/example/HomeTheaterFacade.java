package facade.example;

public class HomeTheaterFacade {
    DvdPlayer dvd;
    Lights lights;
    Screen screen;
    Projector projector;

    public HomeTheaterFacade(DvdPlayer dvd, Lights lights, Screen screen, Projector projector) {
        this.dvd = dvd;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
    }

    public void watchMovie (String movieName){
        System.out.println("Get ready to watch a movie...");

        lights.dim(10);
        screen.down();

        projector.on();

        dvd.on();
        dvd.play(movieName);

    }

    public void endMovie (){
        System.out.println("Shutting the movie theater down...");

        lights.on();
        screen.up();
        projector.off();
        dvd.stop();
        dvd.off();
    }
}
