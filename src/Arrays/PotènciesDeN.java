package Arrays;

public class PotènciesDeN {
    static void main(String[] args) {
        int[] a = {1, 5, 9, 3, 22, 55, 78, 4, 0};
        int[] b = {3, 6, 8, 9, 2, 5, 7, 45, 67};
        arrayPotències(2, 5);
        InvertArray(a);
        sumaUn(b);
        invertArray2(b);
        zipArray(a, b);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) ;
        System.out.printf("%d, %d\n");
    }

    public static int[] arrayPotències(int base, int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(base, 1);
        }
        return array;
    }

    public static void InvertArray(int[] original) {
        int[] array = new int[original.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = original[original.length - i - 1];
            System.out.printf("%d. %d", i, array[i]);
        }
    }

    public static void sumaUn(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
    }

    public static void invertArray2(int[] llista) {
        for (int i = 0; i < llista.length / 2; i++) {
            int temp = llista[i];
            llista[i] = llista[llista.length - 1 - i];
            llista[llista.length - 1 - i] = temp;
            System.out.printf("%d. %d", i, llista[i]);
        }
    }

    public static int[] zipArray(int[] a, int[] b) {
        int[] array = new int[a.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = a[i / 2];
            } else {
                array[i] = b[2 * i - 1];
            }
        }
        return array;
    }

}
