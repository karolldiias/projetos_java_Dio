import java.util.Scanner;

public class Codigo2 {

  
  //operadores e logica

  public static void main (String[] args){
    var scanner = new Scanner(System.in);
    System.out.println("Quantos anos você tem?");
    var age = scanner.nextInt();
    System.out.println("Você é emancipado?");
    var isEmancipated = scanner.nextBoolean();
    //regra de negócio, você só pode dirigir se for maior de 18anos ou se for emancipado e maior de 16anos.
    var canDrive = age >= 18 || (isEmancipated && age >= 16);
    System.out.printf("Você pode dirigir? (%s) \n", canDrive);
  }
}
