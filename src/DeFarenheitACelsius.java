import java.util.Scanner;

public class DeFarenheitACelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quan farenheits fa:");
        float x = input.nextFloat();
        float y = 5f/9;
        float c= y*(x -32);
        System.out.println("Fa " + c +" graus");

    }
}