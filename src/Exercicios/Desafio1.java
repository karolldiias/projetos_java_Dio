package Exercicios;

import java.util.Scanner;


// Escreva estrutura condicional para verificar se algum dos campos está vazio:

public class Desafio1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Informe o nome:");
      String nome = sc.nextLine();

      System.out.println("Informe o cpf:");
      String cpf = sc.nextLine();
      
      System.out.println("Informe o email:");
      String email = sc.nextLine();
      

      if(nome.isEmpty() || 
         cpf.isEmpty() || 
         email.isEmpty()){
         System.out.println("Cadastro incompleto");
      } else {
         System.out.println("Cadastro validado com sucesso");
      }
      sc.close();
   }

}
