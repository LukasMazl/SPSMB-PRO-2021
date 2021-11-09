package cz.spsmb.lesson8th;

import cz.spsmb.lesson8th.model.Point;
import cz.spsmb.lesson8th.model.Point2d;
import cz.spsmb.lesson8th.model.Point3d;

public class Application {

    public static boolean chance(double per) {
        double number = Math.random();
        return number < per;
    }

    public static void main(String[] args) {
        Point pointA = new Point2d(1,5);
        Point pointB = new Point2d(2,5);

        System.out.println(pointA.getVector(pointB));

        int trueCount = 0;
        int totalIteractions = 10000;
        for(int i = 0; i < totalIteractions; i++) {
            if (chance(0.50)) {
                trueCount++;
            }
        }
        System.out.println(trueCount/(double) totalIteractions);
    }
}
