package Animació;

import processing.core.PApplet;

public class SpiralMotion extends PApplet {

        public static void main(String[] args) {
            PApplet.main("Animació.SpiralMotion");
        }

        float x,y, d=100;
        float xc,yc;
        float radi, radiStep;
        float angle,angleStep;
        public void settings(){size(800,800);}

        public void setup(){
            background(255);
            xc= width/2; yc= height/2;
            radi=0; radiStep=0.275f;
            angle =0; angleStep=1;
        }

        public void draw(){
            fill(0);
            x= xc+ radi*cos(radians(angle));
            y= yc+ radi*sin(radians(angle));
            angle+=angleStep;
            radi+= radiStep;
            circle(x,y,d);

            if(radi>width/2){
                radi=0;
                angle=0;
                background(255);
            }
        }
}