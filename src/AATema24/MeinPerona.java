package AATema24;

public class MeinPerona {

    static void main(String[] args) {

        Persona p;p = new Persona("Paco", 33, Persona.SEXE.HOME);
        p.print();

        Professor prof = new Professor("Bel",36,Persona.SEXE.DONA,
                10, Professor.DEPARTAMENT.CATALA);
        prof.print();

        Alumne alum= new Alumne("Jan", 14, Persona.SEXE.HOME, Alumne.GRUP.D,3);
        alum.PintOverrited(true);
        alum.PintOverrited(false);
    }
}
