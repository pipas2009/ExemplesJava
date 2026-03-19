package ClassesAbstractes;

public class SubClasse extends ExempleDeCA{
    int y;

    SubClasse(int x, int y){
        super(x);
        this.y=y;
    }

    void print(){
        System.out.println(x+","+y);
    }
}
