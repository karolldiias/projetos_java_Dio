package Exercicios;

import java.util.Scanner;

/*
 * Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
  fórmula: área=base X altura 
 */
public class Exercicio7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada base do retângulo
    System.out.println("Digite o valor da base do retângulo");
    double base = scanner.nextDouble();

    // Entrada altura do retângulo
    System.out.println("Digite o valor da altura do retângulo");
    double altura = scanner.nextDouble();

    //Cálculo da área do retângulo
    double area = base * altura;

    //Exibir mensagem
    System.out.printf("A área do retângulo é %.2f", area);
    
    scanner.close();
  }
  
}
