package AATema4;

import processing.core.PApplet;

public class MainTriangleOK extends PApplet{

    TrianglOK t1;
    PoligonIrregular p1;

    public static void main(String[] args){
        PApplet.main("AATema4.TriangleOK");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        t1= new TrianglOK(new Punt2D('A', 400,100),
                new Punt2D('B', 500,300),
                new Punt2D('C', 400,100));
        p1= new PoligonIrregular(3);
        p1.setAt(0, new Punt2D('1',200,200));
        p1.setAt(1, new Punt2D('2',200,200));
        p1.setAt(2, new Punt2D('3',200,200));
    }

    public void draw(){
        background(255);
        t1.display(this);

    }
}
