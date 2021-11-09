package cz.spsmb.lesson5th.utils;

public class MatrixUtils {

<<<<<<< HEAD
    public static int[][] generate(int width, int height, int min, int max) {
        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = MathUtils.randomNumber(min, max);
            }
        }
        return array;
    }

    public static char[][] generate(int width, int height, String[] words) {
        char[][] array = new char[height][width];
        int i = 0;
        for (String word : words) {
            char[] charArray = word.toCharArray();
            for (int j = 0; j < width; j++) {
                array[i][j] = charArray[j];
            }
            i++;
        }
        return array;
    }

    public static int[][] init(int width, int height) {
        int[][] array = new int[height][width];
        if (height == width) {
            int k = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[i][k] = 1;
                }
                k++;
            }
            return array;
        }
        return null;
    }

    public static int[][] sum(int[][] array1, int[][] array2) {
        if (array1.length == array2.length && array1[0].length == array2[0].length) {
            int[][] array = new int[array1.length][array1[0].length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    array[i][j] = array1[i][j] + array2[i][j];
                }
            }
            return array;
        }
        return null;
    }

    public static int[][] genFlag(int width, int height) {
        int[][] array = new int[height][width];
        int helperTop = 0;
        int helperBot = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = 2;
            }
        }
        for (int i = 0; i < height / 2; i++) {
            for (int j = 1 + helperTop; j < width; j++) {
                array[i][j] = 0;
            }
            helperTop++;
        }
        for (int i = height - 1; i > height / 2 - 1; i--) {
            for (int j = 1 + helperBot; j < width; j++) {
                array[i][j] = 1;
            }
            helperBot++;
        }

        return array;
    }

=======
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
>>>>>>> origin/main
}
