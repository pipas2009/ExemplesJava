package Funcions;

import java.util.Scanner;

public class PerímetreDUnRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu que fa la base");
        float a = input.nextFloat();
        System.out.println("escriu que fa d'altura");
        float b = input.nextFloat();
        Elperímetres(a,b);
    }
    public static int Elperímetres (float a, float b){
        float r = (2+a)+(2+b);
        return (int) r;
    }

}
