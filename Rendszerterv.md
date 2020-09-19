Rendszerterv
============

## 9. Adatbázis terv

Az adattárolás valójában nem egy adatbázis segítségével valósul meg, hanem egyszerűen egy szöveges dokumentumot használunk. Ez jelen esetünkben teljesen megfelelő (az esetleges bővítés is biztosítása is lehetséges).

A sorok felépítése az alábbi:
+ [nyelv angol rövidítése],[nehézség],[válasz1],[válasz2],[válasz3],[válasz4],[helyes válasz]
+ + használt nyelvek: "eng", "russ", "finn"
+ + nehézség: "easy", "medium", "pro"

A válaszokat tartalmazó dokumentum soronként kerül feldolgozásra és az elemei a megfelelő tömbbe tárolódnak el, amik a teszt során megjelenítésre kerülnek. Futáskor mindíg csak a kiválasztott nyelv megfelelő nehézsége kerül "betöltésre", ezért fontos ezeket odaírni. Ha a sorokon belül az elemek valamilyen oknl fogva fel vannak cserélve a program lefut, de valószínüleg nem a várt eredményt kapjuk.

A kérdések képek formájában vannak használva, a képek a nyelvnek, azon belül a nehézségnek megfelelő mappában vannak, a resources mappán belül.

Ha tartjuk a sorok formáját lehet bővíteni több kérdéssel (természetesen, ha a hozzá tartozó képet is elhelyezzük a mefelelő mappában). A kérdések maximális száma egyszeri betöltésre 999.
