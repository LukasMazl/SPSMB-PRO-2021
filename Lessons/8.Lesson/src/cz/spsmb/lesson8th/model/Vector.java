package cz.spsmb.lesson8th.model;

import java.util.Arrays;

public class Vector {
    private int[] vector;

    public Vector(int... vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "vector=" + Arrays.toString(vector) +
                '}';
    }
}
