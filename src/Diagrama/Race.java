package Diagrama;

public class Race {

    //Atributs

    private String raceID;
    private Runner[] runner;
    private float[] times;
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    public Race(String raceID, Runner[] runner, float[] times, boolean isFinals, int numRunners, float classificationTime){
        this.raceID=raceID; this.runner= new Runner[8]; this.times=new float[8]; this.isFinals=isFinals; this.numRunners=numRunners;
        this.classificationTime=classificationTime;
    }
    public Race(String raceID, boolean isFinals, float classificationTime) {
        this.raceID = raceID; this.runner = new Runner[8]; this.times = new float[8];
        this.isFinals = isFinals; this.numRunners = 0; this.classificationTime = classificationTime;
    }

    public String getRaceID() {
        return raceID;
    }
    public Runner[] getRunner() {
        return runner;
    }
    public float[] getTimes() {
        return times;
    }
    public boolean isFinals() {
        return isFinals;
    }
    public int getNumRunners() {
        return numRunners;
    }
    public float getClassificationTime() {
        return classificationTime;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }
    public void setRunner(Runner[] runner) {
        this.runner = runner;
    }
    public void setTimes(float[] times) {
        this.times = times;
    }
    public void setFinals(boolean finals) {
        isFinals = finals;
    }
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }
    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }


    public void addRunner(Runner r) {
        if (numRunners < runner.length) {
            runner[numRunners] = r;
            numRunners++;
        }else{
            System.out.println("Màxim nombre of runners");
        }
    }
    public void addTimeToRunner(Runner r, float time) {
        for (int i=0; i<numRunners; i++){
            if(runner[i]==r){
                times[i]=time;
            }
        }
    }
    public float bestTime() {
        float minTime = Float.MAX_VALUE;
        for(int i=0; i<numRunners; i++){
            if(times[i]<minTime){
                minTime = times[i];
            }
        }
        return minTime;

    }
    public String bestRunner() {
        float minTime = Float.MAX_VALUE;
        int index = -1;
        for(int i=0; i<numRunners; i++){
            if(times[i]<minTime){
                minTime = times[i];
                index=i;
            }
        }
        return runner[index].getName();
    }
    public float averageTimes() {
        if (numRunners==0){
            return 0;
        } else {
            float sumTime=0;
            for (int i=0; i<numRunners; i++){
                sumTime+= times[i];
            }
            return sumTime/numRunners;
        }
    }
    public float differenceBestFromWorst() {
        float worstTime=Float.MIN_VALUE;
        for (int i=0; i<getNumRunners(); i++){
            if(worstTime>times[i]){
                worstTime= times[i];
            }
        }
        return worstTime-bestTime();
    }
}
