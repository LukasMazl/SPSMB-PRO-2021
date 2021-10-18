# Autor Daniel Bílek
# Methods
Metoda je blok kódu, který se zapne jen když je vyvolaná.
Metody se používají pro to aby se kód mohl používat opakovaně

## Vytvoření metody
Metoda musí být deklarována v rámci třídy (class). class je definována jménem metody, za jménem následují prázdné závorky ().
Java poskytuje některé předdefinované metody, jako například System.out.println(), ale můžete také vytvořit vlastní metody pro provádění určitých akcí

## main-method
Main () je výchozím bodem pro JVM, aby spustil spuštění programu Java. Bez metody main () se JVM program nespustí. Syntaxe metody main () je: public static void main(String args[])

### public: 
Je to specifikátor přístupu. Před metodou main () bychom měli použít veřejné klíčové slovo, aby JVM mohl identifikovat bod spuštění programu. Pokud použijeme soukromé, chráněné a výchozí před metodou main (), nebude pro JVM viditelná.

### static:
Metodu můžete vytvořit statickou pomocí klíčového slova static. Měli bychom zavolat metodu main () bez vytvoření objektu. Statické metody jsou metodou, která vyvolává bez vytváření objektů, takže k volání metody main () nepotřebujeme žádný objekt.

### void:
V Javě má každá metoda návratový typ. Klíčové slovo Void potvrzuje kompilátoru, že metoda main () nevrací žádnou hodnotu.


