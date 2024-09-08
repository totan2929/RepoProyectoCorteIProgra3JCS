package org.ciaf;

import java.util.Scanner;

public class OrderThreeNumbers /*Ordenar tres numeros*/{
    /* Contexto: Ordena tres numeros enteros de menor a mayor.
    Parametros: Tres enteros a, b, y c.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA;
        int numberB;
        int numberC;
        int[] ascendingNumbers = new int[3];

        System.out.println("Ingresa 3 numeros enteros positivos para mostrar como resultado los numeros ordenados de menos a mayor: ");
        System.out.print("Ingresa el primer numero: ");
        numberA = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numberB = sc.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        numberC = sc.nextInt();

        if (numberA < numberB && numberA < numberC){
            ascendingNumbers[0] = numberA;
            if (numberC < numberB){
                ascendingNumbers[1]= numberC;
                ascendingNumbers[2]= numberB;
            }else {
                ascendingNumbers[1] = numberB;
                ascendingNumbers[2] = numberC;
            }
        }else if (numberB < numberC && numberB < numberA) {
            ascendingNumbers[0] = numberB;
            if (numberC < numberA){
                ascendingNumbers[1]= numberC;
            }else {
                ascendingNumbers[1] = numberA;
                ascendingNumbers[2] = numberC;
            }
        }else {
            ascendingNumbers[0]= numberC;
            ascendingNumbers[1]= numberB;
            ascendingNumbers[2] = numberA;
        }
        System.out.print("Los numeros ingresados en forma ascendente son: ");
        for (int number : ascendingNumbers){
            System.out.print(number + " ");
        }
    }
}
