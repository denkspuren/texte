# Aufgabe: Ball, vier Wände, Reflektion

## 1. Schritt

Programmieren Sie eine kleine Animation in Java 13 mit Hilfe der Processing-Bibliothek. Ein Tutorial finden Sie unter

https://denkspuren.github.io/texte/processing/Tutorial.md.html

Die Grundidee ist einfach: Im Fenster Ihrer Anwendung sieht man eine Kugel in einer zufälligen Richtung losfliegen, die an den Fensterwänden Ihrer Anwendung reflektiert wird. Es ist so ähnlich, als ob Sie von oben auf einen Billardtisch blicken würden und sich den Verlauf einer einzigen Kugel anschauten.

Mehr Vorgaben gibt es nicht. Die Aufgabe hat zum Zweck, mit Processing vertraut zu werden.

## 2. Schritt

Lassen Sie nun mehrere Kugeln über den imaginären Billardtisch laufen.

Es geht nicht nur um den visuellen Eindruck, wenden Sie die objektorientierte Programmierung an. Sobald viele Elemente der gleichen Art zum Einsatz kommen, drängt sich die Objektorientierung auf.

Legen Sie ein Klasse namens `Ball` an, jede Instanz ist ein neuer Ball. Und genauso, wie Sie für die Objekte einer Klasse eine eigene textuelle Repräsentation mittels der `toString`-Methode festlegen können, legen Sie eine Instanzmethode `draw()` an; in dieser Methode befinden sich die Anweisungen, um einen Ball in Processing zu zeichnen. Innerhalb der `draw`-Methode können Sie nun zum Beispiel mit `ellipse(...)` einen Ball als Kreis aussehen lassen.

Zum Start mag Ihnen der folgende Code helfen:

``` java
import processing.core.PApplet;

public class MySketch extends PApplet {
    public static void main(String[] args) {
		PApplet.runSketch(new String[]{""}, new MySketch());
    }

    Ball b1 = new Ball(color(17,50,230));
    Ball b2 = new Ball(color(230,50,17));

    public void settings() {
        size(600,600);
    }

    public void setup() { 
        background(0);
    }

    public void draw() {
        background(0);
        b1.randomPos();
        b1.draw();
        b2.randomPos();
        b2.draw();
    }

    class Ball {
        int x, y;
        int color;
        Ball(int color) {
            this.color = color;
            randomPos();
        }
        void randomPos() {
            x = (int)(Math.random() * width);
            y = (int)(Math.random() * height);
        }
        void draw() {
            fill(color);
            ellipse(x,y,40,40);
        }
    }
}
```

Ihre Bälle sollen im Gegensatz zu dieser Flickeroptik ansehlich über den "Tisch" rollen. Wie wäre es beispielsweise mit einer Kollisionserkennung? Dann wird das Programm zu einer kleinen Herausforderung!

Eine geringfügig andere Strukturierung des Codes verzichtet auf `Ball` als eingeschachtelte Klasse und den Komfort, auf diese Weise leichter auf die Umgebung von `PApplet` zurückzugreifen. Softwaretechnisch ist die Trennung der Anwendung in zwei separate Klassen "sauberer":

``` java
import processing.core.PApplet;
import processing.core.PGraphics;
public class MySketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main(MySketch.class);
    }
    Ball b1;
    Ball b2;
    public void settings() {
        super.size(600, 600);
    }
    public void setup() {
        super.background(0);
        this.b1 = new Ball(color(17, 50, 230), super.width, super.height);
        this.b2 = new Ball(color(230, 50, 17), super.width, super.height);
    }
    public void draw() {
        super.background(0);
        this.b1.randomPos();
        this.b1.draw(super.g);
        this.b2.randomPos();
        this.b2.draw(super.g);
    }
}
class Ball {
    int x, y;
    int color;
    int widthBound, heightBound;
    Ball(int color, int widthBound, int heightBound) {
        this.color       = color;
        this.widthBound  = widthBound;
        this.heightBound = heightBound;
        this.randomPos();
    }
    void randomPos() {
        this.x = (int)(Math.random() * this.widthBound);
        this.y = (int)(Math.random() * this.heightBound);
    }
    void draw(PGraphics g) {
        g.fill(this.color);
        g.ellipse(this.x, this.y, 40, 40);
    }
}
```

> Anmerkung: Die beiden Bälle `b1` und `b2` werden in `setup()` initialisiert, da die Fenstergröße erst in `settings()` festgelegt wird und diese bei der Erzeugung der Bälle für deren Begrenzungen feststehen muss.



