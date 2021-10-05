package cz.spsmb.lesson5th.utils;

/**
 * Prvni knihovna s matematickymi operacemi. V tato trida umoznuje pocitat zakladni matematicke ulohy zname
 * ze zakladni a stredni skoly.
 */
public class MathUtils {

    /**
     * Metoda vraci umocnene cislo number na druhou.
     * Java neumoznuje vyuziti operatoru ^ pro mocneni, ktery je znamy z kalkulacek, proto je nutne vytvorit vlastni
     * metodu, ktera toto umozni. Operator ^ v java znamena Negaci cisla.
     *
     * @param number - Vstupni parametr
     * @return number * number
     */
    public static int pow(int number) {
        return number * number;
    }

    /**
     * Tato metoda vypocita obsah kruhu na zaklade vstupniho parametru r.
     * V implemtaci teto metody je videt vyuziti nove methody pow, kterou jsme vytvorili vyse.
     *
     * @param r - polomer kruhu
     * @return r² * PI
     */
    public static double circleArea(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("R could not be less then 0");
        }
        return Math.PI * pow(r);
    }

    /**
     * Je cislo na vstupu sude? A jak se to da zjisti?
     * Pro takovyto pripad je vhodne vyuzit operatoru modulo. Operator vraci zbytek po deleni.
     * Tzn. pokud bychom meli cislo 5 tak 5 % 2 da vysledek 1. Pokud bychom meli na vstupu 6, tak vysledek 6 % 2 bude 0.
     * Toho vyuziva tato metoda, ktera kontroluje zbytek po deleni, jestli je 0. Pokud je zbytek po deleni 0, tak
     * vraci True. V opacnem pripade vraci False.
     *
     * @param number - Prirozene cislo
     *
     * @return True/False
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Jak je mozne zjistit jestli je dane cislo prvocislo? V tomto pripade je nejlehcim resenim metoda "hrube sily"
     * v anglictine oznacovana jako "brute force". Tato metoda spocita v opakovanem zkouseni a hadani/hledani cisla,
     * ktery deli cislo na vstupu beze zbytku. Pokud najdeme alespon jedno jedine cislo, ktere je delitelne beze zbytku
     * muzeme o cislu na vstupu rici, ze se nejedna o prvocislo. Abychom nemuseli zkouset uplne vsechny cisla, ktera
     * existuji, tak se tato cisla hledaji pouze v intervalu 2 az Number (cislo na vstupu). Mensi optimalizaci pro reseni
     * teto ulohy je zmenseni intervalu na 2 az Math.sqrt(Number).
     *
     * @param number - Prirozene cislo
     *
     * @return Pokud je cislo prvocislo vraci true
     */
    public static boolean isPrime(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number could not be less then 0");
        }

        if (isEven(number)) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metoda vraci nahodne cislo v intervalu od MIN az MAX. Pro ziskani nahodne hodnoty je brana hodnota Math.random().
     * Math.random() vraci cislo v intervalu od 0.0 - 1.0 (napr. 0.554, 0.156, 0.985). Jak ale ziskat cislo z intervalu
     * ktery potrebujeme? Zde jsou potreba udelat 2 uvahy zahrnujici minimalni hodnotu z metody Math.random() a maximalni hodnoty.
     *
     * 1) Co kdyz metoda Math.random() vrati 0.00? Jak docilime toho, ze se nam vrati minimum?
     * Pokud nam hodnota Math.random() vrati 0.00, tak nejlehcim resenim je k 0.00 pricist minimalni hodnotu.
     * Muzeme tedy rici, ze zacatek vypoctu bude vypadat
     * <pre>
     * {@code
     *      return min + (int) Math.random();
     *   }
     * </pre>
     *
     * 2) Co kdyz metoda Math.random() vrati 1.00? Jak docilime toho, ze se nam vrati maximum?
     * V pripade, ze generujeme cislo od 0 do MAX, tak by stacilo udelat Math.random() * MAX (1.00 * MAX = MAX) a metoda je na svete,
     * bohuzel my ale chceme mit moznost minimalni hodnotu nastacit take. Mozna nekoho napada reseni:
     *  <pre>
     *  {@code
     *            return min + (int) (Math.random() * max);
     *  }
     * </pre>
     * Takove reseni je ale spatne a jednoduse to dokazeme, kdy si zvolime hodnoty min = 5 a max = 10. Necht nam metoda
     * Math.random() vrati hodnotu 1.0
     * Pokud "dosadime" tyto hodnoty, tak ziskame 5 + 1.00 * 10 = 15. Toto cislo nesplnuje to co my chceme.
     *
     * Resenim tohoto problemu je vytvoreni "rozdilu" mezi maximalni hodnotou a minimalni hodnotou. Pokud ziskame rozdil,
     * tak ho muzeme dosadit za max z kodu vyse. Vysledny kod bude vypadat takto:
     *  <pre>
     *  {@code
     *            return min + (int) (Math.random() * (max - min));
     *  }
     * </pre>
     *
     * Jak dokazat, ze toto reseni je spravne?
     * <br>
     * Odpoved: Vyzkousime jake hodnoty to bude vracet, kdyz Math.random() vrati 0.00 nebo 1.00
     * <br>
     * Pro 0.00:
     *  <pre>
     *  {@code
     *            return min + (int) (0.00 * (max - min)); //Cokoliv nasobim 0 je nula
     *  }
     * </pre>
     *
     * zbyde tam tedy pouze
     * <pre>
     *  {@code
     *            return min; // ostatni hodnoty jsou nula
     *  }
     * </pre>
     *
     * Pro 1.00
     * <pre>
     * {@code
     *           return min + (int) (1.00 * (max - min)); //Po vynasobeni ziskame hodnotu (max - min) protoze 1 * (max - min) = (max - min)
     * }
     * </pre>
     *
     * Pokud pomyslne odstranime zavorky, tak nam v metode zbyde:
     * <pre>
     * {@code
     *           return min + max - min; // Zde je videt, ze k max priceme hodnotu min a hned ji taky odecteme, takze vysledkem je max a to my chceme!!
     * }
     * </pre>
     *
     *
     * @param min - Minimalni hodnota intervalu
     * @param max - Maximalni hodnota intervalu
     *
     * @return - Nahodne cislo v intervalu
     */
    public static int randomNumber(int min, int max) {
        return (min + (int) (Math.random() * (max - min)));
    }

    /**
     *  Metoda umoznuje vypocitani kvadraticke rovnice pro vsechna Realna cisla. Tzn. pokud by byl determinant mensi nez 0,
     *  tak metoda vyhodi vyjimku.
     *
     * <br>
     *      ax² + bx + c
     * <br>
     *
     * @param quadratic - Kvadraticky clen rovnice (ax²)
     * @param linear - Linearni clen rovnice (bx)
     * @param constant - Konstantni clen rovnice (c)
     *
     */
    public static void solveQuadraticEquation(int quadratic, int linear, int constant) {
        int determinant = pow(linear) - 4 * quadratic * constant;
        if (determinant == 0) {
            double root = -linear / (2 * quadratic);
            System.out.println("Equation has one root x = " + root);
        } else if (determinant > 0) {
            double root1 = (-linear - Math.sqrt(determinant)) / (2 * quadratic);
            double root2 = (-linear + Math.sqrt(determinant)) / (2 * quadratic);
            System.out.println("Equation has 2 roots x1 = " + root1 + "; x2 = " + root2);
        } else {
            throw new IllegalArgumentException(String.format("Equation %dx² + %dx + %d does not have solution in R, because" +
                    "determinant %d is less then 0.", quadratic, linear, constant, determinant));
        }
    }
}
