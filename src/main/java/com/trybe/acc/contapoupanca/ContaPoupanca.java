package com.trybe.acc.contapoupanca;

public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  public void depositar(double valor) {
    this.saldo = this.saldo + valor;
  }

  // depositar: esse método é responsável por receber um valor do tipo double e somá-lo ao saldo da conta;
  // sacar: esse método é responsável por receber um valor do tipo double e subtraí-lo do saldo da conta;
  // mostrarSaldo: esse método deve retornar um valor do tipo double representando o saldo da conta.
  // mostrarTitularConta: esse método deve retornar o nome da pessoa titular da conta.

}
