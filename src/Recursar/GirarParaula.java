package Recursar;

import java.util.Scanner;

public class GirarParaula {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("escriu una paraula:");
        String a = input.next();
        gira(a);
    }
    public static String gira(String a){
        if(a.length()==1){
            return a;
        }else{
            char cFirst=a.charAt(0);
           String a2=a.substring(1,a.length());
           return gira(a2)+cFirst;
        }
    }
}
