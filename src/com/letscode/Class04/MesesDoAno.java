package com.letscode.Class04;

import java.util.Scanner;

//OBS: Atalho que formata o código: CTRL + ALT + L;
//OBS: Para remover os import's não mais utilizados: CTRL + ALT + O;
//OBS: É possível dentro de um case, fazermos uma estrutura de if e else;
public class MesesDoAno {
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um número para o mês: ");
    int month = Integer.parseInt(sc.nextLine());
    String monthString;

    switch (month) {
      case 1:
        monthString = "Janeiro";
        break;
      case 2:
        monthString = "Fevereiro";
        break;
      case 3:
        monthString = "Março";
        break;
      case 4:
        monthString = "Abril";
        break;
      case 5:
        monthString = "Maio";
        break;
      case 6:
        monthString = "Junho";
        break;
      case 7:
        monthString = "Julho";
        break;
      case 8:
        monthString = "Agosto";
        break;
      case 9:
        monthString = "Setembro";
        break;
      case 10:
        monthString = "Outubro";
        break;
      case 11:
        monthString = "Novembro";
        break;
      case 12:
        monthString = "Dezembro";
        break;
      default:
        monthString = "Esse número não corresponde";
    }

    if (month > 0 && month < 13) {
      System.out.println("O mês informado se refere á " + monthString);
    } else {
      System.out.println(monthString);
    }
  }
}