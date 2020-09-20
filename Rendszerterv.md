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
