package com.letscode.Class05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListFruits {

  {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> typesFromFruits = new ArrayList<>();

    for (int j = 1; j < 6; j++) {
      System.out.println("Digite o nome da "+ j + "° fruta:");
      String typeFruit = scanner.next();

      typesFromFruits.add(typeFruit);
    }

    System.out.printf("As frutas que você digitou foram: %s%n", typesFromFruits);
  }

}
