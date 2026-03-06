package Funcions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu nombre:");
        int n0 = input.nextInt();
        int resultat =factorial (n0);
        System.out.printf("Factor d%.n%"+n0);
    }
    public static int factorial (int n) {
        int f = 1;
        while (n > 1) {
            f = f * n;
            n = n - 1;
        }
        return f;
    }
}
