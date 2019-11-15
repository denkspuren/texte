# Aufgabe: Klasse `Car`

Erstellen Sie eine Klasse namens `Car` (Auto) mit den nachstehenden Eigenschaften. Jedes Auto soll

 - eine Beschreibung `carDesc`,
 - eine Tankkapazität `fuelCap` in Litern,
 - den Tankinhalt `fuel` in Litern,
 - den Spritverbrauch (Liter pro 100km)  `fuelConsum`, 
 - eine Farbe `color` und
 - eine Seriennummer `serialId` haben.

## Konstruktor und Methoden

Außerdem soll jedes Auto die Methode `drive(km)` kennen und sinnvoll ausführen. 
Um an die Informationen des Auto zu kommen nutzen wir die `toString()`-Methode, die alle oben gegeben Eigenschaften ausgibt. Außerdem soll es auch den Weg ausgeben, der mit der momentanen Tankfüllung zurücklegen kann.

Der Konstruktor soll ein Argument annehmen und zwar ein `Model` (enum) welche Eigenschaften wie `carDesc`, `fuelCap` usw. vorgibt und dem Auto zuweist.
Die `serialId` soll immer 1 höher sein als die, vom letzten Auto. Die Zählung beginnt für das erste Auto mit der Nummer 1.

Außerdem sollen die Autos per `equals()` verglichen werden können.

## Anwendung 

Erstelle drei _verschiedene_ Autos drei verschiedener Modelle. Das Auto mit der Seriennummer 1 fährt 300 km, Auto Nr. 2 170,3 km und Auto Nr. 3 420,69 km.
Gebe nach den Fahrten jeweils die `toString()`-Methode aus.
Erstelle ein Auto des gleichen Modells wie Auto Nr. 1 und überprüfe die Gleichheit der beiden Autos mittels `assert`-Anweisungen.
