package Animació;

import processing.core.PApplet;

public class TwinTriangle extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Animació.TwinTriangle");
    }

    float[] xs;
    float[] ys;
    float x,y;
    int numTragecte;
    float t;
    public void settings(){size(800,800);}

    public void setup(){
        xs= new float[3];
        ys= new float[3];
        xs[0]=100;ys[0]=50;
        xs[1]=600;ys[1]=250;
        xs[2]=300;ys[2]=650;
        t=0;
        numTragecte=0;
    }

    public void draw(){
        background(255);

        x= xs[numTragecte]+(xs[(numTragecte+1)%xs.length]-xs[(numTragecte)%xs.length])*t;
        y= ys[numTragecte]+(ys[(numTragecte+1)%ys.length]-ys[(numTragecte)%ys.length])*t;
        if(t<1){
            t+=0.1;
        }else{
            numTragecte++;
            t=0;
            numTragecte= numTragecte% xs.length;
        }

        for(int i=0; i<xs.length;i++){
            stroke(0);
            line(xs[i], ys[i], xs[(i + 1)% xs.length], ys[(i + 1)% ys.length]);
            fill(255);
            circle(xs[i],ys[i],50);
        }
        fill(0);
        circle(x,y,100);
    }
}
