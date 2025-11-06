import java.util.Scanner;

public class Codigo3 {
  
public static void main (String[] args){

  var scanner = new Scanner(System.in);
  System.out.println("Informe o primeiro número:");
  var value1 = scanner.nextInt();
  System.out.println("Informe o segundo número:");
  var value2 = scanner.nextInt();
  System.out.printf("%s + %s = %s \n", value1, value2, value1 + value2);
  
  //raiz quadrada  
  var scanner2 = new Scanner(System.in);
  System.out.println("Informe um número:");
  var value3 = scanner2.nextInt();
  System.out.printf("a raiz quadrada de %s é %s \n", value3, Math.sqrt(value3));

  //Potência
  var scanner3 = new Scanner(System.in);
  System.out.println("Informe um número:");
  var value4 = scanner3.nextInt();
  System.out.printf("a potência de %s é %s \n", value4, Math.pow(value4, 2));

}

}
