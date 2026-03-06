package Recursar;

import java.util.Scanner;

import static java.lang.Math.min;

public class MinComúDivRec {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("escriu a:");
        int a = input.nextInt();
        System.out.println("escriu b:");
        int b = input.nextInt();

        System.out.printf("El mcm de %d i %d és %d",a,b,mcd(a,b) );
    }
    public static int mcd(int a, int b){
        int minAB= min(a,b);
        int maxAB= Math.max(a,b);
        if(maxAB%minAB==0){
            return minAB;
        }else{
            return mcd(minAB, maxAB%minAB);
        }
    }
}
