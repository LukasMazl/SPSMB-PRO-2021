# Rekurze

Pokud mluvíme v programování o rekurzi, tak tím myslíme že funkce/metoda volá sama sebe.

Každé rekurzitvní volání by mělo mít ,,Stop-Condition" (podmínku zastavení). Tedy, za jakých
podmínek má rekurze skončit. Příkladem využití rekurze jsme si ukazovali na výpočtu faktoriálu,
Fibbonaciho posloupnosti. Využívá se ale také u sorting algoritmů, jako
jsou Merge sort nebo QuickSort. Mezi další využití může patřit průchod grafem, výpočet determinantu matice apod..

Neexistuje ale pravidlo, které říká že bychom si měli X-krát rozmyslet, jestli použijeme rekurzi.

Výhody:
 - Jednoduchá implementace metod
 - Přirozenější chování

Nevýhody:
  - Špatná čitelnost kódu
  - Složité ladění, pokud je v kódu chyba
