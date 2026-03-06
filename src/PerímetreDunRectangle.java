import java.util.Scanner;

public class PerímetreDunRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu x:");
        int x = input.nextInt();
        System.out.println("escriu y:");
        int y = input.nextInt();
        int suma = x + x + y + y;
        System.out.println("El perímetre és: ");
        System.out.println(suma);
    }
}