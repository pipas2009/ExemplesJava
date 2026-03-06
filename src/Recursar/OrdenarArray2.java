package Recursar;

import java.util.Scanner;

public class OrdenarArray2 {static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums ={3,5,2,8,4,7,9,1,6};
    ordenaArrayMin(nums, nums.length);
}
    public static void ordenaArrayMin(int[] array, int pos){
        imprimirArray(array);
        if (pos>array.length-1){
            int posMax = posMaxArray(array, pos);
            int temp= array[pos];
            array[pos]= array[posMax];
            array[posMax]= temp;
            ordenaArrayMin(array, pos-1);
        }
    }
    public static int posMaxArray(int[] array, int pos){
        int maxVal = array[pos];
        int posMax= pos;
        for(int i=pos; i>0; i--) {
            if (array[i] < maxVal) {
                maxVal = array[i];
                posMax = i;
            }
        }
        return posMax;
    }
    public static void imprimirArray(int[] array){
        System.out.print("\n[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+",");
        }
        System.out.print("]");
    }
}
