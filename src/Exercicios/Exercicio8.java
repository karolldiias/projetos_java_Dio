package Exercicios;

import java.util.Scanner;

// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
public class Exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada nome e idade da primeira pessoa
    System.out.println("Digite o nome da primeira pessoa:");
    String nomePrimeiro = scanner.next();
    System.out.println("Olá, " + nomePrimeiro +", digite sua idade:");
    int idadePrimeiro = scanner.nextInt();

    // Entrada nome e idade da segunda pessoa
    System.out.println("Digite o nome da segunda pessoa:");
    String nomeSegundo = scanner.next();
    System.out.println("Olá, " + nomeSegundo +", digite sua idade:");
    int idadeSegundo = scanner.nextInt();

    // Cálculo da diferença das idades - Math.abs garante o valor positivo independente da ordem das idades
    int diferencaIdade = Math.abs(idadePrimeiro - idadeSegundo);

    //Exibir mensagem
    System.out.printf("A diferença de idade entre %s e %s é de %s anos", nomePrimeiro, nomeSegundo, diferencaIdade);

  }
}
