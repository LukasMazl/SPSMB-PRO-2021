package cz.spsmb.lesson9th.model;

import java.util.Arrays;

public class Student extends Person {
    private int[] grades;
    private String clazz;

    public Student(String name, int[] grades, String clazz) {
        super(name, PersonType.STUDENT);
        this.grades = grades;
        this.clazz = clazz;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
