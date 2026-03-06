package Arrays;

public class TempArray {
    static void main(String[] args) {
        int[] a= {3,6,8,9,2};
        int[] b= CopiaArray(a);
        printArray(intervalArray(3, 7));

        printArray(subArray(a, 3,5));

       System.out.println(sameArrays(a,b));

       sumaArrays(a,b);
       joinArray(a,b);
    }

    public static int[] CopiaArray(int[] original) {
        int[] array = new int[original.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = original[i];
        }
        return array;
    }

    public static int[] intervalArray(int a, int b){
        int[] array= new int[b-a+1];
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }

    public static int[] subArray(int[]original, int a, int b){
        int[] array= new int[b-a+1];
        for(int i=0; i<array.length; i++){
            array[i]= original[a+i];
        }
        return array;
    }

    public static boolean sameArrays(int[] a, int[] b){
        if (a.length !=b.length){
            return false;
        }else{
            for(int i=0; i<a.length; i++){
                if(a[i] !=b[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void sumaArrays(int[] a, int[]b){
        int[] array= new int[a.length];
        for(int i=0; i<a.length; i++){
           int sum =  a[i]+b[i];
            array[i]= sum;
        }
        System.out.println(array);
    }

    public static int[] joinArray(int[] a, int[]b){
        int[] array= new int[a.length];
        for(int i=0; i<a.length; i++){
            array[a.length+i] = a[i];
        }
        for(int i=0; i<b.length; i++){
            array[a.length+i] = b[i];
        }
        return array;
    }
}