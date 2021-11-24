package cz.spsmb.lesson9th.model;

import java.util.Arrays;

public class Teacher extends Person {
    private String[] classes;

    public Teacher(String name, String[] classes) {
        super(name, PersonType.TEACHER);
        this.classes = classes;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classes=" + Arrays.toString(classes) +
                '}';
    }
}
