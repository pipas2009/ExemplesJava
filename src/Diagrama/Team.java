package Diagrama;

public class Team {

    //Atributs

    private String name;
    private Runner[] runners= new Runner[5];;
    private int numRunners;
    private boolean international;

    //Constructor

    public Team(String name, Runner[] runners, int numRunners, boolean international){
        this.name=name; this.runners= new Runner[5]; this.numRunners=numRunners; this.international=international;
    }
    public Team(String name, boolean international) {
        this.name = name; this.runners = new Runner[5];
        this.numRunners = 0; this.international = international;
    }

    // Getters i setters bàsics
    public String getName() { return name; }
    public boolean isInternational() { return international; }
    public int getNumRunners() { return numRunners; }
    public Runner[] getRunners() { return runners; }

    //Mètodes

    public void setName(String name) {
        this.name = name;
    }
    public void setRunners(Runner[] runners) {
        this.runners = runners;
    }
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }
    public void setInternational(boolean international) {
        this.international = international;
    }
    public void addRunner(Runner r){
        if(numRunners<runners.length) {
            runners[numRunners] = r;
            numRunners++;
        }
        else {
            System.out.println("Màxim de runners en un equip.");
        }
    }
    public float averageTimes(){
        if(numRunners == 0){
            return 0;
        }else {
            float sumTimes=0;
            for (int i = 0; i < numRunners; i++) {
                sumTimes += runners[i].averageTimes();
            }
            return sumTimes / numRunners;
        }
    }
    public int getNumProfessionals(){
        int np = 0;
        for(int i=0; i<numRunners; i++){
            Runner ri = runners[i];
            if(ri.isProfessional()){
                np++;
            }
        }
        return np;
    }
    public boolean areAllProfesionals(){
        if(numRunners==0){
            return false;
        }else if(getNumProfessionals()==numRunners) {
            return true;
        }else {
            return false;
        }
    }

}
