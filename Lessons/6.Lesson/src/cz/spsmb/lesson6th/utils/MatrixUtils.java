package cz.spsmb.lesson6th.utils;

public class MatrixUtils {

    /**
     * Metoda inicializuje jednotkovou matici
     *
     * @param size - Velikost vygenerovane matice
     * @return - Jednotkova matice
     */
    public static int[][] initE(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    /**
     * Metoda realizuje soucet 2 matic
     *
     */
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
           throw new IllegalArgumentException("Matrices do not have same size!!");
        }

        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }
}
