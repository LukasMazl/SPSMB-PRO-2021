# OOP - Objektově orientované programování

V objektově orientovaném programování se snažíme na data/struktury nahlížet jako na realné objekty. 
Například pokud bychom měli objekt Stůl, který má vlastní atributy, tak nedává smysl mít jeho atribut ,,výška" uložen poblíž objektu studenty. 
Mělo by být patrné, že výška stolu něco vypovídá o tom, jaký ten stůl je. Dává tedy smysl mít tato data uspořádána do struktury u sebe
abychom je nemuseli ,,lovit" na různých místech kódu.

S tím souvisí ale i otázka, která data my chceme aby byla změněna,
nebo lépe, jak omezit přístup k atributům. Může nastat problém, že máme bankovní účet a na něm částku.
Doopravdy chceme, aby k tomu mohl přistoupit každý a tím si změnit obnos na účtu? (Pokud to jsme my tak ano :D ale ostatním to nechceme zpřístupnit).
Tento problém řeší modifikátory přístupy, resp. obecněji zapouzdření. Zapouzřední je první důležitou vlastností OOP.

Pokud jsem na začátku tohoto .md souboru řekl, že objektové programování nahlíží na data jako na reálné objekty,
tak potom jaký bude rozdíl mezi objektem Pes a objektem Zvíře? Můžeme s jistotou říci, že Pes je Zvíře, tudíž Pes bude mít vlastnosti stejné jako Zvíře, plus objekt Pes bude mít ještě
své specifické vlastnosti. Můžeme to říci i opačně? Můžeme říci, že Zvíře je to samé jako Pes? Se stoprocentní jistotou to říci nemůžeme, protože 
co když to zvíře na které ukazujeme je Žirafa? Můžeme ale znovu řici s jistou, že Žirafa je zvíře.
Pokud bychom měli to, co se nyní snažím dlouze popsat, nakreslit, zjistíme že se toto chování dá nakreslit jako ,,rodokmen".
V kořenu tohoto rodokmenu je Zvíře, které má potomky Psa, Žirafu a bůhvíco ještě... Tomuto se v OOP říká Dědičnost.

Třetí důležitou vlastností OOP je polymorphismus. S ním jsme se už setkali např. když jsme vytvářeli několik metod, se stejným názvem lišící se pouze v typu nebo počtu parametrů.
Pokud bych měl zůstat u příkladu se zvířaty, tak si to lze představit tak,
že po každém zvířeti chceme, aby vydalo zvuk. Každé zvíře vydává jiný zvuk,
přitom ale můžeme řici, že každé zvíře bude mít ,,metodu" makeSound(). Liší
se pouze v implementaci této metody.

Základní vlastnosti OOP jsou:
 - Zapouzdření
 - Dědičnost
 - Polymorphismus
    
## Základní pojmy
 - Konstruktor - Druh metody, která se zavolá k okamžiku vytváření nové instance. Jedná se o metodu, která sestaví objekt/inicializuje objekt.
 - Getter/Setter - Pomocné metody pro získání nebo nastavování hodnot v objektu. Slouží pro kontrolu/validaci nastavovaných dat.
 - Static/non-static - Statické metody jsou vázané na třídu. Nestatické metody jsou vázané na objekt.
 - Object - V programu reprezentuje reálnou věc. Objekt data se skupinuje v paměti.
 - Třída - Vzor podle kterého se vytváří objekt v paměti
 - Instance - To samé jako object => instance == object

## Životní cyklus třídy

 - Statická inicializace - Je provedena když je odkazováno na třídu
 - Inicializace objektu - Provádí se když se vytváří nová instance třídy
 - Zavolání kontruktoru - První metoda, která se zavolá když objekt vzniká. Má za úkol objekt inicializovat.
