# Autor Novotny + Erik

Třída String: Představuje řetězce znaků.  Jsou to objekty, které jsou vnitřně zálohovány char polem.
Řetězce jsou konstantní; jejich hodnoty nelze po jejich vytvoření změnit. Vyrovnávací paměti řetězců podporují měnitelné řetězce. Protože objekty String jsou neměnné, lze je sdílet. 

<String_Type> <string_variable> = "<sequence_of_string>"; 
String str = "Geeks";
![image](https://user-images.githubusercontent.com/90755554/134314865-d2f9d087-1fbf-4ccd-9878-37e47119995b.png)


Příklad: String str = "abc"; 
Je to stejné jako : char data[] = {'a', 'b', 'c'}; String str = new String(data);

String API: Je rozšíření uživatelského rozhraní - kolekce předem napsaných balíčků, tříd a rozhraní s jejich příslušnými metodami, poli a konstruktory, aby každému uživateli zobrazilo co nejlepší text. API slouží jako rozhraní softwarového programu usnadňující interakci.

API se dělé na tři typy:
Oficiální Java core API, které je součástí stahování JDK
Volitelná oficiální rozhraní Java API, která lze v případě potřeby stáhnout
Neoficiální rozhraní API, což jsou rozhraní API třetích stran, která lze stáhnout ze zdrojových webů

V Javě většinu základních programovacích úloh provádějí třídy a balíčky API, které pomáhají minimalizovat počet řádků zapsaných v kusech kódu.

```java
String str="as df"; 

str.toLowerCase(); // Zmenší všechny znaky
str.toUpperCase(); // Zvětší všechny znaky
str.charAt(3); // Vývěr znaku na určité pozici (začíná se nulou jako u pole(v tomto případě na čtvrté ))
str.compareTo(); // Porovná dva Stringy a vrátí hodnotu pokud je hodnota rovna 0 jsou oba Stringy stejné
str.replace('a','e'); // Vymění jeden nebo více znaků v celém Stringu za jiné
str.split(" "); // Rozdělí String na více Stringů vzhledem k oddělovači, který je odděluje. Vráceným objektem je pole, které obsahuje                   rozdělené řetězce. V tomto případě všude kde je mezera
str.trim(); // Odstraní prázdný znak před a po Stringu
str.substring(0,2); // Rozdělí String př. String hello= "Hello"; System.out.println(hello.substring(0,1)) vypíše :"He"
str.isEmpty(); // Zeptá se jestli je string prázdný pokud ano vrátí hodnotu true jinak false
```
