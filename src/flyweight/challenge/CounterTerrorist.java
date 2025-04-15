package flyweight.challenge;

public class CounterTerrorist implements PlayerInterface {
    private String task;
    private String weapon = "";

    public CounterTerrorist() {
        task = "Diffuse the bomb and kill or capture all terrorists!";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void showMission() {
        System.out.println("I am a Counter Terrorist. My mission is to " + task +
                "\n\tWeapon I will use is: " + weapon);
    }
}
