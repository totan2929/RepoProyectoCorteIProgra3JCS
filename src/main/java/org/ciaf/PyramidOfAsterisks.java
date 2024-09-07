package org.ciaf;

import java.util.Scanner;

public class PyramidOfAsterisks /*Piramide de Asteriscos*/{
    /* Contexto: Dibuja una piramide de asteriscos con n niveles.
    Parametro: Un entero n.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pyramidHeight;
        System.out.print("Ingresa un numero entero positivo por favor para la altura de la piramide de asteriscos que deseas crear: ");
        pyramidHeight = sc.nextInt();

        for(int i = 1; i<=pyramidHeight; i++){

            for(int whiteSpace = 1; whiteSpace<=pyramidHeight-i; whiteSpace++){
                System.out.print(" ");
            }


            for(int asterisks=1; asterisks<=(i*2)-1; asterisks++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }



