import java.util.Scanner;

public class SumaDosNombresQualsevols {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu x:");
        int x = input.nextInt();
        System.out.println("escriu y:");
        int y = input.nextInt();
        int suma = x + y;
        System.out.println("La suma és: ");
        System.out.println(suma);
    }
}