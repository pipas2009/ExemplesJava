package AATema24;

public class ArraySuperclasse {

    public static void main(String[] args) {
        Persona[] persones= new Persona[3];
        persones[0]= new Alumne("Pep",4);
        persones[1]= new Professor("Jaume","Mates");
        persones[2]= new Alumne("Bel", 3);

        //Imprimeix amb el mètode print de cada classe
        for (int i=0; i< persones.length; i++){
            persones[i].print();
        }

        //Imprimeix nmés els objectes d'una classe
        for (int i=0; i< persones.length; i++){
            if(persones[i] instanceof Alumne) {
                persones[i].print();
            }
        }

        //Comptabiitzar els objectes de cada classe
        int p=0;
        int a=0;
        for (int i=0; i< persones.length; i++){
            if(persones[i] instanceof Alumne) {
                a++;
            }else if(persones[i] instanceof Professor){
                p++;
            }
        }
        System.out.printf("Hi ha %d alumnes i %d professors.\n",a,p);
    }

    static class Persona {
        String nom;
        Persona(String nom){ this.nom = nom; }
        void print(){System.out.print("Persona: "+ this.nom);}
    }
    static class Alumne extends Persona {
        int curs;
        Alumne(String nom, int curs){ super(nom); this.curs = curs; }
        void print(){System.out.print("Alumne: "+ this.curs);}
    }
    static class Professor extends Persona {
        String departament;
        Professor(String nom, String dep){ super(nom); this.departament = dep; }
        void print(){System.out.print("Alumne: "+ this.departament);}
    }
}
