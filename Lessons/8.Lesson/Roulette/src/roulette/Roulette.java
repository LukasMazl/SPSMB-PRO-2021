/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roulette;


   import java.util.Scanner;
   import java.util.Random;

public class Roulette {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Vítej v kasínu!");
      System.out.println("─────────────█████████████──────────────\n" +
              "──────────────███████████───────────────\n" +
              "───────────────██████████───────────────\n" +
              "────────────────████████────────────────\n" +
              "────────────────▐██████─────────────────\n" +
              "────────────────▐██████─────────────────\n" +
              "──────────────── ▌─────▌────────────────\n" +
              "────────────────███─█████───────────────\n" +
              "────────────████████████████────────────\n" +
              "──────────████████████████████──────────\n" +
              "────────████████████─────███████────────\n" +
              "──────███████████─────────███████───────\n" +
              "─────████████████───██─███████████──────\n" +
              "────██████████████──────────████████────\n" +
              "───████████████████─────█───█████████───\n" +
              "──█████████████████████─██───█████████──\n" +
              "──█████████████████████──██──██████████─\n" +
              "─███████████████████████─██───██████████\n" +
              "████████████████████████──────██████████\n" +
              "███████████████████──────────███████████\n" +
              "─██████████████████───────██████████████\n" +
              "─███████████████████████──█████████████─\n" +
              "──█████████████████████████████████████─\n" +
              "───██████████████████████████████████───\n" +
              "───────██████████████████████████████───\n" +
              "───────██████████████████████████───────\n" +
              "─────────────███████████████────────────");
      System.out.println("Vložte váš počáteční kapitál:");
      int kapital = sc.nextInt();
      int max = kapital;
      int sazkos = cashmoneyflowgucci(sc, kapital);
      while (sazkos != 0) {
       kapital = koleso(sc, rand, sazkos, kapital);
         System.out.println("=======================================================================================================================================");
         sazkos = cashmoneyflowgucci(sc, kapital);
         if (kapital == 0){

            System.out.println("Prosázel jsi svůj kapitál a jsi homeless :(");
         }
      }
   }
   
   public static int cashmoneyflowgucci(Scanner sc, int kapital) {
      System.out.println("Tvůj kapitál je:" + kapital);
      System.out.println("=======================================================================================================================================");
      System.out.print("Kolik chceš vsadit? (0 na konec)?");
      int sazkos = sc.nextInt();
      return Math.min(sazkos, kapital);
   }
   
   public static int koleso(Scanner sc, Random rand, int  sazkos, int kapital) {
      System.out.print("Vetší číslo nebo menší? ");
      String pick = sc.next();

      int spin = rand.nextInt(37);
      System.out.println("Spinnul jsi: " + spin);
      if (spin > 18) {
         if (pick.equalsIgnoreCase("vetsi")) {
            System.out.println("Vyhrál jsi!");
            kapital +=  sazkos;
         } else {
            System.out.println("Prohrál jsi to. :-(");
            kapital -=  sazkos;
         }
      } else if (spin == 0) {
         System.out.println("Prohrál jsi to. :-(");
         kapital -=  sazkos;
      } else {
         if (pick.equalsIgnoreCase("mensi")) {
            System.out.println("Vyhrál jsi to!");
           kapital +=  sazkos;
         } else {
            System.out.println("Prohrál jsi to. :-(");
            kapital-=  sazkos;
         }
      }
      return kapital;
   }
}