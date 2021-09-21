package cz.spsmb.lesson2nd.automata;

/**
 *
 */
public class Automata {

    /**
     *
     * @param value
     */
    public static void exchange(int value) {
       Money[] monies = Money.values();
       int rest = value;
       for(Money money : monies) {
           int count = rest / money.getValue();
           System.out.println(money + "x: " + count);
           rest = rest % money.getValue();
       }
    }
}
