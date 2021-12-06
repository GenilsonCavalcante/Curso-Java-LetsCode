package com.letscode;

import com.letscode.Class01.DaysOfWeek;
import com.letscode.Class01.MonthsOfTheYear;

public class Main {

    public static void main(String[] args) {

        DaysOfWeek classDay = DaysOfWeek.Monday; //Object type variable

        MonthsOfTheYear classMonth = MonthsOfTheYear.December;

        System.out.println("Class on (" + classDay + ") of month (" + classMonth + ")");

    }
}

/*
enum MesesDoAno {
    Janeiro (1), Fevereiro (2), Março (3);

    public int mes;
    MesesDoAno (int valor) {
        mes = valor;
    }
}
*********
boolean verificacao = 10 == 10 & 10 == 20; //Existe uma diferença entre && e apenas um &. Com dois && verifica a primeira sentença, caso seja falsa, ela não irá verificar a segunda, retornando falso.
System.out.println(verificacao);

*/
