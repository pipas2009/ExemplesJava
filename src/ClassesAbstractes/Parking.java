package ClassesAbstractes;

public class Parking {

    Cotxe[] places;
    int numCotxes=0;

    Parking(int numPlaces){
        this.places=new Cotxe[numPlaces];
    }

    void entrada(Cotxe c){
        if(numCotxes<places.length){
            for(int i=0; i< places.length; i++){
                if(places[i]==null){
                    this.places[numCotxes]=c;
                    this.numCotxes++;
                    break;
                }
            }
        }
    }

    void sortida(Cotxe c){
        for(int i=0; i<places.length;i++){
            if(places[i]==c){
                places[i]=null;
                numCotxes--;
                break;
            }
        }
    }

    int getNumPlacesLLiures(){
        return this.places.length - this.numCotxes;
    }

    void print(){
        for(int i=0;i<places.length;i++){
            if(places[i]==null){
                System.out.printf("Lliure\n");
            }else{
                System.out.printf("Plaça %d: ocupada (%s).\n",i,places[i].matricula);
            }
        }
    }
}
