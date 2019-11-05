import processing.core.PApplet;

public class MySketch extends PApplet {
    public static void main(String[] args) {
		PApplet.runSketch(new String[]{""}, new MySketch());
    }

    public void settings() {
        size(600,600);
    }

    public void setup() { 
        background(0);
    }

    public void draw() {
        ellipse(mouseX,mouseY,20,20);
    }
}
