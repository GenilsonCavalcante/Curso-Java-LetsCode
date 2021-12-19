package com.letscode.Class06;

public class Pessoa {

  private String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  /*
  public void setNome(String nome) {//OBS: Envés de setarmos o nome nesse método, ele pode ser instanciado novamente
    // e o nome pode ser alterado novamente, para podermos evitar isso, podemos atribuir esse atributo nome dentro do
    // método construtor, fazendo com que o nome possa ser definido uma únida vez e claro, o tornando obrigatório
    // tambem.
    this.nome = nome;
  }
   */

  public String getNome() {
    return nome;
  }
}
