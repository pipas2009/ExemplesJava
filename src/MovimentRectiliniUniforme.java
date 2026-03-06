import java.util.Scanner;

public class MovimentRectiliniUniforme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quina és la velocitat?");
        float x = input.nextFloat();
        System.out.println("Quan temps esta l'objecte en marxa?");
        float a = input.nextFloat();
        float y = x*a;
        System.out.println("La distancia és: "+y);
    }
}
