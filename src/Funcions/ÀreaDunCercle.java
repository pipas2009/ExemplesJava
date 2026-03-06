package Funcions;

import java.util.Scanner;

public class ÀreaDunCercle {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Diàmetre");
        int d = input.nextInt();
        float resultat=Area (d);
        System.out.printf( "Làrea és: %f", resultat);
    }
    public static Float Area (int d){
       float r= d/2f;
       float x= (float) ((2*Math.PI) *r*r);
       return x;
    }
}
