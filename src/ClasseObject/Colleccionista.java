package ClasseObject;

public class Colleccionista {
    private Segells segells[];
    private int numSegells;
    private String nom;
    private Xapes xapes[];
    private int numXapes;
    private int anys;
    private String Element[];

    public Colleccionista(String nom, int anys){
        this.nom=nom; this.anys=anys;
        this.segells=new Segells[50]; this.xapes=new Xapes[50]; this.Element= new String[5];
    }

    public void addSegell(Segells segells){
        this.segells[this.numSegells]=segells;
        this.numSegells ++;
    }

    public int getNumXapes(int numXapes){return numXapes;}
    public int getNumSegells(int numSegells){return numXapes;}

    public Segells SegellMésActual(){
        int min= Integer.MAX_VALUE;
        for (int i=0; i<segells.length; i++){
            if(anys<segells[i].getAnys()){
            min=i;
            }
        }
        return segells[min];
    }

    public Xapes xapaMesAntiga(){
        if(numXapes == 0) return null;

        Xapes antiga = xapes[0];
        for(int i = 1; i < numXapes; i++){
            if(xapes[i].getAnys() < antiga.getAnys()){
                antiga = xapes[i];
            }
        }
        return antiga;
    }

    public Segells getSegellAt(int pos){return segells[pos];}

    public Xapes getXapaAt(int pos){return xapes[pos];}

    public void setNom(String nom){ this.nom = nom; }
    public String getNom(){ return nom; }

    public void setAnys(int anys){ this.anys = anys; }
    public int getAnys(){ return anys; }



}

