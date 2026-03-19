package ClassesAbstractes;

public class Cotxe {

    String matricula;
    int numPortes;

    Cotxe(String matricula, int numPortes){
        this.matricula=matricula;
        this.numPortes=numPortes;
    }

    public String toString(){
        return"Cotxe:"+matricula+"("+numPortes+").";
    }
}
