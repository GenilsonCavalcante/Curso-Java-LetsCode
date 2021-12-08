package com.letscode.Class03;

import java.util.Scanner;

public class EntradasESaidas {
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe um número");
    int num = scanner.nextInt();

    boolean isPar = num % 2 == 0;

    if (isPar) {
      System.out.printf("%d é um número PAR", num);
    } else {
      System.out.printf("%d é um número IMPAR", num);
    }
  }
}
