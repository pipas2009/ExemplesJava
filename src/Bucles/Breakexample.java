package Bucles;

import java.util.Scanner;

public class Breakexample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float suma=0;
        do{
            System.out.println("Numero");
            float n= input.nextFloat();
            if (n==0){break;}
            suma= suma+n;
        }while (suma>100);
    }
}
