import java.util.Scanner;

public class ForsaCalculF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quan pesa l'objecte?");
       float x = input.nextFloat();
        float y = x*9.8f;
        System.out.println("La força és: "+y);
    }
}
