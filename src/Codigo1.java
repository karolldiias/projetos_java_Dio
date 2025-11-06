import java.util.Scanner;

public class Codigo1 {

  private final static String WELCOME_MESSAGE = "Olá informe o seu nome:";
  
  // esse programa solicita ao usuário digitar seu nome e sua idade e imprimir uma mensagem de olá.
  public static void main (String[] args){
    var scanner = new Scanner(System.in);
    System.out.println(WELCOME_MESSAGE);
    var name = scanner.next();
    System.out.println("Informe sua idade:");
    var age = scanner.nextInt();
    System.out.printf("Olá %s sua idade é %s \n", name, age);
  }
}
