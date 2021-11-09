# 8. Hodina
Uvedené body níže vypracujte do projektu Current.

- Vytvořte třídu Point a Vector. Bod má X a Y souřadnici, ale může mít i více dimenzí (např. z). Je lepší řešit zadání obecně. Třída Point bude mít metodu getVector(), ktera vytvori novou instanci tridy Vector, ktery znazornuje ,,cestu" z jednoho bodu (point) do druhého.
- Pokud je vyřešen první ukol obecně, tzn. že třída Point má pole integerů s názvem cords. Je požné z této třídy Point vytvořit libovolného potomka následujícího formátu:
  - Point2D - Pouze 2D bod
  - Point3D - Pouze 3D bod
- Pro vyřešení bodu výšše je potřeba využít klíčového slovíčka ,,Extends" a minimalizovat duplicitu kódu.

- Vytvořte metodu, která má navstupu procentuální pravděpodobnost, kterou určitě znáte z her. V hrách bývá, že máte 10% šanci na to, aby Vám padl epic.. Vaším ukolem je naprogramovat metodu, která bude vrace True se zadanou pravděpodobností na vstupu.
- Pokud máte metodu s pravděpodobností výše, tak zjistěte, jestli pravděpodobnost doopravdy platí. Tzn. je potřeba dát metodu do cyklu (s min 1000 cykly), a pocítat kolikrát metoda vrátí True. Následně je celkový počet true vydělen celkovým počtem otáček. Výsledkem by měla být pravděpodobnost blízká zadanému parametru na vstupu metody popsané v bodu výše.

## **Domácí úkol**

Domácí úkol platí pro všechny! Úkol devzdejte do tohoto repositáře formou pull requestu.

**Zadání**: Vytvořte aplikaci, která bude reprezentovat hraní rulety v Kasinu.
Jako uživatel na začátku mám nějaký obnos (ponechám na Vás). Jako uživatel můžu zvoli, jakou částku si přeji vsadit a na jakou barvu si chci vsadit. Lze sázet pouze na červenou a černou barvu. Pokud vsadím na červenou a padne červená, tak mi je vrácen můj vklad 2x (tj. pokud vsadím 10kč, dostanu 20kč). Hra končí v případě, kdy uživatel chce skočit a jít pryč, nebo když mu dojdou peníze a nepůjčí mu už ani ruská mafie.

Pokud chce domácí ukol vylepšit a dostat rovnou z něho za 1, tak přidejte k DU i AI, která bude simulovat hráče, který hraje ruletu. Spravny vysledek je takovy, kdy neni mozne hrat ruletu do ,,nekonecna" protoze staticky vzdy musite prohrat vsechny penize. Na to kasína sázejí! :)

Je potřeba, aby na ruletě byla všechna políčka (i nula, která má zelenou barvu).


![Rulet](https://i.gifer.com/8Emq.gif)
