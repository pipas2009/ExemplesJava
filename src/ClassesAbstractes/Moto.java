package ClassesAbstractes;

public class Moto extends Vehicle{

    private int cilindrada;

    public Moto(String matricula, int cilindrada) {
        super(matricula, 2, 0);
        this.cilindrada = cilindrada;
    }

    //Override
    public void rodar() {
        setNumKms(getNumKms() + 5);
    }

    public int getCilindrada() { return cilindrada; }

}
