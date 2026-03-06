package Funcions;

import java.util.Scanner;

public class TaulamultiplicarN {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Nombre");
        int n = input.nextInt();
        Multiplicar (n);

    }
    public static void Multiplicar (int n){
        for(int i=0; i<=10; i++){
            int r= n*i;
            System.out.println(r);
        }
    }
}
