package org.ciaf;

import java.util.Scanner;

public class PerfectNumbers /*Numeros perfectos*/{
    /* Contexto: Verifica si un numero n es perfecto (la suma de sus divisores propios
    es igual al numero).
    Parametro: Un entero n.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberuser;
        int sum = 1;

        System.out.print("Ingre un numero entero positivo: ");
        numberuser = sc.nextInt();
        for (int i = 2; i < numberuser; i++) {
            if (numberuser%i == 0){
                sum += i;
            }
        }

        if (sum == numberuser){
            System.out.println("El numero ingresado : " + numberuser + " es perfecto!!!!");
        }
    }
}
