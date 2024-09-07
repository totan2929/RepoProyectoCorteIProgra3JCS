package org.ciaf;

import java.util.Scanner;

public class FactorialOfANumber /*Factorial De un Numero*/{
    /*Contexto: Calcula el factorial de un numero dado n.
    Parametro: Un entero n.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Ingresa un numero entero positivo: ");
        number = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("El factorial del numero " + number + " es: " + factorial);
    }
}
