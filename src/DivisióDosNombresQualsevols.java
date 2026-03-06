import java.util.Scanner;

public class DivisióDosNombresQualsevols {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu x:");
        float x = input.nextFloat();
        System.out.println("escriu y:");
        float y = input.nextFloat();
        float suma = x / y;
        System.out.println("La divisió és: ");
        System.out.println(suma);
    }
}