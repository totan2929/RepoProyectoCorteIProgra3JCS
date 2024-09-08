package org.ciaf;

import java.util.Scanner;

public class WordCountInASentence /*Conteo de palbras en una frase*/{
    /* Contexto: Cuenta cuantas palabras tiene una frase ingresada.
    Parametro: Una cadena frase.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        String[] words;

        System.out.println("Ingresa una frase por favor: ");
        phrase = sc.nextLine();
        words = phrase.trim().split(" +");
        System.out.println("La frase: " + phrase + " tiene " + words.length + " palabras.");
    }
}
