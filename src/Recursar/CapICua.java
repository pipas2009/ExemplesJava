package Recursar;

import java.util.Scanner;

public class CapICua {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("di una paraula:");
        String s = input.next();
        System.out.printf("%s és cap i cua? %b.\n","ahha",capicua(s) );
    }
    public static boolean capicua(String s){
        if(s.length()==1){
            return true;
        }else if(s.length()==2){
            return s.charAt(0)== s.charAt(1);
        }else{
            return s.charAt(0)==s.charAt(s.length()-1)&&capicua(s.substring(1,s.length()-1));
        }
    }
}
