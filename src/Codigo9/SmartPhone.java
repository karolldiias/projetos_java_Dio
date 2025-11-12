package Codigo9;

public class SmartPhone implements VideoPlayer, MusicPlayer {

  @Override
  public void playVideo() {
    System.out.println("O Smartphone está reproduzindo vídeo.");
  }

  @Override
  public void pauseVideo() {
    System.out.println("O Smartphone está com o vídeo pausado.");
  }

  @Override
  public void stopVideo() {
    System.out.println("O Smartphone está com o vídeo parado.");
  }

  //

  @Override
  public void playMusic() {
    System.out.println("O Smartphone está tocando música.");
  }

  @Override
  public void pauseMusic() {
    System.out.println("O Smartphone está com a música pausada.");
  }

  @Override
  public void stopMusic() {
    System.out.println("O Smartphone está com a música parada.");
  }

}
