package Funcions;

public class RetornDUnaFunció {
    static void main(String[] args) {
        int z = SumaDosNombres(10, 5);
        int x = SumaDosNombres(15, 30);
    }
    public static int SumaDosNombres(int a, int b){
        int suma = a+b;
        return suma;
    }
}
