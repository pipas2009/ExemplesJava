package AATema4;

import processing.core.PApplet;

import static processing.core.PApplet.dist;

public class Cercle2D {


    float diametre;
    Punt2D centre;

    public Cercle2D(float diametre, Punt2D centre){
        this.diametre=diametre;
        this.centre=centre;
    }

    public float getDiametre() {
        return diametre;
    }

    public Punt2D getCentre() {
        return centre;
    }


    public void setDiametre(float diametre) {
        this.diametre = diametre;
    }

    public void setCentre(Punt2D centre) {
        this.centre = centre;
    }

    public void display(PApplet p5){
        p5.strokeWeight(2);p5.stroke(0);
        p5.fill(255,0,0,50);
        p5.circle(centre.x, centre.y, diametre);
        centre.display(p5);
    }

    public boolean tocar(Cercle2D altre){
        float radi= diametre/2;
        float radiAltre= altre.diametre/2;
        float d= dist(centre.x,centre.y,altre.centre.x, altre.centre.y);

        return d<=radi+radiAltre;
    }
}
