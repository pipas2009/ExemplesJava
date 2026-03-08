package ClasseObject;

public class Segells {
    private String nom;
    private int anys;
    private double preu;

    public Segells(String nom,double preu, int anys){
        this.nom=nom; this.preu=preu; this.anys=anys;
    }

    public void setPreu(double preu) {this.preu = preu;}
    public void setNom(String nom) {this.nom = nom;}
    public void setAnys(int anys) {this.anys = anys;}

    public String getNom() {return nom;}
    public int getAnys() {return anys;}
    public double getPreu() {return preu;}
}
