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

## Tesztterv
------------------------------
Minden programot tesztelni kell, mivel sohasem lehet tudni mikor mi nem működik úgy ahogy annak kellene. Tökéletes kód nem létezik, ezért van szükség tesztelésre. A kód írója persze állandóan nézi, hogy amit implementál, az úgy működik-e, ahogy ő azt tervezte, azonban ez szinte soha sem elég. Ezért van mindig szükség legalább egy, de inkább több harmadik személyre is, akik kipróbálják a programot, mert ahány ember, annyiféle módon használnak egy alkalmazást. Így bukkanhatunk rá olyan hibákra is, amire egyáltalán nem is számítottunk. Azonban nem csak hibákat próbálunk keresni teszteléskor, hanem más szempontjából is akarjuk látni, hogy milyen is maga a program. Kaphatunk ötleteket, hogy mivel egészítenék ki az eddigi munkát, vagy hogy min változtatnának rajta, mivel szerintük az jobb lenne a felhasználóknak.

A tesztelés fázisai:

* alpha teszt
* beta teszt

Az alpha teszt legfőképp in-house történik, hogy megnézzük működnek-e az alapfunkciók. Ilyen lehet például:

- elindul-e a program más környezetben/számítógépen
- működik-e minden gomb
- egy gomb nyomására az elvárt eredményt kapjuk-e, jelen esetben angol nyelv választásakor angol szavak jelennek-e meg

A beta teszt pedig már lehet nyilvános is, ilyenkor akárki tesztelheti, aki szeretné. Ekkor már rengeteg visszajelzést kaphatunk, lehet az bug report, vagy új ötlet, változtatás az eddigi működésben. Például:

- gombok elhelyezése
- új gomb funkció
- más háttér alkalmazása

Sikeresnek mondható a teszt, ha már szinte semmiféle probléma nem található a programban, és a mások által feltett és a fejlesztő által elfogadott változtatásokat, újításokat is implementáltuk. Ezután meg is történhet a szoftver első kiadása.

## Telepítési terv
------------------------------
A számítógépekre való feltelepítéshez szükség van egy pár követelményre:

- egy működő számítógép
- annak hozzáférése az internethez
- valamint egy internet böngésző

Ha ez mind megvan, akkor csak egyszerűen be kell gépelni a címsorba a weboldalnak a címét, ahonnan letölthető lesz a futtatható program. Semmiféle telepítésre nincs szükség, egy dupla kattintással máris elindul és használható is. Ajánlatos a letöltött program ikonját az asztalra elhelyezni, hogy a felhasználók könnyen meg tudják találni, ezzel segítve azokat, akik nem nagyon értenek a számítógépekhez.

## Karbantartási terv
------------------------------
Természetesen egy szoftver kiadása után nem áll le a fejlesztése. Szükség van további javításokra és bővítésekre. A később felmerülő hibákat és ötleteket jelezni kell a feljesztőknek, akik folyamatosan dolgoznak ezen problémák megoldásán, így szükség van a program karbantartására. Ehhez megfelelően a felmerülő súlyos hibákat minél gyorsabban javítják és adják ki az újabb verziót, amit újra le kell tölteni a korábban megadott weboldalról. Viszont az új ötletek megvalósításához több időre van szükség, így azok minden hónap elején, az esetleges bugfixekkel együtt, kerülnek kiadásra. Mivel a szoftver futásához nincs szükség internetkapcsolathoz, így nagy eséllyel az esetleges vírus fenyegetettség miatt nem kell aggódni. 
