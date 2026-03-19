package ClassesAbstractes;

public class MainExemple {
    public static void main(String[]args){
        //No podem crar intàncies de classes abstractes
        //ExempleDeCA c= new ExempleDeCA(18);
        //c.print();

        //Sí que podem crear objectes de subclasses de la classe abstracte
        SubClasse sb= new SubClasse(10,20);
        sb.print();
    }
}
