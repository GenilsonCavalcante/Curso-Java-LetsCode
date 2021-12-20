package com.letscode.Class07;

import java.math.BigDecimal;
import java.util.Arrays;

import static java.math.BigDecimal.*;

public class Main {
  public static void main(String[] args) {
    /*MODIFICADORES DE ACESSO:
    *
    * public - Onde sua visualização é pública
    * private - Sua vizualização é privada, acessando seus átributos através dos métodos getters e setters.
    * protect - Sua vizualização é protegida, e somente as classes do pacote que a contém que são capazes de acessalas
    * deafult - É o padrão, onde que não é preciso escrever o nome deafult para poder declará-lo.
    * */

    /*
    String nome = "Genilson";
    int matricula = 224;
    BigDecimal salario = new BigDecimal(1200);
     */

    //Vendedor alguem = new Vendedor();
    //alguem.nome = "alguem";

    Gerente gerente = new Gerente("Genilson", 123123, new BigDecimal(1200));

    //gerente.contratar(alguem);

    gerente.demitir(0);

    for (Vendedor vendedor : gerente.getVendedores()) {
      if (vendedor != null) {
        System.out.println(vendedor.nome);
      }
    }


    System.out.println(gerente);

  }
}
