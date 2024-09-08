package org.ciaf;

import java.util.Scanner;

public class FibonacciSequence /*Secuencia Fibonacci*/{
    /*Contexto: Genera los primeros n terminos de la secuencia de Fibonacci.
    Parametro: Un entero n.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberuser;
        int fibonacci;

        System.out.print("Ingresa un numero para genera su secuencia Fibonacci: ");
        numberuser = sc.nextInt();

        fibonacci = fibonacci(numberuser);

        System.out.println("El Fibonacci de: " + numberuser + " es: " + fibonacci);

    }

    public static int fibonacci(int numberUser){
        if (numberUser ==0 || numberUser ==1){
            return numberUser;
        }else {
            return fibonacci(numberUser - 1) + fibonacci(numberUser - 2);
        }
    }
}
