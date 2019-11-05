// Original source code: https://gist.github.com/denkspuren/86e2132b6563d609902e
// Minor adaptations were required for a Java 13 environment.  

import processing.core.PApplet;
import processing.core.PGraphics;

public class MySketch extends PApplet {
    public static void main(String[] args) {
        String[] appArgs = {"Grab Ball"};
		MySketch mySketch = new MySketch();
		PApplet.runSketch(appArgs, mySketch);
    }

    int THMGreen = color(128, 186, 36);
    int THMGrey  = color(74, 92, 102);
    int THMRed   = color(184, 0, 64);

    float x, y;
    int time;
    int count = 0;

    public void settings() {
        size(400, 300);
      }

    public void setup() {
        background(THMGreen);
        noStroke();
        paintNewEllipse(THMGrey);
    }

    void paintNewEllipse(int color) {
        x = random(0+20, 400-20);
        y = random(0+20, 300-20);
        fill(color);
        ellipse(x, y, 40, 40);
    }

    public void draw() {
        if (count == 0) {
            time = millis();
        } else {
            fill(THMGreen);
            rect(0, 0, 60, 20);
            fill(THMGrey);
            text((20000f+time-millis())/1000f, 10, 15);
        }
        if (get(mouseX, mouseY) == THMGrey) {
            fill(THMRed);
            ellipse(x, y, 40, 40);
            paintNewEllipse(THMGrey);
            count++;
        }
    }
}