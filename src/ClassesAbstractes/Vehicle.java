package ClassesAbstractes;

public class Vehicle {
    private float numKms;
    private String matricula;
    private int numRodes;

    public Vehicle(String matricula) {
        this.matricula = matricula;
        this.numRodes = 0;
        this.numKms = 0;
    }

    public Vehicle(String matricula, int numRodes, float numKms) {
        this.matricula = matricula;
        this.numRodes = numRodes;
        this.numKms = numKms;
    }

    public boolean mesKmsQue(Vehicle altre) {
        return this.numKms > altre.numKms;
    }

    public void rodar() {
        // Per defecte no fa res
    }

    // Getters i setters
    public float getNumKms() { return numKms; }
    public void setNumKms(float numKms) { this.numKms = numKms; }
    public String getMatricula() { return matricula; }
    public int getNumRodes() { return numRodes; }
}
