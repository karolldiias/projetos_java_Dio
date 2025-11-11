package Exercicio11;

public class Pet {

  // indica o nome do pet
  private final String name;

  // indica se o pet esta limpo ou não
  private boolean clean;

  // Construtor
  public Pet(String name) {
    this.name = name;
    this.clean = false;
  }

  public String getName() {
    return name;
  }

  public boolean isClean() {
    return clean;
  }

  public void setClean(boolean clean) {
    this.clean = clean;
  }

}
