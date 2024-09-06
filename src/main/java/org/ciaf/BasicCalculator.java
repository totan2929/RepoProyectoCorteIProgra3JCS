package org.ciaf;

import java.util.Scanner;

public class BasicCalculator /*Calculadora Basica*/ {
    /* Contexto: Implementa una calculadora basica que soporte suma, resta, multiplicacion y division.
    Parametros: Dos enteros a, b y un caracter operacion.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        char operation;
        System.out.println("Bienvenido a la Calculadora Basica donde puedes hacer opraciones con 2 numeros.");
        System.out.print("Ingresa el primer Numero: ");
        a =sc.nextInt();
        System.out.print("Ingresa el segundo Numero: ");
        b =sc.nextInt();
        System.out.println("Ingresa el simbolo para la operacion a realizar: /n '+' para suma. /n '-' para resta /n '*' para multiplicacion /n '/' para division");
        operation = sc.next().charAt(0);
        int result = calculate(a,b,operation);
        System.out.println("*************************************************************************");
        System.out.println("El de resultado de: " + a + " " + operation + " " + b + " es: " + result);
        System.out.println("*************************************************************************");

    }

    public static int calculate(int a, int b, char operation){
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if(b != 0){
                    return a + b;
                }else{
                    System.out.println("No se puede dividir por cero");
                    return 0;
                }
            default:
                System.out.println("operacion no valida!!!!!");
                return 0;
        }
    }

}


