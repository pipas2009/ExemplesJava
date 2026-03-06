package Recursar;

import java.util.Scanner;

public class Deletretjar {
    static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("escriu una paraula:");
        String a = input.next();
        deletreja(a);
    }
    public static void deletreja(String a){
        if (a.length()==1){
            System.out.printf("%s",a);
        }else{
            System.out.printf("%c\n", a.charAt(0));
            String s2 = a.substring(1);
            deletreja(s2);
        }
    }
}
