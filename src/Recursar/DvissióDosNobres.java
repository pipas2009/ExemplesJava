package Recursar;

import java.util.Scanner;

public class DvissióDosNobres {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu a:");
        int a = input.nextInt();
        System.out.println("escriu b:");
        int b = input.nextInt();
        System.out.printf("La divisió de %d i %d és %d",a,b,dividir(a,b));
    }
    public static int dividir(int a, int b){
        if(a<b){
            return 0;
        }else{
            return 1+dividir(a-b,b);
        }
    }
}
