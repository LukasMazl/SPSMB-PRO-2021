# 16.Lesson

(Řešte zadání ve dvojici)

Vytvořte JavaFX aplikaci, která bude sloužit pro evidenci žáků a zobrazování prospěchu.
Aplikace musí splňovat následující body:
 - Uživatel může založit/editovat/smazat žáka (tj. mohu provádět CRUD operace)
 - Uživatel může žákovi zapsat známku z předmětu
 - Po zapsání známky se automaticky přepočítá žákův průměr
 - Data v aplikaci musí existovat i po vypnutí aplikace (data jsou persistentně uložena)
 

## Jak začít?
 - Vvtvořte dialogové okno pro zobrazení žáků a jejich známek/průměrů
 - Vytvořte dialogové okno pro vytvoření a editaci žáka
 - Vymyslete v jaké formátu se budou žáci zapisovat na disk (kvůli uložení)
 - Vytvořte třídu StudentRepository, která vám umožní studenta načíst/smazat/aktualizovat
 - Propojte dialogová okna a zbylé třídy

### Užitečné odkazy
    - https://www.geeksforgeeks.org/javafx-textinputdialog
    - https://riptutorial.com/javafx/example/28033/creating-custom-dialog
