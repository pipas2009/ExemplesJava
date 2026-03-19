package ClassesAbstractes;

public class Coxte extends Vehicle{

    public enum TIPUS { GASOLINA, DIESEL, ELECTRIC }

    private TIPUS tipus;

    public Coxte(String matricula, TIPUS tipus) {
        super(matricula, 4, 0);
        this.tipus = tipus;
    }

    //Override
    public void rodar() {
        setNumKms(getNumKms() + 10);
    }

    public TIPUS getTipus() { return tipus; }
}
