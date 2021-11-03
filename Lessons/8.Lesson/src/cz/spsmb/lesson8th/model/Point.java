package cz.spsmb.lesson8th.model;

import java.util.Arrays;

public class Point {

    private int[] cords;
    private int dim;

    public Point(int... cords) {
        this.cords = cords;
        this.dim = cords.length;
    }

    public Vector getVector(Point point) {
        int[] vector = new int[point.dim];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = point.cords[i] - cords[i];
        }
        return new Vector(vector);
    }

    public int getDim() {
        return dim;
    }

    public void setCords(int[] cords) {
        this.cords = cords;
    }

    public int[] getCords() {
        return cords;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    @Override
    public String toString() {
        return "Point{" +
                "cords=" + Arrays.toString(cords) +
                ", dim=" + dim +
                '}';
    }
}
