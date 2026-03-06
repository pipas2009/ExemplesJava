 package Funcions;

public class RetornDUnaFuncio3 {
    static void main(String[] args) {
        float preu1= afegirIVA(15,5.75f);
        float preu2= afegirIVA(18, 100f);
    }
    public static float afegirIVA(float preu, float iva){
        float pvp= preu*iva;
        return pvp;
    }
}
