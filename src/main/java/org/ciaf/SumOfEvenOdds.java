package org.ciaf;

import java.util.Scanner;

public class SumOfEvenOdds /*Suma de pares e impares*/{
    /* Contexto: Suma los numeros pares e impares por separado en una lista de n
    numeros.
    Parametros: Un entero n seguido de n numeros.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers;
        int numberList = 0;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        System.out.println("cuantos numeros deseas ingresar: ");
        numbers = sc.nextInt();
        int[] arrayNumbers = new int[numbers];

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Ingresa un numero por favor;");
            numberList = sc.nextInt();
            arrayNumbers[i] = numberList;
        }

        for (int number : arrayNumbers){
            if (number%2 == 0){
                sumEvenNumbers += number;
            }else{
                sumOddNumbers += number;
            }
        }

        System.out.println("La suma de los numeros pares ingresados es: " + sumEvenNumbers);
        System.out.println("La suma de los numeros pares ingresados es: " + sumOddNumbers);
        System.out.println("Gracias por utilizar nuestro sistema!!!");

    }
}
