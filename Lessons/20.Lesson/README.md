# 20. Lesson
Pokračování na CurrencyWatcher

## Bonusová úloha

Vytvořte metodu endode a decode využívající algoritmu RLE.
Metoda endode má na vstupu řetězec, která má být zakódován pomocí RLE algoritmu. RLE je primitivní beztrátový kompresní algoritmus. Jeho výhodou je jednoduchost a také, že dokáže jednoduše zkrátit dlouhý řetězec, který obsahuje více stejných znaků za sebou.

Např. na vstupu je řetězec AAAACCBBBBA. Algoritmus začne počítat kolikrát se v textu za sebou objevilo písmeno A. V tomto případě 4x, proto prvním zakódovaným slovem je 4A. Algorimus pokračuje nyní s C, to se v objevuje 2x, zakódované slovo je tedy 2C. Předposledním písmenem je B, které je v textu za sebou také 4x, proto je zakódováno je 4B. A konečně posledním písmenem je znovu A, které se vyskytuje pouze 1x. Výsledný zakódovaný řetězec je proto 4A2C4B1A. Přesně toto je úkolem metody encode.

Metoda decode naopak dekóduje řetězec 4A2C4B1A na původní slovo AAAACCBBBBA.

### Odkazy
 - https://cs.wikipedia.org/wiki/Run-length_encoding
