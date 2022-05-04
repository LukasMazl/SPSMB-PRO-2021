package cz.spsmb.lesson24th;

import cz.spsmb.lesson24th.list.LinkedMyList;
import cz.spsmb.lesson24th.list.MyList;

public class Application {

    public static void main(String[] args) {
        MyList myList = new LinkedMyList();
        myList.add(5);
        myList.add(10);
        myList.add(1);

        System.out.println(myList);
    }
}
