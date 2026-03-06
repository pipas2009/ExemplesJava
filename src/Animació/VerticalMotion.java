package Animació;

import processing.core.PApplet;

public class VerticalMotion extends PApplet {

        public static void main(String[] args) {
            PApplet.main("Animació.VerticalMotion");
        }

    float x,y, d=100;
    float xStep=5;
    int direction=1;
        public void settings(){size(800,800);}

    public void setup(){
        x= width/2; y= height/2;
    }

    public void draw(){
        background(255);
        fill(0);
        circle(x,y,d);
        y+= xStep*direction;
        if ((direction==1 && y>=height-d/2)||(direction==-1 && y<d/2)){
            direction*=-1;
        }
    }

}
