package Strings;

public class FuncióQueGenera100simbolsADN {
    static void main(String[] args) {
        int n = 100;
        String adn = generaADN(n);
        System.out.printf("ADN de %d lletres:\n%s.\n", n, adn);

        String ms = "TA";
        System.out.printf("%s apareix a l'adn? %b.\n", ms, hihaSatellit(adn, ms));
        System.out.printf("%s apareix %d vegades a l'adn.", ms, quantsSatellits(adn, ms));

    }
    public static String generaADN(int n){
        String adn= "";
        for(int i=0; i<n; i++){
            char lletra;
            int nr = (int) Math.random()*100;
            if(nr<=25){lletra='A';
            }else if (nr<50){lletra='C';}
            else if (nr<=70){lletra='G';
            }else lletra='T';
            adn += lletra;
        }
        return adn;
    }
    public static boolean hihaSatellit(String satelit, String adn){

        return adn.indexOf(satelit)!=-1;
    }
    public static int quantsSatellits(String satellit, String adn){
        int rep = 0;
        while (adn.indexOf(satellit)!=-1){
            int pos = adn.indexOf(satellit);
            rep++;
            adn = adn.substring(pos+1);
        }
        return rep;
    }
}
