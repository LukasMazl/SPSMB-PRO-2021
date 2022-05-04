package cz.spsmb.lesson24th;

import cz.spsmb.lesson24th.list.LinkedMyList;
import cz.spsmb.lesson24th.list.MyList;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        MyList<Integer> myList = new LinkedMyList<>();
        myList.add(5);
        myList.add(10);
        myList.add(1);

        int item = myList.get(0);
        System.out.println(item);

        MyList<String> myNames = new LinkedMyList<>();
        myNames.add("Jan");
        myNames.add("Peter");
        myNames.add("Lukas");

        List<String> names = new LinkedList<>();
        names.add("Jan");
        names.add("Peter");
        names.add("Lukas");

        for (String name : names) {
            System.out.println(name);
        }

    /*    for (String myName : myNames) {
            System.out.println(myName);
        }*/

    }
}
