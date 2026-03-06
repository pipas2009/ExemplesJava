package Arrays;

public class ImprimirElsValorsParellsDUnArray {
    static void main(String[] args) {
        int[] num = {1, 5, 9, 3, 22, 55, 78, 4, 0};
        ImprimirParells(num);
        int i=CuantsParells(num);
        System.out.printf("Hi ha %d nombres pars", i );
    }
    public static void ImprimirParells (int[]array){
        for(int i=0; i<array.length; i++){
            if (array[i]%2==0){
                System.out.printf("%d%n", array[i]);
            }
        }
    }
    public static int CuantsParells (int[]array){
        int count= 0;
        for(int i=0; i<array.length; i++){
            if (array[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
