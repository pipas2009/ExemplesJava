package Funcions;

import java.util.Scanner;

public class DeCaF {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Farenheits:");
        float a= input.nextFloat();
        float resultat=FaC(a);
        System.out.printf("La temperatura de %f ºC equival a %f F.", a, FaC(a));

    }
    public static float FaC(float a){
        float resul= (a-32)*(9/5);
        return resul;
    }
}
