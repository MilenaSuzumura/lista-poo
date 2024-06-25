package com.trybe.acc.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {
  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

  public PessoaFuncionaria(String nome, String Cpf, String Endereco, double Salario)
  {
    this.nomeCompleto = nome;
    this.cpf = Cpf;
    this.endereco = Endereco;
    this.salario = Salario;
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

  public void setEndereco(String Endereco) {
    this.endereco = Endereco;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double Salario) {
    this.salario = Salario;
  }
}
