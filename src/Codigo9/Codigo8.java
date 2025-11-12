package Codigo9;

//Main
public class Codigo8 {

  public static void main(String[] args) {

    MusicPlayer musicPlayer = new Computer();

    runMusic(musicPlayer);

   // runVideo(null);
   
  }

  public static void runVideo(VideoPlayer videoPlayer){
    videoPlayer.playVideo();
  }


  public static void runMusic(MusicPlayer musicPlayer){
    musicPlayer.playMusic();
  }


}
