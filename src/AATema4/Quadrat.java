package AATema4;

public class Quadrat extends PoligonIrregular{

    Quadrat(){
        super(4);
    }

    Quadrat(Punt2D[] punts){
        super(punts);
    }



    public void print(){
        System.out.println("Quadrat format per:");
        for (int i=0; i< punts.length; i++){
            this.punts[i].print();
        }
    }
}
