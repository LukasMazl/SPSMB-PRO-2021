# 2. Test 1. 12.

Zaměřený na znalost syntaxe a sémantiky. 
Kromě toho i základní pojmy z OPP + rekurze.
V testu se můžou objevit nasledující příklad:

 - Co je objekt, instance, třída?
 - Jaké jsou modifikátory přístupu?
 - Upravte dané třídy tak, aby v kódu bylo co nejméně duplicit (využití dědičnosti)
 - Upravte kód tak aby byl spustitelný
 - Co uvedený kód vykoná?

```java
    public static void print(int a) {
        if(a < 0) {
            return;    
        } 
        
        print(--a);
        System.out.pritln(a);
    }
```

K testu jsou povoleny vlastnorucně napsané taháky velikosti jedna A4.
