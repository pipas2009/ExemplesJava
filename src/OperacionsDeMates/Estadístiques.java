package OperacionsDeMates;

public class Estadístiques {
    static void main(String[] args) {
        tirarmoneda();
    }
    public static void tirarmoneda(){
        float cara=0;
        float creu=0;
        float[] m= new float[2];
        for( int i=0; i<=1000000; i++){
            int caraMoneda = (int) Math.floor( Math.random() * 2 );
            if(caraMoneda==1) {
                cara++;
            }else{
                creu++;
            }
        }
        float xcara = (cara/1000000)*100;
        float xcreu = (creu/1000000)*100;
        m[0]= xcara;
        m[1]= xcreu;
        System.out.printf("El %% de tirades és:\n cara: %f\n creu: %f\n", m[0], m[1]);
    }
}
