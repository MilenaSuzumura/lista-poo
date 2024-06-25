package com.trybe.acc.pessoausuaria;

public class PessoaUsuaria extends Pessoa {

  public PessoaUsuaria(String nome, String sobrenome) {
    super.nome = nome;
    super.sobrenome = sobrenome;
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getPessoaUsuaria() {
    boolean name = nome == null || nome.isEmpty();
    boolean lastname = sobrenome == null || sobrenome.isEmpty();

    if(name || lastname) {
      return "Pessoa usuária inválida";
    } else {
      String nomeCompleto = nome + "." + sobrenome;
      return nomeCompleto.toLowerCase();
    }
  }
}
