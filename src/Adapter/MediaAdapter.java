package Adapter;

public class MediaAdapter implements AudioPlayer {

    MediaPlayer mediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp3") ){
            mediaPlayer = new Mp3Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            mediaPlayer.play(fileName);
        }
    }
}
