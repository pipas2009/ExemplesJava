package AATema4;

import processing.core.PApplet;

public class MainEstrellaR extends PApplet {

    EstrellaR e1;
    SolR s1;
    Engranatge e2;
    Elize e3;

    public static void main(String[] args) {
        PApplet.main("AATema4.MainEstrellaR");
    }

    public void settings(){size(1500,800);}

    public void setup(){
        e1= new EstrellaR(18, new Punt2D('0',width/5,400), 100, 300);
        s1= new SolR(30, new Punt2D('1',width/2,400), 100, 300);
        e2= new Engranatge(40,new Punt2D('B',1200,400), 100,180);
        e3= new Elize(40,new Punt2D('B',1400,400), 100,300);
    }

    public void draw(){
        background(255);
        e1.display(this);
        s1.display(this);
        e2.display(this);
        e3.display(this);
    }
}
