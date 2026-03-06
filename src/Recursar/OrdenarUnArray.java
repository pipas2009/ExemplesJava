package Recursar;

import java.util.Scanner;

public class OrdenarUnArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums ={3,5,2,8,4,7,9,1,6};
        ordenaArrayMin(nums, 0);
    }
    public static void ordenaArrayMin(int[] array, int pos){
        imprimirArray(array);
        if (pos<array.length-1){
            int posMin = posMinimArray(array, pos);
            int temp= array[pos];
            array[pos]= array[posMin];
            array[posMin]= temp;
            ordenaArrayMin(array, pos+1);
        }
    }
    public static int posMinimArray(int[] array, int pos){
        int minVal = array[pos];
        int posMin= pos;
        for(int i=pos+1; i<array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
                posMin = i;
            }
        }
        return posMin;
    }
    public static void imprimirArray(int[] array){
        System.out.print("\n[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+",");
        }
        System.out.print("]");
    }
}
