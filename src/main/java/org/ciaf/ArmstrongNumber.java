package org.ciaf;

import java.util.Scanner;

public class ArmstrongNumber /*Numero Armstrong*/{
    /* Contexto: Verifica si un numero n es un numero Armstrong (la suma de sus
    dıgitos elevados a la potencia de su numero de dıgitos es igual al numero).
    Parametro: Un entero n.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int totalDigits = 0;
        int armstrong = 0;
        int num;


        String number;
        System.out.println("Ingresa un numero por favor");
        number1 = sc.nextInt();
        number = Integer.toString(number1);
        totalDigits = number.length();


        int[] digits = new int[number.length()];
        int i = digits.length - 1;
        while (number1 >= 1){
            num= number1%10;
            num = (int)Math.pow(num,totalDigits);
            armstrong = armstrong + num;
            num = 0;
            number1 = number1/10;
            i--;
        }

        if (armstrong == number1){
            System.out.println("El numero " + number + " es : " + armstrong + " por tanto es un numero Armstrong");

        }else {
            System.out.println("El numero " + number + " es : " + armstrong + " no es un numero Armstrong");

        }
    }

}
