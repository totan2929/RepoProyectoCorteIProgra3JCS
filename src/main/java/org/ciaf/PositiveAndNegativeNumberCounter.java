package org.ciaf;


import java.util.Scanner;

public class PositiveAndNegativeNumberCounter /*Contador de numeros positivos y negativos*/{
    /* Contexto: Cuenta cuantos numeros positivos y cuantos negativos hay en una
    lista de n numeros.
    Parametros: Un entero n seguido de n numeros.*/
    public static void main(String[] args) {
        int numberInt;
        int response=1;
        int option=1;
        int sumPositiveNumbers=0;
        int sumNegativeNumbers=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al contador de numeros positivos o negativos ingresados: ");
        do {
            System.out.println("Ingresa un numero entero positivo o negativo: ");
            numberInt = sc.nextInt();
            if (numberInt > 0){
                sumPositiveNumbers += 1;
            }else{
                sumNegativeNumbers += 1;
            }

            System.out.println("Deseas ingresar otro numero: Escribe 1 para si o cualquier otro numero para obtener el resultado.");
            int optionTwo = sc.nextInt();
            if (option != optionTwo){
                response = 2;
                System.out.println("********************************************");
            }
        }while(response == 1);

        System.out.println("El total de  numeros positivos ingresados es: " + sumPositiveNumbers);
        System.out.println("El total numeros negativos ingresados es: " + sumNegativeNumbers);
        System.out.println("Gracias por usar nuestro sistema!!!!!!");
        System.out.println("********************************************");

    }
}
