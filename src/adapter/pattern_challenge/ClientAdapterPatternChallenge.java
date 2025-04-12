package adapter.pattern_challenge;

import tester.HelperMethods;

public class ClientAdapterPatternChallenge {
    private ClientAdapterPatternChallenge(){}

    public static void adapterChallenge(){

        HelperMethods.exampleSeparator();

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Over each other.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "Heavy is the crown.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "Forrest Gump.vlc");

        audioPlayer.play("mp4", "Heavy is the crown.mp4");

        HelperMethods.exampleSeparator();
    }
}
