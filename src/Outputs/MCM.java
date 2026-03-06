package Outputs;

import java.util.Scanner;

public class MCM {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nombre");
       int a = input.nextInt();
        System.out.println("nombre");
        int b = input.nextInt();
        int n = 0;
        if (a<b){
            n = a;
        }else{
            n=b;
        }

        while ((a% n!=0)||(b% n!=0)){
            n++;
        }
        System.out.println(n);
    }
}
