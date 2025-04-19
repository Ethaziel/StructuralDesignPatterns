package proxy.challenge;

public class ProxyConnectionMaker implements InternetConnectionMaker {
    private RealConnectionMaker connectionMaker;
    private String [] restrictedSites = {"blabla.com", "uhgh.org", "omg.com"};

    @Override
    public void connectToInternet(String website) throws Exception{
        for (String restrSite : restrictedSites){
            if (restrSite.equalsIgnoreCase(website)){
                throw new Exception("Restricted site: " + website);
            }
        }

        if (connectionMaker == null){
            System.out.println("Creating connection maker.");
            connectionMaker = new RealConnectionMaker();
        }

        connectionMaker.connectToInternet(website);
    }
}
