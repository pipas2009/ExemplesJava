package OperacionsDeMates;

import java.util.Scanner;

public class PreuFinalDunaEntradaDeCinema {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre de tikets");
        int x = input.nextInt();
        if (x>5 && x<5) {
            float t= x *0.85f;
            System.out.println(t);
        } else if (x>10  && x<10) {
            float t= x* 0.75f;
            System.out.println(t);
        } else {
            float t= x* 0.65f;
            System.out.println(t);
        }
    }
}
