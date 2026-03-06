package Animació;

import processing.core.PApplet;

public class CorMotion extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Animació.CorMotion");
    }

    float t = 0; // angle paramètric
    float d = 20; // mida del cercle
    float scale = 10; // amplada del cor
    float xc, yc; // centre
    public void settings() { size(800, 800); }

    public void setup() {
        xc = width / 2;
        yc = height / 2;
        background(255);
    }

    public void draw(){
        float x= xc + scale *16* pow(sin(radians(t)),3);
        float y = yc - scale * ( 13 * cos(radians(t)) - 5 * cos(radians(2 * t)) - 2
                * cos(radians(3 * t)) - cos(radians(4 * t)) );
        fill(255, 0, 0);
        noStroke();
        circle(x, y, d);

        t += 1;
        if (t > 360) {
            t = 0;
            background(255);
        }
    }

}
