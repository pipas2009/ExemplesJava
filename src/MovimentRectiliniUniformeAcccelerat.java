import java.util.Scanner;

public class MovimentRectiliniUniformeAcccelerat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quina és la velocitat?");
        float v = input.nextFloat();
        System.out.println("Quan temps esta l'objecte en marxa?");
        float t = input.nextFloat();
        float a = v/t;
        float x = (v*t)+(0.5f*a*t*t);
        float vf= v*(a*t);
        System.out.println("La distancia és: "+x);
        System.out.println("La velocitat final és: "+vf);
    }
}