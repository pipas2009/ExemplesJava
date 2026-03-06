import java.util.Scanner;

public class MitjanaArigmètricaDeTresNombres {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("escriu un numero:");
        int x = input.nextInt();
        System.out.println("escriu un altre numero:");
        int y = input.nextInt();
        System.out.println("escriu un altre numero:");
        int z = input.nextInt();
        int suma = x + y + z;
        float resultat= suma/3f;
        System.out.println("La mitjana és: ");
        System.out.println(resultat);
    }
}