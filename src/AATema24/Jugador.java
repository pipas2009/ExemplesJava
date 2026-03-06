package AATema24;

public class Jugador extends Persona {

    enum Psició{Porter, Mig, Lateral, Delanter, Defensa};
    int gols;
    String NomEquip;

    public Jugador(String nom, int edat, SEXE sexe, String NomEquip, int gols, Psició posició){
        super(nom,edat,sexe);
        this.NomEquip =NomEquip;
        this.gols=gols;


    }

}
