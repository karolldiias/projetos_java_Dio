package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
  
  //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe um número para realizar sua tabuada");
    var number = scanner.nextInt();

    for(var i = 0; i<=10; i++){
      System.out.printf("%s x %s = %s\n", number, i, (number*i));
    }
    
  }
}
