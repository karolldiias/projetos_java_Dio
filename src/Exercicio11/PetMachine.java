package Exercicio11;

public class PetMachine {

  private boolean clean;

  private int water;

  private int shampoo;

  private Pet pet;


  public void takeAShower(){
    if(this.pet == null){
      System.out.println("Coloque o pet na máquina para inicial o banho");
      return;
    }

    pet.setClean(true);
    System.out.println("O pet" + pet.getName() + "está limpo");
  }
}
