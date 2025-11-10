import java.util.Scanner;

public class Codigo8 {
  
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var name = "";

    while(true){
      System.out.println("Informe um nome");
      name = scanner.next();
      System.out.println(name);

      if(name.equalsIgnoreCase("exit")) break;
    }
  }
}
// use do while se vc quiser que o seu código rode pelo menos uma vez