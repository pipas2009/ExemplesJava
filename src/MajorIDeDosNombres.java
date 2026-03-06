import java.util.Scanner;

public class MajorIDeDosNombres {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Donem un nombre");
        int a = input.nextInt();
        System.out.println("Donem un nombre");
        int b = input.nextInt();
        if (a<b) {
            System.out.println("Major"+b);
        } else {
            System.out.println("Major"+a);
        }
    }
}
