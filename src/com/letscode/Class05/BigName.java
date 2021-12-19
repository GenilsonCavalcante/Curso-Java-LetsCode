package com.letscode.Class05;

import java.util.ArrayList;
import java.util.Scanner;

public class BigName {

  {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> letters = new ArrayList<>();

    for (int j = 1; j < 6; j++) {
      System.out.println("Digite o " + j + "° nome: ");
      String typedWord = scanner.next();
      letters.add(typedWord);
    }

    int lenghtName = 0;

    ArrayList<String> bigName = new ArrayList<>();

    for (int i = 0; i < letters.size(); i++ ) {
      if (letters.get(i).length() >= lenghtName) {
        bigName.add(letters.get(i));
      }

      lenghtName = letters.get(i).length();

    }
    System.out.println(letters);
    System.out.println("Maior(es) Palavra(s): " + bigName);
  }

}
