package Adapter;

public class Mp3Player implements MediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file. Name: " + fileName);
    }
}

