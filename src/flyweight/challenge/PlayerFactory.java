package flyweight.challenge;

import java.util.HashMap;

public class PlayerFactory {
    private HashMap<String, PlayerInterface> characters = new HashMap<>();

    public int totalCharactersCreated (){
        return characters.size();
    }

    public PlayerInterface getCharacterFromFactory (String playerType){
        PlayerInterface player = null;

        if (characters.containsKey(playerType)){
            player = characters.get(playerType);
        } else {
            if (playerType.equalsIgnoreCase(Constants.TERRORIST)){
                player = new Terrorist();
                characters.put(playerType, player);
                System.out.println("New terrorist was created.");
            } else if (playerType.equalsIgnoreCase(Constants.COUNTER_TERRORIST)){
                player = new CounterTerrorist();
                characters.put(playerType, player);
                System.out.println("New counter terrorist was created.");
            }
        }

        return player;
    }

}
