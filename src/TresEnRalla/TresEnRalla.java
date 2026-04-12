package TresEnRalla;

import processing.core.PApplet;

public class TresEnRalla extends PApplet {
    Tauler t;
    public static void main(String[] args) {
        PApplet.main("TresEnRalla.TresEnRalla");
    }

    public void settings(){size(800,800);}

    public void setup(){
        t = new Tauler(3, width);
    }

    public void draw() {
        background(200, 100, 100);
        t.display(this);
        if (t.enJoc()) {

            if (t.numTirades % 2 == 1) {
                t.cridadaMinimax(0, Tauler.PLAYER.ORDINADOR);
                t.mou(t.getMillorMoviment(), Tauler.PLAYER.ORDINADOR);
                t.numTirades++;
            } else {
                if (t.hihaGuanyador) {
                    textAlign(CENTER);
                    textSize(24);
                    fill(0);
                    text("GUANYADOR " + t.guanyador, width / 2, height / 2 - 20);
                }
                if (t.finalPartida) {
                    textAlign(CENTER);
                    textSize(24);
                    fill(0);
                    text("FINAL PARTIDA", width / 2, height / 2 + 20);
                }
            }
        }
    }
    public void mousePressed(){
        if(t.enJoc() && t.numTirades%2==0) {
            t.casellaPitjada(this);
            t.actualitzaGuanyador();
        }

    }
    public void keyPressed(){
        if(key=='r' || key=='R'){
            t = new Tauler(3, width);
        }
    }
}
