# Autor Mattias
Array - co a jak
Vysvětlení Array
Array, česky Pole, je datová struktura, která obsahuje daný počet objektů, stejného typu. Array vždy musí mít daný počet částí a může být pouze obsahovat např. Int proměnné.
Array se vytvoří příkazem danýObjekt [] názevPole; Přičemž danýObjekt je typ datového objektu který Array bude obsahovat a názevPole je název Array, který si uživatel zvolí. Toto je základní vytvoření pole. Do pole se dá zapisovat manuálně nebo pomocí cyklů. Hodnota pole vždy začíná na čísle 0.
Pomocí cyklů se musí vytvořit cyklus běžící na velikost pole: for(int i = 0; i < pole.length; i++){ kód } V tomto případě se bude kód opakovat dokud proměnná pole.length bude větší jak proměnná i.  Do kódu lze následně vložit právě naplnění pole: { pole [i] = scan.nextLine } (musíme mít již definovaný Scanner). Manuálně lze naplnit již při svém vytvoření: String [] Pole = {"Hodnota1", "Hodnota2",};
Int pole se vytváří úplně stejně, avšak plnění je trochu jíné. Při manuálním plnění: Int [] pole = {číslo, číslo, číslo,};.


import java.util.Scanner;
public static void Main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] pole = new int[];
        for(int h = 0; h < pole.length; h++){
                int a = scan.nextInt();
                pole[h] = a;
        }for(int i : pole){
                System.out.println(i);
        }
}
