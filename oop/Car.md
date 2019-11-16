# Aufgabe: Klasse `Car`

Erstellen Sie eine Klasse namens `Car` (Auto) mit den nachstehenden Eigenschaften:

Jedes Auto hat eine einmalige und unveränderliche Seriennummer `serialNumber`. Mit jedem Auto wird eine um Eins erhöhte Seriennummer vergeben. Das erste Auto hat die Seriennummer 1.

Mit jedem neuen Auto werden per Konstruktor die Tankkapazität (`tankCapacity` in Litern) und der Durchschnittsverbrauch (`averageFuelConsumption` in Litern pro 100 Kilometer) gesetzt. Beide Konfigurationswerte sind unveränderlich. Der aktuelle Tankinhalt wird über die Variable `tankLevel` (Literangabe) abgebildet; der Tank ist anfangs leer.

Es gibt folgende Methoden:

* `float fuel(float amount)`

Der Wagen wird mit `fuel` um einen Literbetrag `amount` betankt. Sollte zuviel Treibstoff eingefüllt werden, gibt der Rückgabewert den überlaufenden Anteil in Litern an.

* `float drive(float fuel)`

Ein Auto fährt man durch Druck auf das Gaspedal, was eine gewisse Treibstoffmenge in den Motor einspritzt, der seinerseits Räder antreibt. Mit der Methode `drive` wird dieser Vorgang sehr abstrakt und grob  nachgebildet. Die in den Motor eingehende Tankmenge `fuel` führt zu einer Fortbewegung, die eine zurückgelegte Strecke zur Folge hat -- das ist der Rückgabewert der Methode in Kilometern. Nutzen Sie zur Berechnung den Durchschnittsverbrauch, der als Zahl das Motormodell und die Übertragung auf die Reifen modelliert.

* `float getTankLevel()`

Diese Methode bildet den Blick auf die Tankanzeige nach und zeigt den Füllstand in Litern an.

* `float getRange()`

Diese Methode bildet den Blick auf die Reichweitenanzeige nach und zeigt die Entfernung in Kilometern an, die nach aktuellem Füllstand erreichbar ist.

* `float getRange(float fuel)`

Diese Methode berechnet die Reichweite für eine gegebene Tankmenge.

* `String toString()`

Die Repräsentation eines Autos besteht aus `Car` und der Seriennummer. Das erste Auto stellt sich als `Car:1` dar, das nächste als `Car:2` usw.

Ihre Umsetzung soll folgendes Szenario als Tests exakt so erfolgreich durchlaufen.

> Vergessen Sie nicht, die JShell mit `jshell -R-ea` für die Ausführung der `assert`-Anweisungen zu starten.

``` java
// jshell -R-ea
Car myCar = new Car(50.0f, 5.0f);        // Ein neues Auto wird bereitgestellt.
assert myCar.toString().equals("Car:1") : "Es ist das erste Auto der Serie";
assert myCar.getTankLevel() == 0.0f     : "Tank ist leer,";
assert myCar.getRange() == 0.0f         : "darum auch keine Wege fahrbar.";
assert myCar.drive(5.0f) == 0.0f        : "Ein Fahrversuch, 0 km gefahren,";
assert myCar.getTankLevel() == 0.0f     : "weil der Tank nachwievor leer ist";
assert myCar.fuel(10.0f) == 0.0f        : "10 Liter tanken, nichts schwappt über.";
assert myCar.drive(5.0f) == 100.0f      : "Mit 5 Litern kommt man 100 km weit.";
assert myCar.getTankLevel() == 5.0f     : "5 Liter bleiben übrig,";
assert myCar.getRange() == 100.0f       : "womit man noch 100 km fahren kann.";
assert myCar.drive(10.0f) == 100.0f     : "Nur begrenzt Treibstoff verfahrbar.";
assert myCar.getTankLevel() == 0.0f     : "Tank ist leer gefahren,";
assert myCar.getRange() == 0.0f         : "es geht nicht mehr weiter.";
assert myCar.fuel(60.0f) == 10.0f       : "Zuviel getankt, es läuft was über.";
```
