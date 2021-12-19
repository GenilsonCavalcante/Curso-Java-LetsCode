package com.letscode.Class05;

import java.util.Scanner;

public class InvertedWord {
  {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um palavra: ");
    String typedWord = scanner.next();

    char[] letters = null;
    letters = typedWord.toCharArray();
    //System.out.println(letters[0]);

    for (int j = letters.length - 1; j >= 0; j--) {
      System.out.println(letters[j]);
    }


  }
}
