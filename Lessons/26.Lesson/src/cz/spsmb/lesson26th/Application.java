package cz.spsmb.lesson26th;

import cz.spsmb.lesson26th.map.MyMap;
import cz.spsmb.lesson26th.map.SimpleMyMap;

public class Application {

    public static void main(String[] args) {
        MyMap<String, Integer> integerMyMap = new SimpleMyMap<>();
        integerMyMap.put("ahoooj", 6);
        integerMyMap.put("ahooj", 5);
        integerMyMap.put("ahoj", 4);

        integerMyMap.hashCode();

        System.out.println(integerMyMap);
    }
}
