package flyweight.challenge;

public class Terrorist implements PlayerInterface {
    private String task;
    private String weapon = "";

    public Terrorist() {
        task = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void showMission() {
        System.out.println("I am a terrorist. My mission is to " + task + ". Weapon I will use is: " + weapon);
    }
}
