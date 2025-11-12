package Codigo9;

public class MusicBox implements  MusicPlayer {

  @Override
  public void playMusic() {
    System.out.println("O MusicBox está tocando música.");
  }

  @Override
  public void pauseMusic() {
    System.out.println("O MusicBox está com a música pausada.");
  }

  @Override
  public void stopMusic() {
    System.out.println("O MusicBox está com a música parada.");
  }

}
