package be.intecbrussel;

public class AudioPlayer implements MediaPlayer {
    protected MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {

        mediaAdapter  = new MediaAdapter(audioType);
        if (audioType.equals("mp3")) {
            System.out.println("Playing: " + audioType + " File: " + fileName);
        } else {
            mediaAdapter.play(audioType, fileName);
        }
    }
}