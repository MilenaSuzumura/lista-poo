package com.trybe.acc.contapoupanca;

public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  public ContaPoupanca(String nome, double saldo) {
    this.titularConta = nome;
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo = this.saldo + valor;
  }

  public void sacar(double valor) {
    this.saldo = this.saldo - valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
