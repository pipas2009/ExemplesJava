package AATema1.ActivitatsJavaBase;

import java.util.Scanner;

public class TempConversió {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter class");
        int nd= input.nextInt();
        //decimal a binari
        int nb=0;
        int pot=10;

        while (nd!=0){
            int resta= nd%2;
            nd= nd/2;
            nb= nb+(resta*pot);
            pot= pot*10;
        }
        System.out.println("Num Binari"+nb);

        DecimalAhexadecimal();
    }
    public static void DecimalAhexadecimal(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter class");
        int nd= input.nextInt();
        String nb = ""; // resultat en hexadecimal

        while (nd != 0) {
            int r = nd % 16;   // residu en base 16
            nd = nd / 16;      // divideix entre 16

            // convertir residu a lletra si cal
            if (r >= 10) {
                char hexChar = (char) ('A' + (r - 10));
                nb = hexChar + nb; // concatenar al davant
            } else {
                nb = r + nb; // concatenar al davant
            }
        }

        System.out.println("Hexadecimal: " + nb);
    }
}
