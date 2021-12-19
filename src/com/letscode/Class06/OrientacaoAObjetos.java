package com.letscode.Class06;

public class OrientacaoAObjetos {

  public static void main(String[] args) {

    Vendedor vendedor = new Vendedor(11);
    vendedor.nome = "Genilson";
    vendedor.idade = 20;
    vendedor.baterPonto();
    System.out.println(vendedor.matricula);

    System.out.println("=============================");

    Diretor diretor = new Diretor();
    diretor.nome = "Alquem";
    diretor.idade = 30;
    diretor.baterPonto();


  }

  static class Funcionario {
    long matricula;
    String nome;
    int idade;

    public void baterPonto() {
      System.out.println("Batendo ponto...");
    }

  }

  static class Vendedor extends Funcionario {

    public Vendedor(long matricula) {
      //Esse é um exemplo de um construtor vazio, o java já traz ele por padrão, sem haver a
      // necessidade de declararmos.
      //Com esse construtor, podemos obrigar através do instânciamento do método, a colocar um valor do atributo.

      this.matricula = matricula; //this é uma instância desse objeto, para que possamos atribuir o valor passado
      // através do parâmetro.
    }
  }

  static class Diretor extends Funcionario {

    @Override //Sobreescrita do método original
    public void baterPonto() {
      System.out.println(this.nome + " batendo ponto...");
    }

  }


}
