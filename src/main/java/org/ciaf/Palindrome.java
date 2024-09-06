package org.ciaf;

import java.util.Scanner;

public class Palindrome /*Palindromo*/{
    /* Contexto: Verifica si una cadena de texto es un palındromo.
    Parametro: Una cadena texto.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordUser;
        String palindrome;
        System.out.println("Bienvenido ingresa una palabra para ver si es palindromo");
        wordUser = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(wordUser);
        palindrome = stringBuilder.reverse().toString();
        if (wordUser.equalsIgnoreCase(palindrome)){
            System.out.println("La palabra: " + wordUser + " Es palindromo ya que al reves es: " + palindrome);
        }else {
            System.out.println("La palabra: " + wordUser + " NO Es palindromo ya que al reves es: " + palindrome);

        }

    }


}
