package Exercicio17;

import java.util.Scanner;

/*
 * 3 - Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter um método que retorne esse valor, as formas geométricas disponíveis devem ser as seguintes:

  Quadrado: possui o valor dos seus lados;
  Retângulo: possui os valores de base e altura;
  Circulo: possui o atributo raio.
  */
public class Exercicio17 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int option;
    GeometricForm geometricForm;

    while (true) {
      System.out.println("Escolha a forma geométrica para calcular a área:");
      System.out.println("1 - Quadrado:");
      System.out.println("2 - Retângulo:");
      System.out.println("3 - Circulo:");
      System.out.println("4 - Sair do programa:");
      option = scanner.nextInt();

      if (option == 1) {
        geometricForm = createSquare();
      } else if (option == 2) {
        geometricForm = createRectangle();
      } else if (option == 3) {
        geometricForm = createCircle();
      } else if (option == 4) {
        break;
      } else {
        System.out.println("Opção inválida");
        continue;
      }

      System.out.println("O resultado do calculo da área foi de " + geometricForm.getArea());
    }
  }

  private static GeometricForm createSquare() {
    System.out.println("Informe o tamanho dos lados");
    var side = scanner.nextDouble();
    return new Square(side);
  }

  private static GeometricForm createRectangle() {
    System.out.println("Informe a base");
    var base = scanner.nextDouble();
    System.out.println("Informe a altura");
    var height = scanner.nextDouble();
    return new Rectangle(height, base);
  }

  private static GeometricForm createCircle() {
    System.out.println("Informe o raio");
    var radius = scanner.nextDouble();
    return new Circle(radius);
  }
}
