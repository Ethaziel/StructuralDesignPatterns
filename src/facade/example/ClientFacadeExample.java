package facade.example;

import tester.HelperMethods;

public final class ClientFacadeExample {
    private ClientFacadeExample(){}

    public static void facadeExample(){
        HelperMethods.exampleSeparator();

        DvdPlayer dvdPlayer = new DvdPlayer("Sony DVD Player");
        Projector projector = new Projector("Panasonic Projector", dvdPlayer);
        Lights lights = new Lights("Ceiling Lights");
        Screen screen = new Screen("Big Flat Screen");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, lights, screen, projector);

        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();

        HelperMethods.exampleSeparator();

    }
}
