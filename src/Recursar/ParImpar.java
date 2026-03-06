package Recursar;

import java.util.Scanner;

public class ParImpar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu n:");
        int n = input.nextInt();
    }
    public static boolean par(int n){
        if(n==0){
            return true;
        }else {
            return impar(n-1);
        }
    }
    public static boolean impar(int n){
        if(n==0){
            return true;
        }else{
            return par(n-1);
        }
    }
}
