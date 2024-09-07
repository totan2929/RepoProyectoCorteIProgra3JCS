package org.ciaf;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber /*Adivina el numero*/{
    /* Contexto: Implementa un juego donde el usuario debe adivinar un numero
    entre 1 y 100.
    Parametro: Ninguno, el numero se genera aleatoriamente.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberUser;

        System.out.println("Bienvenido, intenta adivinar el numero.");
        do {
            System.out.println("Intenta adivinar el numero que se encuentra entre 1 y 100.\nEscribe un numero: ");
            numberUser = sc.nextInt();
            if (numberUser < numberToGuess){
                System.out.println("El numero que intentas adivinar es mayor.");
            } else if (numberUser > numberToGuess) {
                System.out.println("El numero que intentas adivinar es menor.");
            }
        }while(numberUser != numberToGuess);
        System.out.println("Felicitaciones has adivinado el numero " + numberToGuess);
    }
}
