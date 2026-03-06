package Animació;

import processing.core.PApplet;

public class RadialMotion extends PApplet{

        public static void main(String[] args) {
            PApplet.main("Animació.RadialMotion");
        }

        float x,y, d=100;
        float xc,yc,radi,angle,angleStep;
        public void settings(){size(800,800);}

        public void setup(){
            xc= width/2; yc= height/2;
            radi=200;
            angle =0; angleStep=1;
        }

        public void draw(){
            background(255);
            fill(0);
            x= xc+ radi*cos(radians(angle));
            y= yc+ radi*sin(radians(angle));
            angle+=angleStep;
            circle(x,y,d);
        }
    }
