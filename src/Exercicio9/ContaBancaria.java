package Exercicio9;

public class ContaBancaria {

  private double saldo = 1000;

  private double chequeEspecial = 400;

  private double depositarDinheiro = 500;

  private double sacarDinheiro = 500;


  public double getSacarDinheiro() {
    return sacarDinheiro;
  }

  public double getDepositarDinheiro() {
    return depositarDinheiro;
  }

  public double consultarChequeEspecial(){
    return chequeEspecial;
  }

  public double consultarSaldo() {
    return saldo;
  }

  public double SaldoAposdepositar(){
    return saldo += depositarDinheiro;

  }

  public double SaldoAposSacar(){
    return saldo -=sacarDinheiro;
  }
}

