package ArraysBidimensionals;

public class RecórrerArrays2 {
    static void main(String[] args) {
        int[][] nums1 = {
                {4,9,7,1},
                {3,2,5,4},
                {0,1,8,3},
                {7,6,9,1},
        };
        int[][] nums2 = {
                {0,3,6,2},
                {1,1,0,5},
                {2,9,4,7},
                {3,7,4,8},
        };
        printoverDiagonal(nums1);
        sumaMatrius(nums1, nums2);
        productreEscalar(5,nums2);
        boolean b= iguals(nums1, nums2);
        int[][] m= matriuIdentitats(5);
    }
        // El que esta per damunt de la diagonal descendent
    public static void printoverDiagonal(int[][] array){
        for(int i=0; i<array.length; i++) {
            for (int t = 0; t<i; t++) {
                System.out.printf("\t");
            }
            for (int j = i + 1; j < array[0].length; j++) {
                    System.out.printf("%d, \t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatrius(int[][] a, int[][] b){
        int[][] s= new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                s[i][j]= a[i][j] + b[i][j];
            }
        }
        return s;
    }

    public static int[][] productreEscalar(int k, int[][]a){
        int[][] p = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                p[i][j] = k + p[i][j];
            }
        }
        return p;
    }

    public static boolean iguals(int[][] a, int[][] b){
        if(a.length != b.length || a[0].length != b[0].length){
            return false;
        }else{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if(a[i][j] != b[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static int[][] matriuIdentitats(int n){
        int[][] m= new int[n][n];
        for(int i=0, j=0; i<m.length; i++, j++) {
            m[i][j] = (i==j)? 1 : 0;
        }
        return m;
    }


}
