import java.util.Scanner;

public class Codigo5 {
  

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe o seu nome:");
    var name = scanner.next();
    System.out.println("Informe sua idade:");
    var age = scanner.nextInt();
    System.out.println("Informe se você é emancipado: (s/n)");
    var isEmancipated = scanner.next().equalsIgnoreCase("s");
    
    var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

    // modo 1: if, else if e else
    /*if(canDrive) {
      System.out.printf("%s, você pode dirigir \n", name);
    } 
    else if {
      System.out.printf("%s, apesar de você ter %s anos, você é emancipado(a) e pode dirigir \n", name, age);
    }  
    else {
      System.out.printf("%s, Você não pode dirigir \n", name);
    }
    */

    //Modo 2: if e else
    /*var mensagem = "";
    if(canDrive){
      mensagem =  name + "você pode dirigir \n";
    } else {
      mensagem =  name + "você não pode dirigir \n";
    }
    */

    //Modo 3: Elvis Operator ou Operador ternário - não permite executar códigos
    var mensagem = canDrive ? name + ", você pode dirigir \n" : name + ", você não pode dirigir \n";

    System.out.println(mensagem);
    System.out.println("Fim da execução");
  }
}
