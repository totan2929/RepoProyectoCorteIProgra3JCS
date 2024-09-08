package org.ciaf;

import java.util.Scanner;

public class GreatestCommonDivisor /*Maximo comun Divisor*/{
    /*Contexto: Calcula el MCD de dos numeros.
    Parametros: Dos enteros a y b. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA;
        int numberB;
        System.out.println("Calcula el Maximo Comun divisor de dos numeros.");
        System.out.print("Ingresa el primer numero: ");
        numberA = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numberB = sc.nextInt();

        while (numberA != numberB){
            if (numberA > numberB){
                numberA = numberA - numberB;
            }else {
                numberB = numberB - numberA;
            }

        }
        System.out.println("El MCD es: " + numberA);
    }
}
