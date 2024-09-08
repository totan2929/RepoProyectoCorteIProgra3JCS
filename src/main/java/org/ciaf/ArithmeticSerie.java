package org.ciaf;

import java.util.Scanner;

public class ArithmeticSerie /*Serie aritmetica*/{
    /* Contexto: Calcula la suma de los primeros n terminos de una serie aritmetica
    con una diferencia comun d.
    Parametros: Tres enteros n, a (primer termino), y d (diferencia comun).
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberTerms;
        int firstTerm;
        int differenceCommon;

        System.out.print("ingresa el numero de terminos de la serie Aritmetica: ");
        numberTerms = sc.nextInt();

        System.out.print("Ingresa el primer termino de la serie: ");
        firstTerm = sc.nextInt();

        System.out.print("Ingresa la diferencia comun de la serie: ");
        differenceCommon =sc.nextInt();

        System.out.println("La serie aritmetica de los primeros " + numberTerms + " del numero " + firstTerm + " con diferencia comun de " + differenceCommon + " es: ");
        int[] termsSerie = new int[numberTerms];
        termsSerie[0] = firstTerm;

        for (int i = 1; i < termsSerie.length; i++) {
            int x = i - 1;
            termsSerie[i] = termsSerie[x] + differenceCommon;
            System.out.print(termsSerie[x] + ",");
        }




    }


}
