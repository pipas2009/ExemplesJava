package Animació;

import processing.core.PApplet;

public class WaveMotion extends PApplet {

        public static void main(String[] args) {
            PApplet.main("Animació.WaveMotion");
        }

        float x,y,d;
        int xStep, direction;

        float yb, amplitud, angle, angleStep;

        public void settings(){size(800,800);}

        public void setup(){
            background(255);
            x=0; y=height/2; d=50;
            xStep=1; direction=1;
            yb= height/2; amplitud=200;
            angle=0; angleStep=1;
        }

        public void draw(){
            circle(x,y,d);
            x+=xStep*direction;
            if((x>width && direction==1) || (x<d/2 && direction==-1)){
                direction*=-1;
                background(255);
            }

            y= yb+amplitud*sin(radians(angle));
            angle+= angleStep;
        }
}
