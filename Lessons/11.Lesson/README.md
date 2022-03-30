# 11. Hodina

Vytvořte logovací nástroj, který umožní rozlišit typy zpráv informující vývojáře o aktuálním stavu aplikace. Logovací nástroj by měl mít minimálně 4 úrovně

 - Debug
 - Error
 - Warn
 - Info

Pokud je na začátku programu nastaveno, že má být logována pouze Info hláška s úrovní Warn, tak pouze tyto hlášky budou vypsány a zbytek bude ignorován.

Výpisy můžou být libovolné a konfigurovatelné. Logovat by se určitě mělo do:
 - Konzole
 - Soubor
 - Kombinace (Konzole + Soubor)

## Příklad
Podobné zadání již řešeí knihovna Log4j, ze které se můžeme inspirovat
 - https://www.tutorialspoint.com/log4j/log4j_sample_program.htm
