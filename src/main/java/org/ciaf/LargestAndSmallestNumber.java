package org.ciaf;

import java.util.Scanner;

public class LargestAndSmallestNumber /*Numero mas grande y mas pequenio*/{
    /* Contexto: Encuentra el numero mas grande y el mas pequeno en una lista de
    n numeros.
    Parametros: Un entero n seguido de n numeros.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] listNumbers = new int[10];
        int numberUser;
        int majorNumber = 0;
        int minorNumber = 0;

        System.out.println("Ingresa 10 numeros enteros positivos o negativos para decirte cual es el menor y el mayor de los numeros ingresados.");
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.println("Ingresa un numero por favor: ");
            numberUser = sc.nextInt();
            listNumbers[i]= numberUser;
        }

        for (int j = 0; j < listNumbers.length; j++) {
            if (listNumbers[j] >= majorNumber){
                majorNumber = listNumbers[j];
            }
        }
        minorNumber = majorNumber;
        for (int z = 0; z < listNumbers.length; z++) {
            if (listNumbers[z] <= minorNumber){
                minorNumber = listNumbers[z];
            }
        }

        System.out.println("El numero mayor de los numeros ingresado es: " + majorNumber);
        System.out.println("El numero menor de los numeros ingresado es: " + minorNumber);

    }
}
