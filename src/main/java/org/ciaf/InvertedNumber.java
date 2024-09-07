package org.ciaf;

import java.util.Scanner;

public class InvertedNumber /*Numero Invertido*/{
    /*Contexto: Dado un numero n, invierte sus dıgitos.
    Parametro: Un entero n*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int invertedNumber = 0;
        int rest;

        System.out.println("Ingresa un numero entero positivo por favor, para darte el numero invertido: ");
        number = sc.nextInt();

        while (number >0){
            rest = number % 10;
            invertedNumber = invertedNumber * 10 + rest;
            number /= 10;
        }
        System.out.println("El numero invertido del numero: " + number + " es: " + invertedNumber);
    }
}
