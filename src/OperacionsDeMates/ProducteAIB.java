package OperacionsDeMates;

import java.util.Scanner;

public class ProducteAIB {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre");
        int a = input.nextInt();
        System.out.println("Nombre");
        int b = input.nextInt();
        int x= 0;
        int n=  b;
        while (n>0){
            x +=a;
            n--;
        }
        System.out.println("El prodcte és" +x);
    }
}
