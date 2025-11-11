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

      System.out.println("Escolha o primeiro número:");
      var numero1 = scanner.nextInt();

      while (true) {
         System.out.println("Escolha o segundo número:");
         var numero2 = scanner.nextInt();

         if (numero2 > numero1) {
            System.out.printf("Informe um número menor que %s \n", numero1);
            continue;
         }
         break;
      }

      while (true) {
         System.out.println("Deseja imprimir números impares ou pares?");
         var numero3 = scanner.next();

         if (numero3.equals("par") || numero3 == "impar") {
            System.out.printf("Escolha entre impar ou par e digite");
            continue;
         } 
         break;
            
      }
      System.out.println("Fim da execução");

   }
}
