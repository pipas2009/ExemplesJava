package Recursar;

import java.util.Scanner;

public class MultipilicacióSencera {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu a:");
        int a = input.nextInt();
        System.out.println("escriu b:");
        int b = input.nextInt();

        System.out.printf("La multiplicació de %d i %d és %d",a,b,multiplicar(a,b));
    }
    public static int multiplicar(int a, int b){
        if(b==0){
            return 0;
        }else{
            return multiplicar(a,b-1)+a;
        }
    }
}
