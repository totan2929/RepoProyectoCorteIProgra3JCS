package org.ciaf;

import java.util.Scanner;

public class NumberOfDaysInAMonth /*Numero de dias en un mes*/{
    /* Contexto: Dado un mes (1-12), devuelve la cantidad de dıas en ese mes, considerando si es un anio bisiesto.
    Parametros: Un entero mes y un entero anio.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        int month;
        boolean leapyear = false;
        System.out.print("Ingresa el numero del año del cual deseas saber los dias del mes: ");
        year = sc.nextInt();
        if (year%400 == 0){
            leapyear = true;
        }else if (year%4 == 0 && year%100 !=0){
            leapyear = true;
        }else {
            leapyear = false;
        }
        System.out.println("Ingresa el numero del mes del que deseas saber el numero de dias en el año: " + year);
        month = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes " + month + " del año " + year + " es de 31 dias");
                break;
            case 2:
                if (leapyear){
                    System.out.println("El mes " + month + " del año " + year + " es de 29 dias porque corresponde a un año bisiesto");
                }else {
                    System.out.println("El mes " + month + " del año " + year + " es de 28 dias");

                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes " + month + " del año " + year + " es de 30 dias");
                break;
            default:
                System.out.println("Numero de mes incorrecto debe estar entre 1 y 12.");

        }
    }


}
