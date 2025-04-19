package proxy.challenge;

import tester.HelperMethods;

public final class ClientProxyChallenge {
    private ClientProxyChallenge(){}

    public static void proxyChallenge(){
        HelperMethods.exampleSeparator();

        InternetConnectionMaker internetConnectionMaker = new ProxyConnectionMaker();

        try {
            internetConnectionMaker.connectToInternet("udemy.com");
            internetConnectionMaker.connectToInternet("uhgh.org");
        } catch (Exception e) {
            System.out.println("\n\t!!! " + e.getMessage() + " !!!\n");
        }


        HelperMethods.exampleSeparator();
    }
}
