package Exercicios;

import java.util.Scanner;

public class Desafio4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //João Pedro de Albuquerque Magalhães
    System.out.println("Qual o seu nome: ");
    String nomeCompleto = sc.nextLine();

    if(nomeCompleto.length() <= 30){
      System.out.println("Entrada válida" + nomeCompleto.length());
    } else {
      System.out.println("Nome muito longo" + nomeCompleto.length());
    }

    sc.close();
  }
}
