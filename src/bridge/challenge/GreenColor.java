package bridge.challenge;

public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color, border : " + border);

    }
}
