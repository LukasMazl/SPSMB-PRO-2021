# Autor Jakub Šimon

While je podobná smyčka jako for, s tím rozdílem, že se opakuje tak dlouho, dokud je stav true.

## Výhody

- Hodí se na nějaký např. generátor, apod.
- Nemusíme díky while cyklu pořád psát ten samý kód znovu a znovu


## Nevýhody

- Mnohdy pokračuje do nekonečna
- Má menší využití než for

## Příklad

Cyklus se bude opakovat, dokud bude i stále menší než 5

    int i = 0;
    while (i < 5) {
      System.out.println(i);
    i++;
    }

Cyklus je zde nekonečný, jelikož hodnota je stále true

    while(true){    
        System.out.println("Nekonečná smyčka while");    
    }    
