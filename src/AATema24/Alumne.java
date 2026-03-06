package AATema24;

public class Alumne extends Persona{


    enum GRUP{A,B,C,D,E,F,G,H,I,J};
    int curs;
    GRUP grup;

    public Alumne(String nom, int edat, SEXE sexe, GRUP grup,int curs){
        super(nom,edat,sexe);
        this.curs=curs;
        this.grup=grup;
    }

    public int getCurs() {
        return curs;
    }

    public GRUP getGrup() {
        return grup;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setGrup(GRUP grup) {
        this.grup = grup;
    }

    public void print(){
        System.out.printf("L'alumne %s, del curs %d va al grup %s",nom,curs,grup);
    }

    public void PintOverrited(boolean b){
        if(b){
            this.print();
        }else{
            super.print();
        }
    }
}
