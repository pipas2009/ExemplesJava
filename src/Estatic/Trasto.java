package Estatic;

import java.awt.font.TransformAttribute;

public class Trasto {

    String nom; //propietat- atribut de la classe(no estatic)

    static String nomEstatic; //propietat- atribut de la classe(estatic)
    static int numTrastos=0;


    public Trasto(String n){
        this.nom=n;
        Trasto.nomEstatic=n;
        Trasto.numTrastos ++;
    }

    //Mètode de classe no estatic
    public void print(){System.out.println(this.nom);}

    public static void printEstatic(){System.out.println("Trasto estàtic");}
}
