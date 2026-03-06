package Arrays;

import java.util.Scanner;

public class NPrimersFunció {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = input.nextInt();

    int[] numeros = creaArrayPrimers(n);
    printArray(numeros);

}

    public static int[] creaArrayPrimers(int n){
        int[] array = new int[n];

        int primers =  0;
        int num = 2;
        while(primers<n){

            int x = num - 1;
            while(num % x !=0){
                x = x -1;
            }

            if(x == 1){
                array[primers] = num;
                primers++;
            }
            num++;
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }
}
