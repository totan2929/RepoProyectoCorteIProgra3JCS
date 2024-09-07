package org.ciaf;

import java.util.Scanner;

public class SumEvenNumbers /*Suma Numero pares*/{
    /* Contexto: Dado un numero n, se requiere sumar todos los numeros pares entre
    1 y n.
    Parametro: Un entero n*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sumPairs = 0;
        System.out.println("Ingresa un numero entero positivo para para sumar los numeros pares entre 1 y incluido el numero que ingresas si es par: ");
        number = sc.nextInt();

        for (int i = 1; i <= number ; i++) {

            if (i%2 == 0){
                sumPairs += i;
            }
        }
        System.out.println("La suma de los numeros pares entre 1 y " + number + " incluido el " + number + " si es par es: " + sumPairs);
    }
}
