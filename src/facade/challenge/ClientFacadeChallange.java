package facade.challenge;

import tester.HelperMethods;

public final class ClientFacadeChallange {
    private ClientFacadeChallange(){}

    public static void facadeChallenge(){
        HelperMethods.exampleSeparator();

        HotelKeeper keeper = new HotelKeeper(new NonVegRestaurant(),
                new VegRestaurant(),
                new VegNonBothRestaurant());
        VegMenu vm = keeper.getVegMenu();
        vm.showMenu();
        NonVegMenu nvm = keeper.getNonVegMenu();
        nvm.showMenu();
        Both bm = keeper.getBothMenus();
        bm.showMenu();

        HelperMethods.exampleSeparator();

    }

}
