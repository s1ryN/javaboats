# javaboats
1. Vytvořte třídu Lod, která bude jako vlastnosti obsahovat public int rychlostkmh (v km za hodinu) a public String jmeno, dále pak dva konstruktory (z toho jeden bezparametrový) a  metody setJmeno(), getJmeno(), setRychlostkmh(), getRychlostkmh() a informuj(). Poslední metoda vypíše všechny známé informace o lodi. Od třídy Lod děděním vytvořte třídu Plachetnice, která bude mít navíc vlastnost public boolean napnuteplachty. Pro novou třídu vytvořte 2 konstruktory (z toho jeden bezparametrový), dále pak metody setNapnuteplachty(), getNapnuteplachty() a informuj().  Poslední metoda vypíše všechny známé informace o plachetnici. V metodě main vytvořte jeden objekt typu Lod a jeden typu Plachetnice (vždy použijte parametrizovaný konstruktor) a informace o nich vypište na obrazovku pomocí metod informuj().

2. V metodě main vytvořte další Lod a Plachetnici, tentokrát použijte konstruktory, které jste nepoužili v bodě 1. Plachetnici pak změňte jméno na "Santa Maria".

3. Ve třídě Lod napište metodu uzly(), která převede rychlost v km/h na uzly a vytiskne výsledek na monitor. Metodu použijte ukázkově pro loď, která se nejmenuje "Santa Maria" v metodě main.

Nápověda: 1 Kilometr za hodinu = 0.54 Uzly

4. Změňte přístup u všech třech vlastností z public na private. Upravte program tak, aby výstup z něj byl shodný jako dříve.

5.  Od třídy Lod děděním vytvořte třídu MotorovaLod, která bude mít navíc vlastnost private int cislolode. Pro novou třídu vytvořte dva konstruktory (z toho jeden bezparametrový) a jednu metodu informuj().  Metoda vypíše všechny známé informace o plachetnici. 

6. V metodě main vytvořte 100 motorových lodí pomocí bezparametrického konstruktoru a vypište na obrazovku informace o všech těchto 100 motorových lodí. Vzhledem k počtu objektů všechny motorové lodě uložte do pole MotorovaLod [] motor. Využijte cyklus for.

Nápověda jak vytvořit instance:  

MotorovaLod[] motor = new MotorovaLod[100];

motor[1] = new MotorovaLod();
motor[2] = new MotorovaLod();

 

Požadovaný výstup na monitor:

Lod se jmenuje Noname a jede rychlosti 0 km/h.

Plachetnice se jmenuje Santa Maria a jede rychlosti 0 km/h a napnute plachty jsou false.

Lod se jmenuje Frank a jede rychlosti 75 km/h.

Plachetnice se jmenuje Lucia a jede rychlosti 50 km/h a napnute plachty jsou true.

Rychlost lode Lucia je 27.0 uzlu.

----------------------------------

100 motorovych lodi:

Motorová lod číslo 1 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 2 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 3 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 4 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 5 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 6 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 7 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 8 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 9 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 10 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 11 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 12 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 13 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 14 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 15 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 16 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 17 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 18 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 19 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 20 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 21 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 22 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 23 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 24 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 25 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 26 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 27 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 28 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 29 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 30 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 31 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 32 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 33 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 34 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 35 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 36 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 37 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 38 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 39 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 40 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 41 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 42 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 43 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 44 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 45 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 46 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 47 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 48 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 49 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 50 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 51 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 52 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 53 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 54 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 55 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 56 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 57 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 58 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 59 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 60 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 61 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 62 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 63 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 64 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 65 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 66 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 67 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 68 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 69 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 70 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 71 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 72 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 73 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 74 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 75 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 76 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 77 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 78 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 79 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 80 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 81 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 82 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 83 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 84 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 85 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 86 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 87 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 88 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 89 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 90 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 91 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 92 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 93 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 94 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 95 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 96 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 97 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 98 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 99 se jmenuje Noname a jede rychlosti 0 km/h.

Motorová lod číslo 100 se jmenuje Noname a jede rychlosti 0 km/h.

-----------------------------------
