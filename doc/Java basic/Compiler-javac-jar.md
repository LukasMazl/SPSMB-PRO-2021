# Autor Tran a Mlejnecký

## Javac
```
   javac [ příkazy ] [ soubory ] [ třídy ] [ argumenty ]
```

#### Popis
Javac je nástroj, který čte třídy a definice rozhraní, které jsou napsané v programovacím jazyce Java a sestaví je do souborů tříd v bajtkódu. Také zpracovává komentáře v zdrojových souborech a třídách Javy.

#### Příklad
```
   javac @path1\options @path2\sourcefiles @path3\classes @path4\
```

#### Obrázek

```
                  ┌-------------------┐
                  |   Java Program    |
                  └-------------------┘
                            |
                            |
                            |
                            ▼
                  ┌-------------------┐
                  |       Javac       |
                  |     (Compile)     |
                  └-------------------┘
                          _/|\_
                        _/  |  \_
                      _/    |    \_
                    _/      |      \_
                  _/        |        \_
                  
```