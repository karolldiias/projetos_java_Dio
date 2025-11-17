package Exercicio9;

public class ContaBancaria {

  private double saldo;

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public void consultarSaldo(){
    System.out.println("Você esta consultando seu saldo");
  }
  
  public void consultarChequeEspecial(){
    System.out.println("Você esta consultando seu cheque especial");
  }
  
  public void depositarDinheiro(){
    System.out.println("Você esta depositando");
  }
  
  public void sacarDinheiro(){
    System.out.println("Você esta sacando");
  }
  
  public void consultarUsoChequeEspecial(){
    System.out.println("Você esta consultando o uso do cheque especial");

  }

}

