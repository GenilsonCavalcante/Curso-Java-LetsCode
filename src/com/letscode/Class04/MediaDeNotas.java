package com.letscode.Class04;

import java.util.Scanner;

public class MediaDeNotas {
  {

    Scanner sc = new Scanner(System.in);

    float notas = 0f;
    float media;
    int count = 1;

    System.out.println("Quantas avaliações você faz por bimestre?");
    int totalDeAvaliacoes = Integer.parseInt(sc.nextLine());

    while (count <= totalDeAvaliacoes) {
      System.out.printf("Informe a sua %d° nota: %n", count);
      count += 1;
      notas += sc.nextFloat();
    }

    media = notas / totalDeAvaliacoes;
    System.out.println("Sua média é igual á: " + media);

    /*
    //TESTANDO O FOR
    for (int n = 0; n < 11; n++) {
      System.out.println(n);
    }

    //OUTRO EXEMPLO DE USO COM O SCANNER
    for (int num = sc.nextInt(), count = 1; count < num; count++) {
      System.out.println(count);
    }
    */

  }
}
