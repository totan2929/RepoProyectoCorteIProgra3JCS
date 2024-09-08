package org.ciaf;

import java.util.Scanner;

public class DigitCount /* Conteo de Digitos*/{
    /* Contexto: Cuenta cuantos dıgitos tiene un numero n.
    Parametro: Un entero n.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int totalDigits = 0;
        String number;

        System.out.println("Ingresa un numero entero positivo por favor:");
        number1 = sc.nextInt();
        number = Integer.toString(number1);
        totalDigits = number.length();
        System.out.println("El total de digitos del numero " + number + " es: " + totalDigits);
    }
}
