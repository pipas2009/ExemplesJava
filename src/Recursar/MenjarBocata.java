package Recursar;

public class MenjarBocata {
    static void main(String[] args) {
        String bocata= "bocatademortadela";
        menjar(bocata);
    }
    public static String mossegar(String b){
        int mida= 1+(int)(Math.random()*4);
        return b.substring(0,mida);
    }
    public static boolean esTragable(String b){
        return b.length()<=4;
    }
    public static void tragar(String b){
        System.out.print(b);
        System.out.println(" Ñamm");
    }
    public static void menjar(String b){
        if(esTragable(b)){ tragar(b);
        }else{
            String bossi= mossegar(b);
            menjar(bossi);
             menjar(llevar(b,bossi));
        }
    }
    public static String llevar(String b, String t){
        return b.replaceFirst(t,"");
    }
}
