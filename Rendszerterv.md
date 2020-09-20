Rendszerterv
============

## A rendszer célja

Mivel napjainkban már minden fiatal és idős egyaránt a modern technológiát használja a mindennapi életben ezért kézenfekvő megoldásnak tűnik a nyelvtanulás és minden tanulási folyamat digitalizálása.
Az utóbbi időben a koronavírus járvány kitörtével láthattuk,hogy mennyire fontos az,hogy az oktatás ne csak papír alapon legyen lehetséges. 
A rendszer célja a nyelvet tanulni vágyók számára a gyakorlás könnyebb elérése és a tanulás megkönnyítése.
Szeretnénk a nyelvtanárok és a diákok életét is megkönnyíteni azzal,hogy ha az órákon nem tudnak részt venni ,nem köti le őket a szavak szótárból tanulása vagy esetleg újból távoktatáshoz kellene folyamodni, akkor is lehetséges legyen a szavak könnyű memorizálása.

## Projekt terv

A következő tervben a dátumok és a fejlesztők felsorolása történik. Fontos még,hogy az erőforrás amikkel dolgozunk az mindenkinek a saját gépe lesz.

### Fejlesztők:
+ Szuhai Dávid
+ Nagy Viktor
+ Boros Gergely
+ Ranyhóczki Mariann
  
### Ütemterv
+ 2020.09.07- 2020.09.14 -Követelményspecifikációk megírása
+ 2020.09.14 - 2020.09.21- Funkcionális Specifikáció és Rendszerterv megírása
+ 2020.09.21 - 2020.10.05 - A program megírása, tesztelése 
+ 2020.10.05 - Program bemutatása, kiértékelése.

### Mérföldkövek:
+ A Githubon a projekt repository elkészítése
+ A követelmény specifikáció megírása
+ A funkcionális specifikáció megírása
+ A rendszerterv megírása
+ Az adatok kigyűjtése
+ Fejlesztés megkezdése
+ Tesztelés
+ Bemutatás

## Üzleti folyamatok

### Üzleti szereplők
+ A gyakorlóprogram használói főleg fiatalok lesznek, akik nyelvvizsgára készülnek vagy csak gyakorolják a nyelvet a nyelviskolában.
+ A program persze olyan idősebb felhasználók között is használható lesz akik a nyelviskolában jelentkeztek a kurzusra, ezért fontos, hogy könnyen értelmezhető és kezelhető legyen

### Üzleti folyamatok
+ A folyamat, a használat nagyon egyszerű
+ A program feltelepítése után indítható is a tanulás.
+ Egy ablakban látjuk a használható gombokat, egy Exitet mely bezárja a programot, egy Mute gombot, amellyel a háttérzenét némíthatjuk le valamit itt tudjuk kiválasztani milyen nyelven szeretnénk felmérni a tudásunkat, vagy gyakorolni.
+ 3 nyelvből választhatunk ;angol, finn és orosz.
+ A nyelv kiválasztása után 3 nehézségi szint közül választhatunk.
+ A szintválasztás után minden oldalon kapunk egy magyar szót és a választott nyelven a lehetséges fordításait melyek közül ki kell választani a megfelelőt.
+ A végén láthatjuk hány jó válaszunk volt majd a menu gombbal előről tudjuk kezdeni.

## Absztrakt domain modell

A rendszerünk egy gépből áll, mivel a szoftver csak a adott gépen fut, nem használ semmiféle hálózati kapcsolatot, nem kommunikál semmiféle módon bármilyen szerverrel.

## Architektúrális terv

Ismételten a program helyileg fut, egyszerre összesen csak egy felhasználó tudja használni. Ha a program valamilyen módon leáll, az addig történtek benne elvesznek, nem kerülnek semmilyen módon tárolásra.

A felhasználó a programból azt, vagy adatait nem tudja módosítani, viszont a dokumentumok nincsenek titkosítva.

## Adatbázis terv

Az adattárolás valójában nem egy adatbázis segítségével valósul meg, hanem egyszerűen egy szöveges dokumentumot használunk. Ez jelen esetünkben teljesen megfelelő.

A sorok felépítése az alábbi:
+ [nyelv angol rövidítése],[nehézség],[válasz1],[válasz2],[válasz3],[válasz4],[helyes válasz]
+ + használt nyelvek: "eng", "russ", "finn"
+ + nehézség: "easy", "medium", "pro"

A válaszokat tartalmazó dokumentum soronként kerül feldolgozásra és az elemei a megfelelő tömbbe tárolódnak el, amik a teszt során megjelenítésre kerülnek. Futáskor mindíg csak a kiválasztott nyelv megfelelő nehézsége kerül "betöltésre", ezért fontos ezeket odaírni. Ha a sorokon belül az elemek valamilyen oknl fogva fel vannak cserélve a program lefut, de valószínüleg nem a várt eredményt kapjuk.

A kérdések képek formájában vannak használva, a képek a nyelvnek, azon belül a nehézségnek megfelelő mappában vannak, a resources mappán belül.

A kérdések maximális száma egyszeri betöltésre 999.


## Követelmények

+ A program windows 10 rendszeren fusson. 
+ A rendszer több nyelven is tudja tesztelni a felhasználók tudását.
+ A rendszer több nehézségen is tudja tesztelni a felhasználók tudását.
+ Lehessen bővíteni a szavakat a program átadása után.
+ 4 válaszlehetőség legyen minden kérdésnél.
+ Írja ki az eredményt a teszt végén.


## Funkcionális terv

A funkcionális működést az alábbi képernyő tervekkel szeretném felvázolni.
Amint megnyitjuk a programot és az elindul egyből egy kép tárul elénk amin fel van tüntetve a program neve,
valamint utasít minket aprogram hogy válasszunk nyelvet. Ehhez 3 egyforma gombot jelenít meg a képernyő közepén
egymás alatt rajta a 3 különböző nyelvvel (Angol, Orosz, Finn). Amint kiválasztjuk az egyik nyelvet, nem változik semmi a képernyőn, csak a gombok tartalmán kívül,
most a program a nyelv nehézségi szintjének kiválasztását hozza fel lehetőségül melyek: Kezdő, Haladó és Szakértő.
Ezután a képernyő teljesen megváltozik, fent középen az idegen szó kerül kiírásra és alatta 4 szó hazai nyelven melyek közül az egyik a helyes megfelelője.
Amint rákattintunk a 4 gomb közül valamelyikre még nem jelenik meg az eredmény, az majd csak a teszt végén kerül kiírásra.
a képernyő változatlan marad, csak a kiírás és a gombok tartalma változik meg. Amint válaszolunk X kérdésre a helyes eredmény kiírásra kerül és újra kezdhetjük a tesztet vagy kiléphetünk belőle.

Ezt egy UML diagrammal ábrázolva: 

![Funkcionális terv ábrázolása](https://github.com/szuhi27/trilingo/tree/master/src/main/resources/images/funkcterv.png)

## Fizikai környezet

A programot Java nyelven írjuk java fx segítségével, adatbázisnak egyszerű szöveges dokumentumot alkalmazunk,
Windows 10 rendszerre.
