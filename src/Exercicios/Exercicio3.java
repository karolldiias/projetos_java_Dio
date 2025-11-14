package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

   /*
    * Escreva um código que o usuário entre com um primeiro número, um segundo
    * número maior que o primeiro e escolhe entre a opção par e impar,
    * com isso o código deve informar todos os números pares ou ímpares (de acordo
    * com a seleção inicial) no intervalo de números informados,
    * incluindo os números informados e em ordem decrescente;
    */

   // continuar
   public static void main(String[] args) {
      var scanner = new Scanner(System.in);

      //entrada do primero número
      System.out.println("Digite primeiro número:");
      int primeiroNumero = scanner.nextInt();

      //entrada do segundo número
      int segundoNumero;
      do {
         System.out.println("Digite o segundo número (maior que o primeiro)");
         segundoNumero = scanner.nextInt();
      } while (segundoNumero <= primeiroNumero);

      //Escolha entre par ou impar
      System.out.println("Deseja imprimir números pares ou ímpares? (Digite par ou impar)");
      String escolha = scanner.next();

      System.out.println("Números " +  escolha + "(es) entre " +  primeiroNumero + " e " +  segundoNumero);


      // Exibição dos números conforme escolha
      for (int i = segundoNumero; i >= primeiroNumero; i--){
         if(escolha.equals("par") && i % 2==0){
            System.out.println(i);
         } else if (escolha.equals("impar") && i % 2 !=0){
            System.out.println(i);
         }
      }
      scanner.close();
   }
}
