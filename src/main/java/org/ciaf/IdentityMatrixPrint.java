package org.ciaf;

public class IdentityMatrixPrint /*Impresion de Matriz Identidad*/{
    /* Contexto: Genera una matriz identidad de tamano n.
    Parametro: Un entero n.
    */
    public static void main(String[] args) {
        int[][] identitymatrix = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        for (int i = 0; i < identitymatrix.length; i++) {
            identitymatrix[i][i] = 1;
        }

        for (int j = 0; j < identitymatrix.length; j++) {
            for (int z = 0; z < identitymatrix.length; z++) {
                System.out.print(identitymatrix[j][z]);
            }
            System.out.println();
        }
    }
}
