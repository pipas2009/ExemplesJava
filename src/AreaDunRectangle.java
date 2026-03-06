import java.util.Scanner;

public class AreaDunRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu que fa la base(m):");
        float x = input.nextFloat();
        System.out.println("escriu que fa l'altura(m):");
        float y = input.nextFloat();
        float a = x * y;
        System.out.println("L'àrea és: ");
        System.out.println(a);
    }
}