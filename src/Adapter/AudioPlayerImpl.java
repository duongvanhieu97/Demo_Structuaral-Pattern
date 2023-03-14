package Adapter;

public class AudioPlayerImpl implements AudioPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //phát nhạc mp3 trực tiếp
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        // sử dụng adapter để phát các định dạng khác
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        // báo lỗi nếu định dạng không hỗ trợ
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
