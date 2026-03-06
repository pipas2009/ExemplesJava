package AATema4;

import processing.core.PApplet;

public class MainTriangle extends PApplet {

    Punt2D p1, p2, p3;
    Triangle t;

    public static void main(String[] args) {
        PApplet.main("AATema4.MainTriangle");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        // Punt central
        p1 = new Punt2D('A', width/2, height/3);

        // 30 píxels a la dreta
        p2 = new Punt2D('B', width/2 + 30, height/2);

        // 30 píxels a l'esquerra
        p3 = new Punt2D('C', width/2 - 30, height/2);

        // Crear triangle
        t = new Triangle(p1, p2, p3);
    }

    public void draw(){
        background(255);
        t.display(this);
    }
}
