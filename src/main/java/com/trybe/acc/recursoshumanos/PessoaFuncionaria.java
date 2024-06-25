package com.trybe.acc.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {
  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

  /**
   * Construtor.
   */
  public PessoaFuncionaria(String nome, String cpf, String endereco, double salario) {
    this.nomeCompleto = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.salario = salario;
  }

  public String getNomeCompleto() {
    return this.nomeCompleto;
  }

  public void setNomeCompleto(String nome) {
    this.nomeCompleto = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
