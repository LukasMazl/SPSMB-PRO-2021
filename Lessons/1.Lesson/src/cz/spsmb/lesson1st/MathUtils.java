package cz.spsmb.lesson1st;

/**
 *
 */
public class MathUtils {

    /**
     *
     * @param number
     * @return
     */
    public static int pow(int number) {
        return number * number;
    }

    /**
     *
     * @param r
     * @return
     */
    public static double circleArea(int r) {
        if(r < 0) {
            throw new IllegalArgumentException("R could not be less then 0");
        }
        return Math.PI * pow(r);
    }

    /**
     *
     * @param number
     * @return
     */
    public static boolean isEven(int number) {
        return number % 2 == 2;
    }

    /**
     *
     * @param number
     * @return
     */
    public static boolean isPrime(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Number could not be less then 0");
        }

        int sqrt = (int) Math.sqrt(number);
        if(isEven(number)) {
            return false;
        }

        for(int i = 3; i < sqrt; i+=2) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
