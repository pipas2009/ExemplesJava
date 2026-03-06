package Animació;

import processing.core.PApplet;
import processing.core.PImage;

public class AnimacióClasse extends PApplet{
    Personatge p1, p2;

    public static void main(String[] args) {
        PApplet.main("Animació.AnimacióClasse");
    }

    public void settings(){size(1400,800);}

    public void setup(){
        p1= new Personatge(100,400,1,5,5,8,"frame");
        p1.loadImages(this);

        p2= new Personatge(300,100,-1,15,1,10,"Artboard ");
        p2.loadImages(this);
    }
    public void draw(){
        background(255,0,0);
        p1.display(this);
        p1.move(this);
        p1.updateFrame(this);
        p2.display(this);
        p2.move(this);
        p2.updateFrame(this);
    }
}

