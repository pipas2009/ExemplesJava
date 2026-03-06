package AATema4;

import processing.core.PApplet;

import static processing.core.PConstants.CENTER;

public class Punt2D {

    char nom;
    float x,y;

    Punt2D(char nom){
        this.nom = nom;
        this.x=0; this.y=0;
    }

    Punt2D(char nom, float x, float y){
        this.nom = nom;
        this.x=x; this.y=y;
    }

    public char getNom(){return this.nom;}
    public float getX(){return this.x;}
    public float getY(){return this.y;}

    public void setNom(char nom){this.nom= nom;}
    public void setX(float x){this.x=x;}
    public void setY(float y){this.y=y;}
    public void setXY(float x, float y){this.x=x; this.y=y;}

    public void print(){
        System.out.printf("Punt %c :(%f, %f) . \n",nom,x,y);
    }

    public void display(PApplet p5){
        p5.fill(0);
        p5.circle(this.x,this.y,20);
        p5.textSize(14);p5.textAlign(CENTER);
        String info = nom + ":("+x+", "+y+")";
        p5.text(info ,this.x, this.y -10);
    }

}
