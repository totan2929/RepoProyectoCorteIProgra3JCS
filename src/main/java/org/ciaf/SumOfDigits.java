package org.ciaf;

import java.util.Scanner;

public class SumOfDigits /*Suma de Digitos*/{
    /* Contexto: Suma todos los dıgitos de un numero n.
    Parametro: Un entero n.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int sumDigits = 0;
        String number;
        System.out.println("Ingresa un numero por favor");
        number1 = sc.nextInt();
        number = Integer.toString(number1);

        int[] digits = new int[number.length()];
        int i = digits.length - 1;
        while (number1 > 0){
            digits[i]= number1%10;
            number1 = number1/10;
            i--;
        }
        for (int digit : digits) {
            sumDigits += digit;
        }
        System.out.println("La suma de los digitos del numero " + number + " es: " + sumDigits);
    }
}
