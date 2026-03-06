package ClasseObject;

public class ExempleObject {
    public static void main(String[] args) {
        Persona p1= new Persona("Paco");
        System.out.println(p1.hashCode());

        Persona p2= new Persona("Paco");
        System.out.println(p2.hashCode());

        //Comparació hashCode
        if(p1==p2){System.out.println("Son iguals");
        }else{System.out.println("Son diferents");}

        //Comparació amb equals
        if(p1.equals(p2)){
            System.out.println("Son iguals");
        }else{System.out.println("Son diferents");}

        //Imprimir amb mètode toString
        System.out.println(p1);
        System.out.println(p2);


    }

    static class Persona{
        String nom;
        Persona(String n){this.nom=n;}
        public boolean equals(Object o){
            Persona altre= (Persona) o;
            return nom.equals(altre.nom);
        }

        public String toString(){
            return "Persona: "+ this.nom+".";
        }
    }
}
