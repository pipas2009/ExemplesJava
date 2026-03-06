package Animació;

import processing.core.PApplet;

public class BoundaryMotion extends PApplet {

        public static void main(String[] args) {
            PApplet.main("Animació.BoundaryMotion");
        }

        float x,y, d=100;
        float Step=15;
        float xDir, yDir;
        public void settings(){size(800,800);}

        public void setup(){
            x=width/2; y=height/2;
            xDir=random(-1,1); yDir=random(-1,1);
        }

        public void draw(){
            background(255);
            fill(0);
            circle(x,y,d);

            x+= Step*xDir;
            y+=Step*yDir;
            if (y<=d/2 || y >= height-d/2){
                yDir *=-1;
            }
            if (x<=d/2 || x >= width-d/2){
                xDir *=-1;
            }
        }

        public void mousePressed(){
            x=width/2; y=height/2;
            xDir=random(-1,1); yDir=random(-1,1);
        }
}
