import java.util.Scanner;

public class DeCelsiusAFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quants graus fa:");
        float x = input.nextFloat();
        float y = 5f/9;
        float f= (y*x) +32;
        System.out.println("Fa " + f +" farenheitrs");

    }
}