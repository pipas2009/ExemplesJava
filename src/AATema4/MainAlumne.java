package AATema4;

public class MainAlumne {
    static void main(String[] args) {
        Alumne a1, a2, a3;

        a3= null;

        //Instanció crsació amb el constructos
        a1= new Alumne("Paco",3,'F');
        a2= new Alumne("Joana",4,'D');

        //Usar mètodes de la classe alumne
        a1.print();
        a1.setNom("Paquito");
        a1.setCurs(3);
        a1.setGrup('E');
        a2.print();

        System.out.println("Alumnes:"+a1.getNom()+", "+a2.getNom());

        //Error NullPointException
        a3.print();
    }
}
