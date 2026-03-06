package Arrays;

public class ExtendArray {
    static void main(String[] args) {
        int[] num={2,5,6,8,6,4,8};
        int e= distanciaArray(num);
        System.out.printf("La distància entre el màxim i el mínim de l'array és %d.\n", e);
    }
public static int distanciaArray(int[] a){
        int max= a[0];
        int min= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        return max-min;
    }
}
