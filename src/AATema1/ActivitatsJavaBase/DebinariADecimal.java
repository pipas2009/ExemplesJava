package AATema1.ActivitatsJavaBase;

import java.util.Scanner;

public class DebinariADecimal {public static void main(String[] args) {
    System.out.print("Enter binari\n");
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();;
    int decimal = convertirBinariADecimal(N);
    System.out.println("El binari " + N + " en decimal és: " + decimal);
}

    public static int convertirBinariADecimal(int N) {
        int decimal = 0;
        int base = 1;

        while (N > 0) {
            int digit = N % 10;
            N = N / 10;
            decimal= decimal+(digit * base);
            base= base *2;
        }

        return decimal;
    }
}
