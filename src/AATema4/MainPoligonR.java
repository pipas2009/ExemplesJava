package AATema4;

import processing.core.PApplet;

public class MainPoligonR extends PApplet {

    PoligonR pr1;
    Pentagon pe1;

    public static void main(String[] args) {
        PApplet.main("AATema4.MainPoligonR");
    }

    public void settings(){size(800,800);}

    public void setup(){
        pr1= new PoligonR(30,new Punt2D('0',300,300),200);
        pe1= new Pentagon(new Punt2D('A',600,400), 150);
    }

    public void draw(){
        background(255);
        pr1.display(this);
        pe1.display(this);
    }
}
