package org.ciaf;

public class AdvancedCalculationOfPromotionsForCustomers /*Calculo de Promociones Para Clientes*/{
    /*Contexto: Una tienda ofrece descuentos a los clientes que alcanzan cierto
    monto de compras en un mes. Se debe calcular qui´enes califican para el descuento y cu´al ser´ıa el nuevo total a pagar.
    Par´ametros:
    Entrada: Array de montos de compras de cada cliente y un valor umbral para
    aplicar el descuento.
    Salida: Lista de clientes con descuento aplicado y el nuevo total.
    Operaciones: Recorrer el array, verificar si el monto supera el umbral, y aplicar
    el descuento cuando corresponda.*/
    public static void main(String[] args) {
        int[] totalDollarsCustomerPurchasesMonth = {5000,200,1500,75,12000,6000,4500,23000,11000,7800,18000,20000,3200,650,15600};
        int thresholdA = 5000;
        int thresholdB = 10000;
        int thresholdC = 15000;
        int percentageDiscutA = 10;
        int percentageDiscutB = 25;
        int percentageDiscutC = 40;

        for (int i = 0; i < totalDollarsCustomerPurchasesMonth.length; i++) {
            if ((totalDollarsCustomerPurchasesMonth[i] >= thresholdA) && (totalDollarsCustomerPurchasesMonth[i] < thresholdB)){
                System.out.println("El cliente " + (i+1) + " tiene compras por : " + totalDollarsCustomerPurchasesMonth[i] + " dolares.");
                System.out.println("Por tanto, tiene un derecho a un descuento de: " + percentageDiscutA + "%. En su proxima compra.");
                System.out.println("*******************************************************************************************************");

            } else if ((totalDollarsCustomerPurchasesMonth[i] >= thresholdB) && (totalDollarsCustomerPurchasesMonth[i] < thresholdC)) {
                System.out.println("El cliente " + (i+1) + " tiene compras por : " + totalDollarsCustomerPurchasesMonth[i] + " dolares.");
                System.out.println("Por tanto, tiene un derecho a un descuento de: " + percentageDiscutB + "%. En su proxima compra.");
                System.out.println("*******************************************************************************************************");

            } else if ((totalDollarsCustomerPurchasesMonth[i] >= thresholdC)) {
                System.out.println("El cliente " + (i+1) + " tiene compras por : " + totalDollarsCustomerPurchasesMonth[i] + " dolares.");
                System.out.println("Por tanto, tiene un derecho a un descuento de: " + percentageDiscutC + "%. En su proxima compra.");
                System.out.println("*******************************************************************************************************");

            }else{
                System.out.println("El cliente " + (i+1) + " tiene compras por : " + totalDollarsCustomerPurchasesMonth[i] + " dolares.");
                System.out.println("Por tanto,  No tiene derecho a un descuento en su proxima compra.");
                System.out.println("*******************************************************************************************************");

            }
        }



    }
}
