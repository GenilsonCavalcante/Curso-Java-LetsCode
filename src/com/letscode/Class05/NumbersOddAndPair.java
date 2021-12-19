package com.letscode.Class05;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersOddAndPair {

  {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    for (int j = 1; j <= 5; j++) {
      System.out.println("Digite o " + j + "° número");
      int onlyNumber =+ scanner.nextInt();

      numbers.add(onlyNumber);

    }
    ArrayList<Integer> pair = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();


    for (int i = 0; i < 5; i++) {
      if (numbers.get(i) % 2 == 0) {
        pair.add(numbers.get(i));
      } else {
        odd.add(numbers.get(i));
      }
    }

    System.out.println("Pares: " + pair);
    System.out.println("Impares: " + odd);

  }

}
