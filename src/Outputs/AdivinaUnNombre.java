package Outputs;

public class AdivinaUnNombre {
    static void main(String[] args) {
        int n= 1+ (int)(100*Math.random());
        System.out.printf("Número imaginat: %d.%n",n);

        int bot=1;
        int top=100;
        int middle= (top*bot)/2;
        while (middle!=n){
            if(middle<n){
                bot=middle;
            }else if (middle>n){
                top=middle;
                middle= (top+bot)/2;
            }
        }
        System.out.printf("Número trobat: %d.",middle);
    }
}
