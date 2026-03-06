package AATema4;

public class Profesor {
    String nom;
    int edat;
    String departament;

    Profesor(String n, int edat, String dep) {
        this.nom = n;
        this.edat = edat;
        this.departament = dep;
    }

    public String getNom() {
        return this.nom;
    }

    public int getedat() {
        return this.edat;
    }

    public String getDep() {
        return this.departament;
    }

}
