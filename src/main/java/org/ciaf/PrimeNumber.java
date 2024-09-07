package org.ciaf;

import java.util.Scanner;

public class PrimeNumber /*Numero Primo*/{
    /* Contexto: Verifica si un numero dado n es primo.
    Parametro: Un entero n.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Ingrese un numero entero positivo: ");
        number = sc.nextInt();

        if (number%2 != 0 && number%3 !=0 || number ==5 || number == 2){
            System.out.println("El numero: " + number + " es un numero primo");
        }else {
            System.out.println("El numero: " + number + " No es un numero primo");
        }


    }
}
