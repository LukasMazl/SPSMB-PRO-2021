# Autor - Stepanka Klimesova

## cyklus do-while

do - while provádí svoji činnost tak dlouho, dokud je podmínka platná.

```java
do {
  document.write("Cislo je: " + i);
  i++;
} while (i < 10);
```

Cyklus začíná klíčovým slovem do, za kterým je tělo cyklu, klíčové slovo while a podmínka.

Provádí se takto: nejprve se provede tělo cyklu, pak se vyhodnotí podmínka a je-li splněna, znovu se provede tělo cyklu, vyhodnotí se podmínka, atd. Není-li podmínka splněna, pokračuje se za cyklem.

podmínka je umístěna na konci cyklu, tzn. v případě nesplnění 
této podmínky, se cyklus do-while ukončí, ale blok kódu proběhne vždy alespoň jednou.
