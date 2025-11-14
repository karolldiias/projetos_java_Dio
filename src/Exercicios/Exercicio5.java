package Exercicios;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
public class Exercicio5 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String nome;
    int anoDeNascimento;

    // Entrada do nome
    System.out.println("Digite o seu nome?");
    nome = scanner.next();

    // Entrada do ano de nascimento
    System.out.println("Digite o ano do seu nascimento: ");
    anoDeNascimento = scanner.nextInt();

    //Obtém ano Atual
    var anoAtual = LocalDate.now().getYear(); 
    
    // Calculando idade
    var idade = ( anoAtual- anoDeNascimento);

    // Exibe mensagem
    System.out.printf("Olá %s você tem %s anos", nome, idade);

    scanner.close();

  }
}
