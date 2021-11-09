
//problemy
//muzu vsadit vic nez mam *fixed*
//barvy u hrace nefungujou *fixed*
//kdyz vyhraje cislo, co hrac vsadil, tak je vyhra jen dvojnasobek (udělat 36 násobek)

import java.util.*;
public class Ruletos {
    static int cislo;
    static int random1;
    static int random2;
    static int random3;
    static int monerky = 1000;
    static int sazka;
    static int vyhreniCislo;
    static int AI_or_hrac;
    static int Barva_nebo_Cislo;
    static boolean isRunning = true;
    static String barva = "Červená";
    static String cerna = "Černá";
    static int fieldcerna[] = {0,2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35}; /*plus zelená*/
    static int fieldcerverna[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
  /*  static int fieldcisla[] = new int [38];*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("1 - AI");
            System.out.println("2 - Hrac");
            AI_or_hrac = sc.nextInt();
        got:
            if (AI_or_hrac == 1) {
                AI();
            } else if (AI_or_hrac == 2) {
                stanovenVyhry();
            } else {
                break got;

            }
        /*   for (int i = 1; i < fieldcisla.length; i++) {
            System.out.println("Číslo " + i + " padlo "+ fieldcisla[i] + " krát.");
        }*/
    }
    public static void generaceCisel(){
        random2 = (int) (Math.random() * 2 + 1);
        random1 = (int) (Math.random() * 18);
        random3 = (int) (Math.random()*19);
        if (random2 == 1) {
            vyhreniCislo = fieldcerna[random3];

        } else if (random2 == 2) {
            vyhreniCislo = fieldcerverna[random1];

        }
           /* fieldcisla[vyherniCislo]++;*/


    }
    public static void generaceBarvy(){
        random2 = (int) (Math.random() * 2 + 1);
        random1 = (int) (Math.random() * 19);
        if (random2 == 1) {
           cislo = 1;
        } else if (random2 == 2) {
            if(random1 == 0){
            cislo = 0;
            }
            else {
                cislo = 2;
            }
        }
    }
    public static void stanovenVyhry() {
        while(isRunning) {
            generaceCisel();
            Scanner sc = new Scanner(System.in);
            System.out.println("Chceš sázet barvy nebo konkrétní číslo?");
            System.out.println("1 - Na číslo");
            System.out.println("2 - Na barvu");
            Barva_nebo_Cislo = sc.nextInt();
            if(Barva_nebo_Cislo == 1){
                System.out.println("Zadej číslo, které si myslíš, že vyhraje: ");
                cislo = sc.nextInt();
                got:{
                System.out.println("Kolik chceš vsadit?");
                sazka = sc.nextInt();
                    if (sazka <= monerky) {
                        vyhodnoceni();
                    } else if (sazka > monerky) {
                        System.out.println("Nemáš dostatek peněz");
                        sazka = 0;
                        break got;
                    }
                }
            }
            else if(Barva_nebo_Cislo == 2){
                generaceBarvy();
                System.out.println("Zadej barvu, která si myslíš, že vyhraje: ");
                System.out.println("1 - Červená");
                System.out.println("2 - Černá");
                vyhreniCislo = sc.nextInt();
                got:{

                System.out.println("Kolik chceš vsadit?");
                sazka = sc.nextInt();
                    if (sazka <= monerky) {
                       vyhodnoceni();
                    } else if (sazka > monerky) {
                        System.out.println("Nemáš dostatek peněz");
                        sazka = 0;
                        break got;
                    }
                }

            }



        }

    }
    public static void AI(){
        while(isRunning) {
            sazka = (int) (Math.random()*monerky+1);
            vyhreniCislo = (int) (Math.random() * 2  +1);
            generaceBarvy();

            System.out.println("BOT vsadil: " + sazka);

            if(vyhreniCislo == 1){
                System.out.println("AI vygenerovalo barvu: " + barva);
            }
            else if(vyhreniCislo == 2){
                System.out.println("AI vygenerovalo barvu: " + cerna);
            }

            vyhodnoceni();
        }
    }
    public static void vyhodnoceni() {
        if (AI_or_hrac == 2) {
            if (Barva_nebo_Cislo == 1) {
                System.out.println("Padlo číslo: ");
                System.out.println(vyhreniCislo);
                if (cislo == vyhreniCislo) {
                    System.out.println("Vyhral jsi");
                    monerky = monerky + sazka*35;
                    System.out.println("Máš " + monerky + " monerek.");
                } else if (cislo != vyhreniCislo) {
                    System.out.println("Už to nehraj pls");
                    monerky = monerky - sazka;
                    System.out.println("Máš už jen " + monerky + " monerek.");
                }
                if (monerky <= 0) {
                    isRunning = false;
                } else if (monerky > 0) {
                    System.out.println("Chceš to ukončit a vybrat prachy?");
                    System.out.println("ANO = 1");
                    System.out.println("NE = 2");
                    Scanner sc = new Scanner(System.in);
                    int ukonceni;
                    ukonceni = sc.nextInt();
                    if (ukonceni == 1) {
                        System.out.println("Skončil jsi s " + monerky + " monerkama");
                        isRunning = false;
                    }
                }
            }
            else if(Barva_nebo_Cislo ==2){
                System.out.print("Padla barva: ");

                if(cislo == 1){
                    System.out.println(barva);

                }
                else if(cislo == 2){
                    System.out.println(cerna);
                    }
                else if(cislo == 0){
                    System.out.println("Zelená");
                }
                if (cislo == vyhreniCislo) {
                    System.out.println("Vyhral jsi " + sazka*2 + " monerek");
                    monerky = monerky + sazka;
                    System.out.println("Máš " + monerky + " monerek.");
                } else if (cislo != vyhreniCislo) {
                    System.out.println("Prohrál jsi " + sazka + " monerek");
                    monerky = monerky - sazka;
                    System.out.println("Máš už jen " + monerky + " monerek.");
                }
                if (monerky <= 0) {
                    isRunning = false;
                    System.out.println("Už tě nezachrání ani ruská mafie");

                }
                else if (monerky > 0) {
                    System.out.println("Chceš to ukončit a vybrat prachy?");
                    System.out.println("ANO = 1");
                    System.out.println("NE = 2");
                    Scanner sc = new Scanner(System.in);
                    int ukonceni;
                    ukonceni = sc.nextInt();
                    if (ukonceni == 1) {
                        System.out.println("Skončil jsi s " + monerky + " monerkama");
                        isRunning = false;
                    }
                }

            }
        }

        else if(AI_or_hrac == 1){
            System.out.println("Padla barva: ");

            if(cislo == 1){
                System.out.println(barva);
            }
            else if(cislo == 2){
                System.out.println(cerna);
            }
            else if(cislo == 0){
                System.out.println("Zelená");
            }

            if (cislo == vyhreniCislo) {
                System.out.println("Bot vyhral");
                monerky = monerky + sazka;
                System.out.println("Máš " + monerky + " monerek.");
            } else if (cislo != vyhreniCislo) {
                System.out.println("BOT prohrál");
                monerky = monerky - sazka;
                System.out.println("Máš už jen " + monerky + " monerek.");
            }
            if (monerky <= 0) {
                isRunning = false;
            }
            }

        }
    }


