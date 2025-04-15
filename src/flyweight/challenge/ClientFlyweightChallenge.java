package flyweight.challenge;

import tester.HelperMethods;

import java.util.Random;

public final class ClientFlyweightChallenge {
    private ClientFlyweightChallenge(){}

    public static void flyweightChallenge(){
        HelperMethods.exampleSeparator();

        PlayerFactory factory = new PlayerFactory();

        PlayerInterface player;

        for (int i = 0; i < 10; i++){
            player = factory.getCharacterFromFactory(getPlayerType());
            player.assignWeapon(getWeapon());
            player.showMission();
        }

        System.out.println("Total amount of characters created: " + factory.totalCharactersCreated());


        HelperMethods.exampleSeparator();
    }

    private static String getWeapon(){
        Random r = new Random();
        int random = r.nextInt(Constants.WEAPONS.length);
        return Constants.WEAPONS[random];
    }

    private static String getPlayerType(){
        Random r = new Random();
        int random = r.nextInt(10);
        if (random%2 == 0){
            return Constants.TERRORIST;
        } else {
            return Constants.COUNTER_TERRORIST;
        }
    }
}
