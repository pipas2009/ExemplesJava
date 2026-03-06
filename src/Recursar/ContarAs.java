package Recursar;

import java.util.Scanner;

public class ContarAs {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu s:");
        String s = input.next();
        System.out.println("Número de As: "+ comptarAs(s));
        System.out.println("Número de As (Recursiu): "+ comptarAsRec(s));
    }

public static int comptarAs(String s){
    int n = 0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='A'){
            n++;
        }
    }
    return n;
}

public static int comptarAsRec(String s){
    if(s.length()==1){
        return (s.charAt(0)=='A') ? 1 : 0;
    }
    else {
        String left = s.substring(0, s.length()/2);
        String dreta = s.substring(s.length()/2, s.length());
        return comptarAsRec(left) + comptarAsRec(dreta);
    }
}}
