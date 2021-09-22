# Autor Vojtěch Žmolík
- na rozdíl od if může mít n spustitelných částí (case)
- používá datové typy byte, short, char, int, enum, string
- tělo se nazývá switch block
- pokud není nalezena schoda požije se default
- každý case musí mít vlastní hodnotu, pokud mají dvě stejnou compilátor vypíše error
- příkaz break přeruší switch a ukončí ho
- pokud není break v kódu tak veškeré case od pravdivého budou vykonány včetně s pravdivým

# Syntaxe:
    switch(expression)
    {
       // case statements
       // values must be of same type of expression
       case value1 :
          // Statements
          break; // break is optional

       case value2 :
          // Statements
          break; // break is optional

       // We can have any number of case statements
       // below is default statement, used when none of the cases is true. 
       // No break is needed in the default case.
       default : 
          // Statements
    }

# Příklad 1:
        java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    }
    
   Vypíše:
      August
      September
      October
      November
      December      
       
# Příklad 2:
    int month = 8;
         int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);      
    
   Vypíše:
      August
      
 # Příklad 3:
    int month = 13;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);      
    
   Vypíše:
      Invalid month
