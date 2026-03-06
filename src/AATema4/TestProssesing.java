package AATema4;

import processing.core.PApplet;

public class TestProssesing extends PApplet {

    Punt2D p1, p2, p3;
    Linia2D l1, l2, l3;


    public static void main(String[] args) {
        PApplet.main("AATema4.TestProssesing");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        size(800,800);
        p1= new Punt2D('A');
        p2=new Punt2D('B',200,100);
        p3=new Punt2D('C',100,400);
        p1.setXY(width/2, height/2);

        l1 =new Linia2D(p1,p2);
        l2 =new Linia2D(p2,p3);
        l3 =new Linia2D(p1,p3);

    }
    public void draw(){
        background(255);
        stroke(255,0,0);
        l1.display(this);
        l2.display(this);
        l3.display(this);

    }


}
