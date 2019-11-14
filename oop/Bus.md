# Aufgabe Bus
## 1)
Erstellen Sie eine Klasse *Bus*

Die Klassen müssen alle Variable mit sinnvoll gewählten Datentypen beinhalten, dürfen allerdings noch Hilfsvariablen enthalten.

| Variable | Mögliche Werte |
|--|--|
|  serialNumber | Seriennummer des Busses, automatisch zu vergeben (0 bis (2^63)-1)|
|  driving| Kann entweder fahren oder nicht fahren |
|  maxPassengers| Ganzzahl, größer als 0 und darf nicht verändert werden |
|  passengers| Anzahl Fahrgäste zwischen 0 und *maxPassengers,* Standard 0 |
|busStop| Eine Bushaltestelle mit Namen und Nummer für eine Reihenfolge (Stichwort enum) an der der Bus als nächstes oder momentan ist|

Erstellen Sie mindestens 5 Bushaltestellen, mit frei gewählten Namen.

Bei der Konstruktion soll ein Bus 0 Fahrgäste haben, nicht fahren, und der nächste busStop soll die Haltestelle mit Nummer 1 sein. Es gibt 2 Konstuktoren, die einmal keine Parameter annehmen, und einmal eine maxPassenger anzahl. Standartmäßig soll der Bus 52 Sitzplätze haben. Die Logik im Konstruktor darf nur in einem Konstruktor stehen.

| Methoden | Ausgabe |
|--|--|
| start |Bus Nr. *b* is driving. Next Stop : *nextStop* |
| stop| Bus Nr. *b* stopped at *busStop* |
| enter(amount)|*p* people entered Bus Nr. *b*. It has now *x* out of *y* passengers. |
| leave(amount)| *p* people left Bus Nr. *b*. It has now *x* out of *y* passengers. |



Die *kursiven* Ausdrücke sollen SINVOLL ersetzt werden.

Beachten Sie,

- dass ein Bus

	 - nur losfahren kann, wenn er nicht fährt

	 - nur anhalten kann, wenn er nicht steht

- Fahrgäste nur ein- und aussteigen können, wenn der Bus steht

- nicht mehr als die maximale Anzahl von Personen in einen Bus passen

Der Bus fährt immer hin und zurück; die Haltestellen erfolgen in der Reihenfolge 1,2,3,4……,3,2,1,2,3…. Die Haltestelle muss also geändert werden, sobald der Bus hält;

## 2)

Implementieren Sie die Klasse *Bussimulation*    

Erstellen Sie die Methode simulation1 die folgende Abläufe wiederspiegelt
- Der Bus hat 52 Sitzplätze
- Ein Bus fährt los,
- es sollen 7 Personen einsteigen,
- es sollen 10 Personen aussteigen,
- der Bus hält an,
- in den Bus sollen 41 Personen einsteigen,
- der Bus fährt los,
- der Bus hält an,
- in den Bus sollen 30 Personen einsteigen,
- der Bus erreicht die 5. Haltestelle ohne weitere Zu- und Abgänge.

## 3)

Implementieren Sie eine Klasse Bonte

Die Firma Bonte hat 10 Schulbusse mit jeweils 52 Sitzplätzen.

Implementieren Sie die Methode simlulation2 die folgende Abläufe wiederspiegelt:
- Alle Busse fahren los.
- Alle Busse halten an.
- in die Busse 2,4,6,8 steigen 10 Schüler/-innen ein.
- in die Busse 1,3,5 steigen 15 Schüler/-innen ein.
- in die restliche Busse steigen 20 Personen ein.
- Alle Busse fahren los.
- Alle Busse halten an der letzten Station und alle Schüler/-innen steigen aus


*Löse Schritt 3,4,5 bei der Aufgabe in **einem** switch*


### Für nicht genervte Studenten/Studentinnen
Ein Biologe, ein Physiker und ein Informatiker sitzen in einem - außer ihnen - leeren Bus.    
Vier Personen steigen ein, fünf Personen steigen aus:    
Der Biologe sagt: "Die haben sich vermehrt",    
der Physiker sagt:  "Der Messfehler liegt innerhalb der erlaubten Toleranzgrenze" ,     
der Informatiker sagt : "Jetzt muss nurnoch einer einsteigen, damit der Bus leer ist" . 


