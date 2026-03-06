package AATema24;

public class Persona {

    //Tipus enumerat(def)
    enum SEXE{HOME,DONA,ALTRE};

    //Atributs
    String nom;
    int edat;
    SEXE sexe;

    //Constructor
    public Persona(String nom, int edat, SEXE sexe){
        this.nom=nom;
        this.edat=edat;
        this.sexe=sexe;
    }
    public Persona(String nom) {
        this.nom = nom;
    }

    //Setters i getters

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(SEXE sexe) {
        this.sexe = sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public SEXE getSexe() {
        return sexe;
    }

    //Altres
    public void print(){
        System.out.printf("%s té %d anys i és %s.\n",nom,edat,sexe);
    }
}
