Rendszerterv
============

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
