package org.ciaf;

import java.util.Scanner;

public class MultiplicationTable /*Tabla de Multiplicar*/{
    /* Contexto: Genera la tabla de multiplicar de un numero n.
    Parametro: Un entero n.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Ingresa un numero para obtener sub tabla de multiplicar");
        number = sc.nextInt();

        System.out.println("tabla de multiplicar del " + number + " es:");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
