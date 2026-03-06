package Arrays;

public class ImrimirParellsNumeros {
    static void main(String[] args) {
        int[] num = {1, 5, 9, 3, 22, 55, 78, 4, 0};
        System.out.printf("Hi ha %f numeros parells",Imprimir(num));

    }
    public static int Imprimir(int[]array){
        int num=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                num++;
            }
        }
        return num;
    }
}
