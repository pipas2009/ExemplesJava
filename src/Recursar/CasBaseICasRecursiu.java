package Recursar;

public class CasBaseICasRecursiu {
    static void main(String[] args) {
        System.out.printf("Factoria de %d és %d.", 5, factorial(5));

        countDown(5);

        System.out.printf("Fibonacci de %d és", 5, fibo(5));
        System.out.printf("La potència de %d és%d.",5, potencia(5,3));
        System.out.printf("La potència de %d és%d.",5, potencia2(5,3));
    }
    public static int factorial (int n){
        //cas base
        if (n==0){
            return 1;
        }
        // cas recurssiu
        else{
            return n*factorial(n-1);
        }
    }
    // count down
    public static void countDown(int n){
        if (n==0){
            System.out.print("Aiii, sa xanclaaaaaa");
        }
        else {
            System.out.print(n+",");
            countDown(n-1);
        }
    }
    // fibonacci
    public static int fibo(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            return fibo(n-1)+ fibo(n-2);
        }
    }
    // potència
    public static int potencia(int n, int e){
        if(e==0){
            return 1;
        }
        else{
            return n*potencia(n, e-1);
        }
    }
    public static int potencia2(int n, int e){
        if(e==0){
            return 1;
        }
        else if(e%2==0){
            return potencia2(n, e/2)*potencia2(n, e/2);
        }else{
            return potencia2(n, (e-1)/2)*potencia2(n, (e-1)/2);
        }
    }
}
