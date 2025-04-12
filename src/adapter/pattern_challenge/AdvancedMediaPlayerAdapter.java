package adapter.pattern_challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer amp;

    public AdvancedMediaPlayerAdapter (AdvancedMediaPlayer advPlayer){
        amp = advPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        amp.loadFilename(filename);
        amp.listen();
    }
}
