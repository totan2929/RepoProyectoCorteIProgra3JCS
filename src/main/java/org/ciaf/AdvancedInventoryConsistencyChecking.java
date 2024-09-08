package org.ciaf;

import java.util.Scanner;

public class AdvancedInventoryConsistencyChecking {
    /*Contexto: Un supermercado quiere verificar que el inventario fısico de los
productos coincida con los registros del sistema. Para esto, se comparan las
5
cantidades de cada producto y se genera un reporte de discrepancias.
Par´ametros:
Entrada: Dos arrays de numeros enteros que representan las cantidades en
inventario f´ısico y en el sistema.
Salida: N´umero total de discrepancias y la lista de productos con diferencia.
Operaciones: Recorrer ambos arrays, comparar valores y registrar las diferencias.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inventorySystenm = {50,12,5,234,90,76,34,21,2,9,800,56,78,23,12,65,0,123,45,67};
        int[] physicalInventory = new int[20];
        int[] differenceInventories = new int[20];
        int inconsistencies = 0;


        for (int i = 0; i < physicalInventory.length; i++) {
            System.out.println("Ingresa la cantidad del producto: " + (i + 1));
            physicalInventory[i] = sc.nextInt();
        }
        for (int j = 0; j < differenceInventories.length; j++) {

            differenceInventories[j] = inventorySystenm[j] - physicalInventory[j];
        }

        for (int k = 0; k < differenceInventories.length; k++) {
            if (differenceInventories[k] != 0){
                inconsistencies++;
                System.out.println("El producto " + (k + 1) + " En la comparativa de inventarios tiene una inconsistencia de: " + differenceInventories[k]);
            }

        }
        if (inconsistencies == 0){
            System.out.println("El inventario fue perfecto, muchas gracias por usar nuestro sistema!!!");
        }else {
            System.out.println("El inventario tuvo: " + inconsistencies + " Inconsistencias.");

        }
    }


}
