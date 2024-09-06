package org.ciaf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AverageOfNNumbers /*Promedio de N numeros*/{
    /* Contexto: Calcula el promedio de n numeros ingresados.
    Parametro: Un entero n (cantidad de numeros) seguido de n enteros.
    */
    public static void main(String[] args) {
        int numberInt;
        int response=1;
        int option=1;
        float average=0;
        ArrayList listNumbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de Promedios");
        do {
            System.out.println("Ingresa un numero");
            numberInt = sc.nextInt();
            listNumbers.add(numberInt);
            System.out.println("Deseas ingresar otro numero: Escribe 1 para si o cualquier otro numero para obtener el promedio.");
               int optionTwo = sc.nextInt();
              if (option != optionTwo){
                  response = 2;
                  System.out.println("********************************************");
              }
        }while(response == 1);
        Iterator i = listNumbers.iterator();
        while (i.hasNext()){
            average = average + (int)i.next();
        }

        System.out.println("El promedio de los numeros ingresados es: " + average / listNumbers.size());
        System.out.println("Gracias por usar nuestro sistema!!!!!!");
        System.out.println("********************************************");


    }
}
