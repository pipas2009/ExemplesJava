package Arrays;

public class SumaCaselles {
    static void main(String[] args) {
        int[] num = {1, 5, 9, 3, 22, 55, 78, 4, 0};
        System.out.printf("La suma és: %d", sumaArray(num));
        System.out.printf("La mitjana és: %d", mitjanaArray(num));

    }
    public static int sumaArray(int[] array) {
        int suma= 0;
        for (int i = 0; i < array.length; i++) {
            suma= array[i]+ suma;
        }
        return suma;
    }
    public static float mitjanaArray(int[] array) {
        return  sumaArray(array) /(float)array.length;
    }
}
