import java.util.Scanner;

public class Switch {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Quina nota tens?");
        int x = input.nextInt();
        switch (x){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("Has suspés.");break;
            case 5: System.out.println("Bé."); break;
            case 6:
            case 7:
            case 8: System.out.println("Notable");break;
            case 9:
            case 10: System.out.println("Exel·lent");
            default: System.out.println("Nota no vàlida");
        }
    }
}
