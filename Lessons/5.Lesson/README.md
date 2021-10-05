# 5. Hodina
Uvedené body níže vypracujte do projektu Current.

  - Ve třídě ArrayUtils vytvořte metodu, která bude mít tuto deklaraci
 ```java
    public static int[][] generate(int width, int height, int min, int max) {
            
        return null;
    }
```
- Ve třídě ArrayUtils vytvořte metodu pro výpis dvojrozměrného pole typu:
  - Object[width][height]
  - int[width][height]
  - char[width][height]

- Vytvořte metodu pro inicializaci jednotkové matice

- Vytvořte metodu pro součet 2 matic (je nutné ošetřit vstup)

- Neni potřeba nějak upravit kód?

## Bonusová úloha

A dnes máte šanci dostat, né jednu ale i klidně dvě jedničky za tyto úlohy:
  - Implementujte metodu Stupid Sort (Bogo Sort)
```java
    public static void stupidSort(int[] array) {
        while(!isSorted(array)) {
            shakeArray(array);
        }
    }
```
  - Vytvořte metodu pro výpočet Fibonacciho posloupnosti