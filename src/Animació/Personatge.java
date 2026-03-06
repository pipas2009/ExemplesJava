package Animació;

import processing.core.PApplet;
import processing.core.PImage;

public class Personatge {
    //atributs
    PImage[] img;
    int numFrame = 0;
    int speedImg;
    int speedX;
    float x, y;
    int direcció;
    int numImg;
    String nomImg;

    public Personatge(float x, float y, int direcció, int speedImg, int speedX, int numImg, String nomImg) {
        this.x = x;
        this.y = y;
        this.direcció = direcció;
        this.speedImg = speedImg;
        this.speedX=speedX;
        this.numImg=numImg;
        this.nomImg=nomImg;
    }

    public void loadImages(PApplet p5) {
        img = new PImage[numImg];
        for (int i = 0; i < img.length; i++) {
            img[i] = p5.loadImage(nomImg + i + ".png");
        }
    }
    public void display(PApplet p5){
        p5.pushMatrix();
        p5.translate(x,y);
        p5.scale(direcció,1);
        p5.image(img[numFrame],0,0);
        p5.popMatrix();
    }
    public void move(PApplet p5){
        x+=speedX*direcció;
        if((x+img[numFrame].width>=p5.width && direcció==1)||(x<=img[numFrame].width&&direcció==-1)){
            direcció*= -1;
        }
    }
    public void updateFrame(PApplet p5){
        if (p5.frameCount%speedImg==0){
            numFrame++;
            if (numFrame==8){
                numFrame=0;
            }
        }
    }
}