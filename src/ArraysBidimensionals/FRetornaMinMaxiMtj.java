package ArraysBidimensionals;

import java.util.Scanner;

public class FRetornaMinMaxiMtj {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("escriu x:");
        int x = input.nextInt();
    }
    public static float[] calculaEstadístiques(float[][] dades){
        float[] m= new float[2];
        float sumValue =0;
        float Min= dades[0][0];
        float Max= dades[0][0];
        for (int i=0; i<dades.length; i++){
            for (int j=0; j<dades[0].length; j++){
                sumValue= sumValue+dades[i][j];
                if (Min>dades[i][j]){
                    Min= dades[i][j];
                }else if(Max<dades[i][j]){
                    Max= dades[i][j];
                }
            }
        }
        float Mitj= sumValue/(dades.length* dades[0].length);
        m[0]= Min;
        m[1]= Max;
        m[2]= Mitj;
        return  m;

    }
}
