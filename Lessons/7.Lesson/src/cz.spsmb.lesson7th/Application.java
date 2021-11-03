package cz.spsmb.lesson7th;

import cz.spsmb.lesson7th.model.Student;

public class Application {

    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Pepan", new int[] {1, 2, 3}),
            new Student("Radek", new int[] {3, 2, 3}),
            new Student("Jakub", new int[] {2, 2, 1})
        };

        for (Student student: students) {
            System.out.println(String.format("%s : %f", student.getName(),  student.avgGrades()));
        }

    }
}
