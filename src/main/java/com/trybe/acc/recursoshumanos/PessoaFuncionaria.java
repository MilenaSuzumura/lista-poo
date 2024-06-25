package com.trybe.acc.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {
  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

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

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  //    7 - Crie um método getter para o atributo salario de PessoaFuncionaria.
  //    8 - Crie um método setter para o atributo salario de PessoaFuncionaria.
}
