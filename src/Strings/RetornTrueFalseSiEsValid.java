package Strings;

import java.util.Scanner;

public class RetornTrueFalseSiEsValid {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email:");
        String correu = input.next();

        System.out.printf("%s és vàlid? %b.\n", correu, emailValid(correu));
    }
    public static boolean emailValid(String email){
        int posAt = email.indexOf('@');
        int posAt2 = email.lastIndexOf('@');
        int posDot = email.lastIndexOf('.');
        boolean oneAt= (posAt == posAt2);
        int distAtDot = posDot -posAt;
        int numChars = email.length();
        int numCharsDomini= numChars-posDot-1;
        boolean correu = true;

        if (posAt==-1 ||posAt<3){
            correu= false;
        }else if(posDot==-1 ||distAtDot<3){
            correu= false;
        }else if (!(numCharsDomini == 2 || numCharsDomini == 3)){
            correu= false;
        }
        return correu;
    }
}
