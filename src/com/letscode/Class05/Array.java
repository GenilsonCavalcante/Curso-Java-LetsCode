package com.letscode.Class05;

import java.util.Arrays;

public class Array {

  {

    //Declaração de Array:
    int[] arr1 = new int[10];
    int[] arr2 = {1,2,3,4,5};

    //Adição de valores em Arrays:
    for (int n = 0; n < arr1.length; n++) {
      arr1[n] = n +1;
      System.out.println(arr1[n]);
    }

    int i = 0;
    while (i < arr2.length) {
      System.out.println(arr2[i]);
      i++;
    }

    //Métodos para manipulação de Arrays:
    System.out.println(Arrays.toString(arr1));//Retorna todos os valores do Array dentro de colchetes;
    System.out.println(Arrays.stream(arr2).findFirst());//Retorna o primeiro valor do Array;
    System.out.println(Arrays.stream(arr2).max());//Retorna o maior valor do array;



  }
}
