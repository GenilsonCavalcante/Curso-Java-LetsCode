package com.letscode.Class04;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Condicionais {
  {
  /*
  //Existiá momentos em que teremos erros no método Scanner com relação aos tipos de dados, logo, podemos resolver
  // com a conversão inbutida pelo próprio scanner. Veja:
  Scanner scanner = new Scanner(System.in);
  int num = Integer.parseInt(scanner.nextLine());
  double teste = Double.parseDouble(scanner.nextLine());
  */

    /****************************************
     * pessoas < 16 - Não podem votar
     * pessoas >= 16 && < 18 - opcional
     * pessoas > 70 - opcional
     * pessoas > 18 - obrigatório
     * pessoas < 70 - obrigatorio
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua idade: ");
    int idade = Integer.parseInt(sc.nextLine());

    if ((idade >= 16 && idade < 18) || idade > 70) {
      System.out.println("Seu voto é opcional");
    } else if (idade < 16) {
      System.out.println("Você não pode votar");
    } else {
      System.out.println("Seu voto é obrigatório");
    }
  }

}
