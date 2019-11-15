# Car

Erstellen Sie eine Klasse *Car* 
 
 Jedes Auto soll 
 - Eine Beschreibung `carDesc`,
 - Eine Tankkapazität `fuelCap`,
 - Den Tankinhalt `fuel`,
 - Den Spritverbrauch (l pro 100km)   `fuelConsum`, 
 - Eine Farbe `color`
 - Eine Seriennummer `serialId` 
 
 haben. Außerdem soll jedes Auto die Methode
`drive(km)` kennen und sinnvoll ausführen. 
Um an die Informationen des Auto zu kommen nutzen wir die `toString()` methode, die alle oben gegeben Eigenschaften ausgibt. Außerdem soll es auch den Weg ausgeben, der mit der momentanen Tankfüllung zurücklegen kann.

Der Konstruktor soll ein Argument annehmen und zwar ein `model` (enum) welche Eigenschaften wie `carDesc`, `fuelCap` usw. vorgibt und dem Auto zuweist.
Die `serialId` soll immer 1 höher sein als die, vom letzten Auto.

Außerdem sollen die Autos per `equals()` verglichen werden  können.

## Anwendung 

Erstelle 3 _verschiedene_ Autos 3 verschiedener Modelle. Auto 1 fährt 300km, Auto 2 170,3km und Auto 3 420,69 km.
Geben nach den Fahrten jeweils die `toString()` methode aus.
Erstelle ein Auto des gleichen Modells wie Auto 1 und überprüfe die Gleichheit der der 2 Autos über ein assert.
