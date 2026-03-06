import java.util.Scanner;

public class PorterDeDiscoteca {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quants anys tens?");
        int x = input.nextInt();
        if (x > 18) {
            System.out.println("Passa");
        } else
            System.out.println("No passis");
    }
}
