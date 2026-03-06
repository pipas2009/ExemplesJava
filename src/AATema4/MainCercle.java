package AATema4;

import processing.core.PApplet;

public class MainCercle extends PApplet {

    Cercle2D c1,c2,c3;

    public static void main(String[] args) {
        PApplet.main("AATema4.MainCercle");
    }

    public void settings(){size(800,800);}

    public void setup(){
        Punt2D p1= new Punt2D('A',random(width),random(height));
        Punt2D p2= new Punt2D('B',random(width),random(height));
        c1 =new Cercle2D(300, p1);
        c2 =new Cercle2D(200, p2);

        if(c1.tocar(c2)){
            println("se toquen");
        }else{
            print("no se toquen");
        }
    }

    public void draw(){
        background(255);
        c1.display(this);
        c2.display(this);
        if(c3!=null){
            c3.display(this);
        }
    }

    public void MousePressed(){
        Punt2D pMouse= new Punt2D('M', mouseX,mouseY);
        if(c3==null) {
            c3 = new Cercle2D(250, pMouse);
        }else{
            c3.setCentre(pMouse);
            c3.setDiametre(random(100,300));
        }

        boolean toca1o2= c3.tocar(c1)||c3.tocar(c2);
        println("c3 toca c1 oc2"+ toca1o2);
    }
}
