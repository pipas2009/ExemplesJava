package OperacionsDeMates;

import java.util.Scanner;

public class ArrelQuadràtica {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre");
        int x = input.nextInt();
        double a= Math.sqrt(x);
        System.out.println(x);
    }
}
