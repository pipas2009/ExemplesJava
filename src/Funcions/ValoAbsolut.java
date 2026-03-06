package Funcions;

import java.util.Scanner;

public class ValoAbsolut {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu nombre:");
        int n = input.nextInt();
        int resultat= valor(n);

        System.out.printf("El valor absolut de %d és %d",n,(n));
    }
    public static int valor(int n) {
        int sol;
        if (n >= 0) {
            sol=n;
        }else{
            sol=n-1;
        }
        return n;
    }
}
