public class IfElse {
    public static void main (String[] arg) {
        int velocitat = 150;
        if (velocitat <= 40) {
            System.out.println("Velocitat màxima baixa");
        } else if (velocitat <= 90) {
            System.out.println("Velocitat adequada");
        } else {
            System.out.println("Velocitat excessiva");
        }
    }
}
