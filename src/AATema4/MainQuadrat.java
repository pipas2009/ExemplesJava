package AATema4;

import AATema4.Punt2D;
import processing.core.PApplet;

public class MainQuadrat extends PApplet{

   Quadrat q1,q2;

    public static void main(String[] args) {
        PApplet.main("AATema4.MainQuadrat");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){


        q1 = new Quadrat();
        q1.setAt(0, new Punt2D('A', 200, 200));
        q1.setAt(1, new Punt2D('B', 400, 200));
        q1.setAt(2, new Punt2D('C', 400, 400));
        q1.setAt(3, new Punt2D('D', 200, 400));

        //q2 = new Quadrat(new Punt2D('p', 400, 400), 200);
    }

    public void draw(){
        background(255);
        q1.display(this);
        //q2.display(this);
    }

}
