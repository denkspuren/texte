import processing.core.PApplet;

public class MySketch extends PApplet {
    public static void main(String[] args) {
		PApplet.runSketch(new String[]{""}, new MySketch());
    }

    int THMGreen  = color(128, 186, 36);
    int THMGrey   = color(74, 92, 102);
    int THMRed    = color(184, 0, 64);

    float xPos, yPos;
    float xVel, yVel;
    float R = 20;
    float c; // counter
    // boolean winner = true;


    public void settings() {
        size(400,400);
    }

    public void setup() { 
        noStroke();
        xPos = 2*R;
        yPos = (int)(random(2*R,height-2*R));
        xVel = (int)(random(4,6));
        yVel = (int)(random(0,3)-1);
    }

    public void draw() {
        background(THMGreen);
        xPos += xVel;
        yPos += yVel;
        fill(THMGrey);
        ellipse(xPos,yPos,2*R,2*R);
        fill(THMRed);
        rect(350, mouseY, R, 50);
        if (xPos-R < 0 ) xVel = -xVel;
        if (xPos   > width) noLoop(); // Game over!
        if (xPos+R >= 350) {
            if ((yPos+R >= mouseY) && (yPos-R <= mouseY+50)) {
            xVel = -xVel;
            }
        }
        if (yPos-R < 0 || yPos+R >= height) yVel = -yVel;    }
}
