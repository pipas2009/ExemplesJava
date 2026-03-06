package OperacionsDeMates;

import java.util.Scanner;

public class PotènciesDe2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre de potències");
        int x = input.nextInt();
        int p= 1;
        for ( int i=1; i>=x; i++){
             p*=2;
            System.out.println("Potència "+i+"-èssima de 2 és: "+p);
        }
    }
}
