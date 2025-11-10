package Exercicios;

import java.util.Scanner;

// Escreva estrutura condicional para verificar se a senha digitada são iguais:

public class Desafio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a senha: ");
    String senhaDigitada = sc.nextLine();
    System.out.println("Digite novamente sua senha para confirmar: ");
    String senhaConfirmada = sc.nextLine();

    if(senhaDigitada.equals(senhaConfirmada)){
      System.out.println("Senha valida");
    } else{
      System.out.println("Senha nao conferem");
    }

    sc.close();
  }
}
