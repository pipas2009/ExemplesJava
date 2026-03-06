package Outputs;

public class BucleLletresINombres {
    static void main(String[] args) {
        //bucle lletres i nombres
        char c = 'A';
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Número: &d.%n", i, c);
            c = (char) (c + 1);
        }

        //nombres i si son parells

        for (int i=1; i<=10; i++){
            System.out.printf("Número: %d i Parell: %b.%n",i, i%2==0);
        }
    }
}