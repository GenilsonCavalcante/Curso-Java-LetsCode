package com.letscode.Class06.Banco;

import lombok.Getter;


/**
* OBS: Com a extenção lombok, podemos apenas informar as palavras:
 *  @Getter
 *  @Setter
 *  Dessa forma, não precisamos escrever todos os métodos getters e setters.
**/

public class BancoMain {
  public static void main(String[] args) {

    Conta contaGenilson = new Conta("Genilson", 212121);
    contaGenilson.setSaldo(100);
    contaGenilson.sacar(80);
    contaGenilson.depositar(300);
    contaGenilson.getSaldo();

    System.out.println(contaGenilson);//Isso irá imprimir o endereço da memória, logo, devemos passar um toString
    // para que consiguemos obter o valor do nosso objeto.

  }
}
