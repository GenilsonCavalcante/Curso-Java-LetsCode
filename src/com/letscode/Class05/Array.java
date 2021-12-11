package com.letscode.Class05;

import java.util.Arrays;

public class Array {

  {

    /*

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

     */


    //Tipos de Arrays:
    char[] codeFrom = {'G','E','N','I','L','S','O','N'};

    char[] copyTo = Arrays.copyOfRange(codeFrom, 0, 5);//Esse método copia um array especificado, e através dos
    // indices, podemos informar de onde começa e onde termina a parte que queremos copiar desse array.
    System.out.println(copyTo);


    //Introdução a Matrizes:
    double[][] notasAlunos = new double[3][4];//Uma matrix 3 X 4. 3 linhas e 4 colunas;

    int[][] matrizInteiros = new int[3][4];//Declaração de uma matriz do tipo int;
    //Atribuições:
    matrizInteiros[0][0] = 7;
    matrizInteiros[0][1] = 9;
    matrizInteiros[0][2] = 8;
    matrizInteiros[0][3] = 5;

    /*
    for (int n1 = 0; n1 < matrizInteiros.length; n1++) {//pegando as linhas
      for (int n2 = 0; n2 < matrizInteiros[n1].length; n2++) {//pegando as colunas
        System.out.println(matrizInteiros[n1][n2]);
      }
    }
    */

    //A mesma matriz acima, so que não imprimindo o zero:
    for (int n1 = 0; n1 < matrizInteiros.length; n1++) {//pegando as linhas
      for (int n2 = 0; n2 < matrizInteiros[n1].length; n2++) {//pegando as colunas
        if (matrizInteiros[n1][n2] > 0.0) {
          System.out.println(matrizInteiros[n1][n2]);
        }
      }
    }

  }
}
