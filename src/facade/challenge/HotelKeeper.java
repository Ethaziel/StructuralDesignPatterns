package facade.challenge;

import java.awt.*;

// facade
public class HotelKeeper {
    private NonVegRestaurant nonVegRestaurant;
    private VegRestaurant vegRestaurant;
    private VegNonBothRestaurant normalRestaurant;

    public HotelKeeper(NonVegRestaurant nonVegRestaurant,
                       VegRestaurant vegRestaurant,
                       VegNonBothRestaurant normalRestaurant) {
        this.nonVegRestaurant = nonVegRestaurant;
        this.vegRestaurant = vegRestaurant;
        this.normalRestaurant = normalRestaurant;
    }

    public VegMenu getVegMenu(){
        return (VegMenu) vegRestaurant.getMenus();
    }

    public NonVegMenu getNonVegMenu(){
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }

    public Both getBothMenus(){
        return (Both) normalRestaurant.getMenus();
    }

}
