package org.ciaf;

import java.util.Scanner;

public class TemperatureConversion /*Conversion de temperatura*/{
    /* Contexto: Convierte una temperatura dada de Celsius a Fahrenheit.
    Parametro: Un numero en Celsius c.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius;
        float fahrenheit;
        System.out.println("Ingresa latemperatura en grados Celsius para convertir a grados Fahrenheit:");
        celsius = sc.nextFloat();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " grados son: " + fahrenheit + " grados.");

    }
}
