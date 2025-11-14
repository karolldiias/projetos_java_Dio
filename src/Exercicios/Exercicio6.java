package Exercicios;

import java.util.Scanner;

/*
 * Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
  fórmula: área=lado X lado
 */
public class Exercicio6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada lado de um quadrado
    System.out.println("Digite o tamanho do lado do quadrado para saber sua área:");
    double ladoQuadrado = scanner.nextDouble();

    //Calculo da área
    double totalArea = (ladoQuadrado*ladoQuadrado);
    
    //Exibir resultado
    System.out.printf("A área do quadrado é de %.2f.", totalArea);

    scanner.close();
  }
  
}
