package adapter.pattern_challenge;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String file = "";

    @Override
    public void loadFilename(String filename) {
        file = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing the vlc file: " + file);
    }
}
