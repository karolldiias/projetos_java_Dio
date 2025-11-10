package Exercicios;

import java.util.Scanner;

/*Escreve um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, 
a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, 
números menores que o primeiro número devem ser ignorados.
*/

public class Exercicio1 {

  public static void main(String[] args) {

    var scanner = new Scanner(System.in);
    System.out.println("Informe um número:");
    var number = scanner.nextInt();
    var keepVerify = true;

    while (keepVerify) {
      System.out.println("Informe o número para verificação");
      var toVerify = scanner.nextInt();

      if (toVerify < number) {
        System.out.printf("Informe um número maior que %s \n", number);
        continue;
      }

      var result = toVerify % number;
      keepVerify = result == 0;
      System.out.printf("%s %% %s = %s \n", toVerify, number, result);
    }
  }
}
