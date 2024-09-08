package org.ciaf;

import java.util.Scanner;

public class LoopToZeroSum /*Bucle de suma hasta cero*/{
    /* Contexto: Suma una serie de numeros ingresados por el usuario hasta que se
    ingrese un cero.
    Parametros: Una serie de numeros, terminando con un 0.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberUser;
        int sumNumbers = 0;

        do {
            System.out.println("Ingresa un numero");
            numberUser = sc.nextInt();
            sumNumbers += numberUser;
        }while (numberUser != 0);
        System.out.println("La suma de los numeros que ingresaste hasta que pusiste 0 es: " + sumNumbers);
    }
}
