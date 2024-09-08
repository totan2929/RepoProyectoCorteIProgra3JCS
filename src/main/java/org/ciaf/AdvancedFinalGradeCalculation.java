package org.ciaf;

import java.util.Scanner;

public class AdvancedFinalGradeCalculation /*Calculo de notas Finales*/{
    /*Contexto: Un sistema escolar necesita calcular la nota final de un grupo de
    estudiantes basada en tres notas parciales. Se requiere tambien determinar
    cuantos estudiantes aprobaron y cuantos reprobaron.
    Parametros:
    Entrada: Array bidimensional donde cada fila representa a un estudiante y las
    columnas sus tres notas.
    Salida: Array de notas finales, numero de aprobados y reprobados.
    Operaciones: Recorrer cada fila, calcular la nota final como el promedio de
    las tres notas y contar aprobados y reprobados.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityStudents;
        int numberGrades = 3;
        int studentsPassed = 0;
        int studentsFailed = 0;
        double finalNote;

        System.out.println("Ingresa el numero de estudiantes: ");
        quantityStudents = sc.nextInt();

        double[][] notesStudents = new double[quantityStudents][numberGrades];

        for (int i = 0; i < quantityStudents; i++) {
            System.out.println("Ingresa la nota del estudiante " + (i +1) + ":");
            for (int j = 0; j < numberGrades; j++) {
                notesStudents[i][j] = sc.nextDouble();
            }
        }

        double[] finalsNotes = new double[quantityStudents];
        for (int i = 0; i < notesStudents.length; i++) {
            double sumNotes =0;
            for (int j = 0; j < notesStudents[i].length; j++) {
                sumNotes += notesStudents[i][j];
            }
            finalNote = sumNotes / notesStudents[i].length;
            finalsNotes[i] = finalNote;

            if (finalNote >= 3.0){
                studentsPassed++;
            }else {
                studentsFailed++;
            }
        }

        System.out.println("El total de estudiantes evaluados en el sistema fue: " + quantityStudents);
        System.out.println("El total de estudiantes que Aprobaron fueron: " + studentsPassed);
        System.out.println("El total de estudiantes que Reprobaron fueron: " + studentsFailed);


    }




}
