package Funcions;

import java.util.Scanner;

public class MCD {
    static void main(String[] args) {
        MCD (16,38);
    }
    public static void MCD(int a, int b){
        Scanner input = new Scanner(System.in);
        int n = 0;
        if (a<b){
            n = a;
        }else{
            n=b;
        }

        while ((a% n!=0)||(b% n!=0)){
            n--;
        }
        System.out.println(n);
    }
}
