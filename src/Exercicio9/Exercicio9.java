package Exercicio9;

import java.util.Scanner;

/*todos os execícios devem ter um menu de interativo para chamar as funções e ter uma opção de sair para finalizar a execução

  Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
  Consultar saldo
  consultar cheque especial
  Depositar dinheiro;
  Sacar dinheiro;
  Pagar um boleto.
  Verificar se a conta está usando cheque especial.
  Siga as seguintes regras para implementar

  A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
  O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
  Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
  Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
  Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
*/
//banco
public class Exercicio9 {
 

  private final static ContaBancaria contaBancaria = new ContaBancaria();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cliente clienteNovo= new Cliente();
    //Entrada nome
    clienteNovo.setNome("Karoline");
    System.out.printf("Bem-vindo, %s\n", clienteNovo.getNome());
    
    var option = 1;
    do{
      System.out.println("===Escolha uma opção===");
      System.out.println("0 - Sair");
      System.out.println("1 - Consultar saldo");
      System.out.println("2 - Consultar Cheque Especial");
      System.out.println("3 - Depositar 500 reais");
      System.out.println("4 - Sacar 500 reais");
      option = scanner.nextInt();
      switch(option){
        case 0 -> System.exit(0);
        case 1 ->System.out.printf("Seu saldo é %s\n", contaBancaria.consultarSaldo());
        case 2 ->System.out.printf("O valor disponível de Cheque Especial é %s\n", contaBancaria.consultarChequeEspecial());
        case 3 ->System.out.printf("O valor depositado foi de %s seu novo saldo é %s\n", contaBancaria.getDepositarDinheiro(), contaBancaria.SaldoAposdepositar());
        case 4 ->System.out.printf("O valor sacado foi de %s seu novo saldo é %s\n", contaBancaria.getSacarDinheiro(), contaBancaria.SaldoAposSacar());
      }
    } while(true);



  }
}
