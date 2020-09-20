Funkcionális specifikáció
=========================
## Jelenlegi helyzet

A jelenlegi helyzetben azért szükséges a változás, hiszen a papírok és könyvek könnyen eltűnhetnek és roncsolódhatnak, valamint cél a tanulás vonzóbbá tétele és a diákok motiválása.

+ Papír alapú nyelvvizsga anyagok
+ Személyesen történő oktatás
+ Tapasztalt motiválatlanság amikor szótárból kell szavakat tanulni
+ Személyesen történő felmérés és gyakorlás
+ Sok óraadó tanár foglalkoztatása


## Használati esetek

A programban csak a felhasználó fér hozzá az adatokhoz, viszont azokat még ő sem módosíthatja. Az adatok feldolgozása a háttérben történik, azok feldolgozás során nem módosulnak semmilyen módon. Új adatok nem kerülnek eltárolásra, sem létrehozva a program futása során.

A felhasználó a program indulásakor két kérést ad a programnak. Az elsőben kiválaszja melyik nyelvet szeretné teljesíteni, a másodikban, hogy milyen nehézségen.

Eztán a program véletlen sorrendben adja ki a felhasználónak a kérdéseket, aki azokat meg próbálja megválaszolni. E közben eltárolásra kerül a helyes válaszok száma, ami a teszt kitöltése után a felhasználó számára megjelenítésre kerül.

A szoftver indukásáról és leállásáról a felhasználó dönt, azt a futás bármely pillanatában be tudja zárni. A teszteket bármikor félbe tudja szakítani a program bezárása nélkül, úgy, hogy a menübe visszatér.

A felhasználó elvárhatja, hogy az adott gobm lenyomásásra, annak megflelelően válaszol a program, ha egy választ ad a teszt során a kérdés helyességétől függetlenül meg fogja kapni a következő kérdést.

A program bezárását követően az előző futás bármely információja elveszik, azok mint például egy teszt során elért eredmény nem kerül eltárolásra.

## Képernyő tervek
------------------------------
A program megjelenésének célja, hogy a szövegek és a gombok ne legyenek nagyon összezsúfolva, legyen köztük egy kis tér, hogy ne történjen esetleges félrekattintás a felhasználó által. Továbbá az alkalmazás minden képernyőjén jelen van a "Menu", az "Exit" és a "Mute" gombok. A "Menu" gomb rákattintásával visszatérünk a kezdőképernyőre, ahol a nyelveket tudjuk kiválasztani. Az "Exit" gomb a programból való kilépést jelenti. A "Mute" gombbal pedig a háttérben szóló zenét tudjuk be-ki kapcsolni, ami a gomb színének változásával járul, hogy tudjuk jelenleg milyen állapotban van. Ezen gombokat a program különböző sarkaiban helyezzük el. A program háttere egy egyszerű, egyszínű kép, hogy ne zavarja a felhasználót a program használata közben. A nyelv és a nehézség kiválasztása után egy képet és négy gombot találunk, ahol a gombok egyenlő távolságra vannak egymástól és a kép a gombok felett találhatóak, mind középre igazítva. Az utolsó képernyőn pedig program közepén található az eredmény, amit a felhasználó elért. Az egész grafikus felhasználói felület (**G**raphical **U**ser **I**nterface) JavaFX, SceneBuilder segítségével fog elkészülni.

## Forgatókönyvek
------------------------------
A tanuló megnyitja az alkalmazást és a képernyőn megjelent három nyelv közül rákattint az angol nyelvre, amit gyakorolni szeretne. A koncentrálás miatt a háttérben futó zenét lenémítja a jobbfelső sarokban lévő "Mute" gombbal. Ezután választ egy nehézségi szintet, ami most haladó lesz. Ezt követően megjelenik egy szó angolul, és megpróbálja kiválasztani tudásának megfelelően a helyes választ. Ezt megteszi ötször és az ötödik kérdés után kap egy visszajelzést, hogy hogyan teljesített, mennyi szót talált el helyesen. További gyakorlás érdekében a balfelső sarokban lévő "Menu" gombra kattintva újra a kezdőképernyőn találja magát és most a finn nyelvet választja alap szinten. Két kérdés után úgy dönt, hogy túl késő van már a gyakorláshoz, így a jobbfelső sarokban lévő "Exit" gombra kattintva kilép a programból.

## Funkció – követelmény megfeleltetés
------------------------------
- A program egyszerű felépítése mindenki számára könnyű kezelést jelent.
- A kód megírása Java-ban történik, így a GUI megtervezése JavaFX SceneBuilder segítségével nagyon könnyen megvalósítható
- A nyelvek kiválasztásánál a gombok háttere az országok zászlaja, ezzel vizuálisan is kellemes a kezdőképernyő a felhasználó számára

## Fogalomszótár
------------------------------
* GUI (Graphical User Interface): a felhasználó számára lehetővé teszi a program egyszerű használatát gombok és rajzolt elemek megjelenítésével
* JavaFX: a Java GUI könyvtára, melynek segítségével tudunk grafikus felhasználói felületet készíteni a programunknak
* SceneBuilder: JavaFX applikációk felhasználói felületének megtervezését nagyban segítő alkalmazás, amihez nem kell semilyen kódolási tudás, így akárki használni tudja
