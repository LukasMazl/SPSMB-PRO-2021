package cz.spsmb.lesson5th.utils;

public class MatrixUtils {

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

}
