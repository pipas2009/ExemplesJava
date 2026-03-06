package AATema1.ActivitatsJavaBase;

public class ProbabilitatDau {
    public static void main(String[] args) {
        // Nombre de tirades per a cada experiment
        int[] experiments = {100, 1000, 1000000};

        // Matriu de probabilitats: 3 files (experiments) x 6 columnes (cares del dau)
        float[][] probabilitats = new float[experiments.length][6];

        // Bucle pels experiments
        for (int i = 0; i < experiments.length; i++) {
            int tirades = experiments[i];
            int[] comptador = new int[6]; // compta ocurrències de cada cara

            // Simulació de tirades
            for (int j = 0; j < tirades; j++) {
                int caraAleatoria = (int)(1 + Math.floor(Math.random() * 6));
                comptador[caraAleatoria - 1]++; // restem 1 per indexar de 0 a 5
            }

            // Calcular probabilitats
            for (int k = 0; k < 6; k++) {
                probabilitats[i][k] = (float) comptador[k] / tirades;
            }
        }

        // Imprimir resultats
        System.out.println("Resultats de les probabilitats per cada cara del dau:");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < experiments.length; i++) {
            System.out.println("Experiment amb " + experiments[i] + " tirades:");
            for (int k = 0; k < 6; k++) {
                System.out.printf("Cara %d: %.6f%n", (k + 1), probabilitats[i][k]);
            }
            System.out.println();
        }
    }
}