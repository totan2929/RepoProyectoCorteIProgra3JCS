package org.ciaf;

import java.util.Scanner;

public class LeastCommonMultiple /*Minimo comun multiplo*/{
    /* Contexto: Calcula el MCM de dos numeros.
    Parametros: Dos enteros a y b.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA;
        int numberB;
        int mcm=1;
        int i =2;

        System.out.println("Calcula el Maximo Comun divisor de dos numeros.");
        System.out.print("Ingresa el primer numero: ");
        numberA = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numberB = sc.nextInt();

        while (i <= numberA || i <= numberB){
            if (numberA%i == 0 ||  numberB%i ==0) {
                mcm *= i;

                if (numberA % i == 0) {
                    numberA /= i;
                }
                if (numberB % i == 0) {
                    numberB /= i;
                }
            }else {
                i += 1;
            }
        }
        System.out.println("El mcm es: " + mcm);


    }
}
