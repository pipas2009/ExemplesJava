package Animació;

import processing.core.PApplet;
import processing.core.PImage;

public class Caminant extends PApplet {


    PImage[] img;
    int numFrame=0;
    int speed= 15;
    float x =0, y=400;
    int direcció=1;

    public static void main(String[] args) {
        PApplet.main("Animació.Caminant");
    }

    public void settings(){size(1400,800);}

    public void setup(){

        loadImages();
    }
    public void draw(){
        background(255,0,0);
        display();
        move();
        updateFrame();

    }

    public void display(){
        tint(150,255,150);
        pushMatrix();
        translate(x,height/2);
        scale(direcció,1);
        image(img[numFrame],0,0);
        popMatrix();
    }
    public void move(){
        x+=5*direcció;
        if((x+img[numFrame].width>=width && direcció==1)||(x<=img[numFrame].width&&direcció==-1)){
            direcció*= -1;
        }
    }
    public void updateFrame(){
        if (frameCount%speed==0){
            numFrame++;
            if (numFrame==8){
                numFrame=0;
            }
        }
    }
    public void loadImages(){
        img= new PImage[8];
        for(int i=0; i<img.length; i++) {
            img[i] = loadImage("frame"+i+".png");
        }
    }
}
