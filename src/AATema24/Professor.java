package AATema24;

public class Professor extends Persona{

    enum DEPARTAMENT{FISICA,CATALA,ANGLES};

    //Atributs
    int anysDocent;
    DEPARTAMENT dep;

    //Constructor
    public Professor(String nom, int edat, SEXE sexe, int anysDocent, DEPARTAMENT dep){
        super(nom,edat,sexe);
        this.anysDocent=anysDocent;
        this.dep=dep;
    }

    public int getAnysDocent() {
        return anysDocent;
    }

    public DEPARTAMENT getDep() {
        return dep;
    }

    public void setAnysDocent(int anysDocent) {
        this.anysDocent = anysDocent;
    }

    public void setDep(DEPARTAMENT dep) {
        this.dep = dep;
    }

    //Altres
    public void print(){

        String titol = (sexe==SEXE.DONA)? "Professora":"Professor";
        System.out.printf("%s %s de%s té %d anys de docència.\n",titol,nom,dep,anysDocent);
    }
}
