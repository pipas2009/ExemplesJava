package AATema4;

import processing.core.PApplet;
import static com.ibm.icu.text.PluralRules.Operand.j;

public class PoligonIrregular {

    Punt2D[] punts;

    public PoligonIrregular(Punt2D[] punts){
        this.punts=punts;
    }

    public PoligonIrregular(int n){
        this.punts= new Punt2D[n];
    }
    public Punt2D getA(){return this.punts[0];}
    public Punt2D getB(){return this.punts[1];}
    public Punt2D getC(){return this.punts[2];}
    public Punt2D getAt(int n){return this.punts[n];}

    public void setA(Punt2D a){this.punts[0]=a;}
    public void setB(Punt2D b){this.punts[1]=b;}
    public void setC(Punt2D c){this.punts[1]=c;}
    public void setAt(int n,Punt2D p){this.punts[n]=p;}

    public void print(){
        System.out.println("Triangle format per:");
        for(int i=0; i<punts.length; i++){
            this.punts[i].print();
        }
    }

    public void display(PApplet p5){
        p5.stroke(255,0,0);p5.strokeWeight(3);
        // Dibuixar
        for (int i=0; i<punts.length; i++){
            this.punts[i].display(p5);
            int j=(i+1)% punts.length;
            p5.line(this.punts[i].x, this.punts[i].y,
                    this.punts[j].x,this.punts[j].y);
        }
    }
}
