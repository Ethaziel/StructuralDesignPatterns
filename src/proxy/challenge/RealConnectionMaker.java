package proxy.challenge;

public class RealConnectionMaker implements InternetConnectionMaker {

    public RealConnectionMaker() {
    }

    @Override
    public void connectToInternet(String website) {
        System.out.println("Connected to the internet...");
        System.out.println("Loading the site - " + website);
    }
}
