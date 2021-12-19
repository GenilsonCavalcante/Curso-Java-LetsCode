package com.letscode.Class06;

import com.letscode.Class06.Pessoa;

public class Encapsulamento {

  public static void main(String[] args) {

    //Visibilidade do método: public, private, default, protect;

    Pessoa genilson = new Pessoa("Genilson");


    //pessoa.nome = "Genilson";  //Não podemos alterar o atributo diretamente, quando estamos trabalhando com
    // encapsulamento.

    //Métodos Acessores:
    //genilson.setNome("Genilson");
    String genilsonNome = genilson.getNome();


    System.out.println(genilsonNome);
  }

}
