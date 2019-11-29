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
 



