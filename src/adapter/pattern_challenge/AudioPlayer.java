package adapter.pattern_challenge;

public class AudioPlayer implements MediaPlayer{
    private String audioType = "mp3";

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format is not supported.");
        }
    }
}
