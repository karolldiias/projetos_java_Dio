package Exercicios;

import java.util.Scanner;

public class Desafio3 {

  // TODO: Crie uma string log que concatene os valores recebidos em um formato organizado:
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a ação testada?");
    String acaoTestada = sc.nextLine();
    
    
    System.out.println("Qual o resultado do teste?");
    String resultadoEsperado = sc.nextLine();
 
    System.out.println("Teste: " + acaoTestada + " | " + "Resultado: " + resultadoEsperado);

    sc.close();
  }
}
