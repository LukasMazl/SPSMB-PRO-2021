package cz.spsmb.lesson9th;

import cz.spsmb.lesson9th.exception.FactorialException;
import cz.spsmb.lesson9th.exception.FibbonachiException;
import cz.spsmb.lesson9th.model.Person;
import cz.spsmb.lesson9th.model.Student;
import cz.spsmb.lesson9th.model.Teacher;

public class Application {

    public static int fibbonachi(int a) {
        if (a < 0) {
            throw new FibbonachiException("Parameter could not be less than 0");
        }
        if( a == 0 || a == 1) {
            return a;
        }

        return fibbonachi(a - 1) + fibbonachi(a - 2);
    }

    public static int factorial(int a) throws FactorialException {
        if(a < 0) {
            throw new FactorialException("Parameter could not be less than 0");
        }

        if(a == 0 || a == 1) {
            return a;
        }

        return factorial(a - 1) * a;
    }

    public static void main(String[] args) {
        Person student = new Student("Pepa", new int[] {1,2,3}, "4.ai");
        Person teacher = new Teacher("Jana", new String[] {"1.ai", "4.ai"});

        System.out.println(student);
        System.out.println(teacher);

        try {
            factorial(-5);
        } catch (FactorialException e) {
            System.err.println("Opps something goes wrong :(");
        }

        fibbonachi(-5);
    }
}
