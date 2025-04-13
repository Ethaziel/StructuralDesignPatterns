package bridge.challenge;

public class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color, border: " + border);

    }
}
