package be.intecbrussel;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Song name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}