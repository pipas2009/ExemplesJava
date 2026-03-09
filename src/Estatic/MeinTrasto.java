package Estatic;

public class MeinTrasto {
    public static void main(String[] args) {
        Trasto t=new Trasto("Cosa 1");
        //Accés i propietats i mètodes no estàtics amb notació objecte-punt
        String nom= t.nom; //Accés a la propietat (no estatic)
        t.print(); //Accés al mètode (no estatic)

        //Accés a propietats i mètodes estàtics
        String nomE= Trasto.nomEstatic;//Accés a la propietat static
        Trasto.printEstatic();//Accés al mètode static

        Trasto t2= new Trasto("Cosa 2");
        Trasto t3= new Trasto("Cosa 3");

        System.out.println(Trasto.nomEstatic);
        System.out.println(Trasto.numTrastos);
    }

}
