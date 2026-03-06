package AATema4;


import processing.core.PApplet;
public class Triangle {

    Punt2D p1, p2, p3;
    Triangle(Punt2D p1, Punt2D p2, Punt2D p3){
        this.p1 = p1; this.p2 = p2; this.p3 = p3;
    }

    public void display(PApplet p5){
        p5.stroke(255,0,0);
        p5.strokeWeight(3);
        // Dibuixar punts
        p1.display(p5);
        p2.display(p5);
        p3.display(p5);
        // Dibuixar triangle
        p5.line(p1.x, p1.y, p2.x, p2.y);
        p5.line(p2.x, p2.y, p3.x, p3.y);
        p5.line(p3.x, p3.y, p1.x, p1.y); }
}