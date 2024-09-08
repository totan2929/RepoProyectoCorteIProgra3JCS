package org.ciaf;

import java.util.Scanner;

public class VowelCounter /*Contador de vocales*/{
    /*Contexto: Cuenta cuantas vocales tiene una cadena de texto ingresada.
    Parametro: Una cadena texto.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words;
        int sumVowels = 0;
        char[] arrWords = new char[28];
        System.out.println("Escribe una palabra por favor: ");
        words = sc.nextLine().toLowerCase();
        arrWords = words.toCharArray();

        for (char letter : arrWords){
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                sumVowels += 1;
            }
        }

        System.out.println("La cadena de texto " + words + " tiene " + sumVowels + " vocales.");

    }
}
