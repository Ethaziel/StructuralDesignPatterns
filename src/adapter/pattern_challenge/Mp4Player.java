package adapter.pattern_challenge;

public class Mp4Player implements AdvancedMediaPlayer {
    private String file = "";

    @Override
    public void loadFilename(String filename) {
        this.file = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing the mp4 file: " + file);
    }
}
