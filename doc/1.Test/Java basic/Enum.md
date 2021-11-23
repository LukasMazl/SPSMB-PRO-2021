# Autor Michal

- Výčtový typ
- Datový typ
- Výčtový typ je zvláštní hodnotový typ s předem určenou sadou číselných hodnot.
- Základní hodnota je 0
- Lze využít pro výčet názvů dní v týdnu (PONDĚLÍ, ÚTERÝ,…), pro jména měsíců (LEDEN, ÚNOR,…) a pro pojmenování základních barev, pro názvy světových stran, atd.
  V praxi lze výčtový typ také použít například pro stavy vyhodnocení objednávky (SCHVÁLENO, ZAMÍTNUTO, ZATÍM_NEVYŘÍZENO).

- Ukázka jednoduchého výčtového typu:

``java
public enum Mesic {
     NEURCENY, LEDEN, UNOR, BREZEN, DUBEN, KVETEN, CERVEN,
     CERVENEC, SRPEN, ZARI, RIJEN, LISTOPAD, PROSINEC
     
}
``
