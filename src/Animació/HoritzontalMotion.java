package Animació;

import processing.core.PApplet;

public class HoritzontalMotion extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Animació.HoritzontalMotion");
    }

    float x,y, d=100;
    float xStep=5;
    int direction=1;
    public void settings(){size(800,800);}

    public void setup(){
        x=width/2; y=height/2;
    }

    public void draw(){
        background(255);
        fill(0);
        circle(x,y,d);
        x+= xStep*direction;
        if ((direction==1 && x>=width-d/2)||(direction==-1 && x<d/2)){
            direction*=-1;
        }
    }
}
