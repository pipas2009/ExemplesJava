package Funcions;

public class RetornDUnaFuncio2 {
    static void main(String[] args) {
        afegirIVA(15);
    }
    public static float afegirIVA(float preu){
        float pvp= preu*1.21f;
        return pvp;
    }
}
