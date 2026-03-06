import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaDunCercle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu que fa el radi(m):");
        float x = input.nextFloat();
        double a = x * x * PI;
        System.out.println("L'àrea és: ");
        System.out.println(a);
    }
}