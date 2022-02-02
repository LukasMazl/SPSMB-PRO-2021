# 17.Hodina

(Zadání můžete řešit ve dvojici)

Vytvořte FX aplikaci, která bude analyzovat soubor, který uživatel zadá na vstupu.
Analýza spočívá v tom, že program spočítá počet znaků (neřešíme jestli je znak velký nebo malý) a počet slov, které se v
zadaném textu vyskytují. Program následně vypočítá četnost těchto slov/znaků.

Např. pokud je na vstupu soubor s tímto textem "Ahoj, jak se mas?". Tak tento text
obsahuje 4 slova. Každé slovo se vyskytuje s četností 25%. 
Pokud to bereme po znacích, tak: 
    
  - A - 3 => 25%
  - H - 1 => 8.3%
  - O - 1 => 8.3%
  - J - 2 => 16.6%
  - k - 1 => 8.3%
  - S - 2 => 16.6%
  - E - 1 => 8.3%
  - M - 1 => 8.3%

Hodnoty výše program vypíše formou grafu. V programu musíte mít 2 grafy.
  
 - Graf zobrazující četnost slov v %
 - Graf zobrazující četnost znaků v %

Grafy je možné přepínat pomocí ComboBoxu. Pro zadání vstupního souboru použíjte
FileChoser (viz. https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm)

Pro testování aplikace můžete využít připravený soubor v této složce. Soubor obsahuje
text básně K. H. Máchy - Máj. Schválně zkuste najít, jaké slovo se nejčastěji objevuje v této básni.

## Užitečné odkazy

 - https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm
 - https://informstechs.com/java-page?pagesjavapostsd=1