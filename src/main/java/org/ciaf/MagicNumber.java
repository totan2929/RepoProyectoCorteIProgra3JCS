package org.ciaf;

import java.util.Scanner;

public class MagicNumber /*Numero Magico*/{
    /* Contexto: Verifica si un numero es ”magico”, donde la suma de los dıgitos de
    un numero se repite hasta obtener un solo dıgito igual a 1.
    Parametro: Un entero n.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberUser;

        System.out.println("Ingresa un numero entero positivo: ");
        numberUser = sc.nextInt();

        if (ItsMagicNumber(numberUser)){
            System.out.println("El numero " + numberUser + " es magico.");
        }else{
            System.out.println("El numero " + numberUser + " no es magico.");
        }

    }

    public static boolean ItsMagicNumber(int numberUser) {
        while (numberUser >=10){
            numberUser = sumDigits(numberUser);
        }
        return numberUser == 1;
    }

    public static int sumDigits (int numberUser){
        int sum = 0;
        while (numberUser >0){
            sum += numberUser%10;
            numberUser /=10;
        }
        return sum;
    }
}
