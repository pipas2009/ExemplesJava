package ActivitatsRepasTema3;

public class SumadorAlternativo {
    public static void main(String[] args) {
        int a=4;
        int b=3;
        System.out.printf("La suma de %d i %d és %d\n.",a ,b, alternateSum(a, b));

        int x=3;
        int y=4;
        int z=5;

        System.out.printf("La suma de %d, %d i %d és %d\n.",x ,y,z, encodedAlternateSum( x, y, z));
    }
    public static int alternateSum(int a, int b){
        if(a<=0|| b<=0){
            return 0;
        }else{
            return a - b + alternateSum(a - 1, b - 1);
        }
    }

    //Un metodo recursivo debe esta compuesto por un caso base,
    // y una función que llama a la misma función o varias entre sí hasta llegar  al caso base.

    public static int encodedAlternateSum(int x, int y, int z){
        if(z>x+y){
            return alternateSum(x,y);
        }else if(x<z/2){
            return encodedAlternateSum(x+2, y+1, z-1);
        }else{
            return x*y*z;
        }
    }
}
