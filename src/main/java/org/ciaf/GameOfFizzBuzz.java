package org.ciaf;

import java.util.Scanner;

public class GameOfFizzBuzz /*Juego del FizzBuzz*/{
    /* Contexto: Imprime los numeros del 1 al n, pero para multiplos de 3 imprime
    ”Fizz”, para multiplos de 5 ”Buzz”, y para multiplos de ambos ”FizzBuzz”.
    Parametro: Un entero n.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberUser;
        int count = 1;
        System.out.println("Bienvenido al juego del FizzBuzz");
        System.out.println("Ingresa un numero entero positivo mayor a uno para empezar el juego e imprimir el resultado.");
        numberUser = sc.nextInt();
        while (count <= numberUser){
            if (count%3 == 0 && count%5 == 0) {
                System.out.println(count + " FizzBuzz");
            }else if (count%3 == 0){
                System.out.println(count + " Fizz");
            } else if (count%5 == 0) {
                System.out.println(count + " Buzz");
            } else {
                System.out.println(count + " No aplica.");

            }
            count += 1;
        }
    }
}
