package Diagrama;

public class Runner {

    //Atributs

    private String name;
    private String team;
    private String [] raceIDs;
    private float [] time;
    private int numRaces;
    private boolean professional;

    public Runner(String name,String team, String raceIDs, float time, int numRaces, boolean professionals){
        this.name=name; this.team=team; this.raceIDs= new String[5]; this.time= new float[5]; this.numRaces=0; this.professional=false;
    }
    public Runner(String name) {
        this.name = name; this.team = ""; this.raceIDs = new String[5];
        this.time = new float[5]; this.numRaces = 0; this.professional = false;
    }
    public Runner(String name, String team, boolean professional) {
        this.name = name; this.team = team; this.raceIDs = new String[5];
        this.time = new float[5]; this.numRaces = 0; this.professional = professional;
    }

    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public String[] getRaceIDs() {
        return raceIDs;
    }
    public float[] getTime() {
        return time;
    }
    public int getNumRaces() {
        return numRaces;
    }
    public boolean isProfessional() {
        return professional;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public void setRaceIDs(String[] raceIDs) {
        this.raceIDs = raceIDs;
    }
    public void setTime(float[] time) {
        this.time = time;
    }
    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }
    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    public void addRace(String m){
        if (numRaces< raceIDs.length){
            this.raceIDs[numRaces]=m;
            numRaces++;
        }else{
            System.out.println("Màxim esgotat de carreres");
        }
    }

    public void addTime(float time){
        if(numRaces<=raceIDs.length){
            this.time[numRaces-1] = time;
        }
        else {
            System.out.println("Màxim de carreres.");
        }

    }

    public float bestTime(){
        float bf=Float.MAX_VALUE;
        for (int i=0; i<numRaces;i++){
            if(time[i]<bf){
                bf=time[i];
            }
        }
        return bf;
    }

    public float averageTimes(){
        if(numRaces==0){
            return 0;
        }
        else {
            float sumTime = 0;
            for (int i = 0; i < numRaces; i++) {
                sumTime += time[i];
            }
            return sumTime / numRaces;
        }
    }

    public String bestRace(){
        float minTime=Float.MAX_VALUE;
        int index= -1;
        for (int i=0;i<numRaces; i++){
            if(time[i]<minTime){
                minTime = time[i];
                index = i;
            }
        }
        return raceIDs[index];

    }
}
