package Diagrama;

public class MainRunner {

    public static Team[] allTeams;
    public static Race[] allRaces;
    public static Runner[] allRunners;

    public static void main(String[] args) {
        allTeams= new Team [ 5 ];
        allRaces = new Race [ 10 ];
        allRunners = new Runner [ 100 ];

        // 6.1 Inicialitzar arrays
        allTeams = new Team[2];
        allRaces = new Race[10];
        allRunners = new Runner[100];

        // 6.2 Crear 5 runners
        allRunners[0] = new Runner("Paco");
        allRunners[1] = new Runner("Bel", "Equip B", true);
        allRunners[2] = new Runner("Joan");
        allRunners[3] = new Runner("Maria", "Equip A", false);
        allRunners[4] = new Runner("Laura", "Equip C", true);

        // 6.3 Assignar team i professional
        allRunners[0].setTeam("Equip A");
        allRunners[0].setProfessional(true);
        allRunners[2].setTeam("Equip A");
        allRunners[2].setProfessional(false);
        allRunners[3].setTeam("Equip B");
        allRunners[3].setProfessional(true);
        allRunners[4].setTeam("Equip A");
        allRunners[4].setProfessional(true);

        // 6.4 Afegir carreres i temps
        allRunners[0].addRace("Palma");
        allRunners[0].addTime(12.5f);
        allRunners[0].addRace("Inca");
        allRunners[0].addTime(11.8f);
        allRunners[1].addRace("Palma");
        allRunners[1].addTime(13.2f);
        allRunners[2].addRace("Inca");
        allRunners[2].addTime(14.0f);

        // 6.5 Comprovar bestRace i bestTime
        Runner r1 = allRunners[0];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n"
                , r1.getName(), r1.bestRace(), r1.bestTime());

        // 6.6 Crear equips
        allTeams[0] = new Team("Equip A", true);
        allTeams[1] = new Team("Equip B", false);

        // 6.7 Afegir runners als equips
        allTeams[0].addRunner(allRunners[0]);
        allTeams[0].addRunner(allRunners[2]);
        allTeams[0].addRunner(allRunners[4]);
        allTeams[1].addRunner(allRunners[1]);
        allTeams[1].addRunner(allRunners[3]);

        // 6.8 Comprovar averageTimes
        Team t1 = allTeams[0];
        System.out.printf("Temps mig de l'equip %s és %.2f.\n", t1.getName(), t1.averageTimes());

        // 6.9 Comprovar getNumProfessionals
        System.out.printf("L'equip %s té %d corredor/s professionals.\n", t1.getName(), t1.getNumProfessionals());

        // 6.10 Crear carreres
        allRaces[0] = new Race("Carrera 1", false, 13);
        allRaces[1] = new Race("Carrera 2", true, 12.8f);
        allRaces[2] = new Race("Carrera 3", false, 14.5f);

        // 6.11 Afegir runners i temps a les carreres
        allRaces[0].addRunner(allRunners[0]);
        allRaces[0].addTimeToRunner(allRunners[0], 12.5f);
        allRaces[0].addRunner(allRunners[1]); allRaces[0].addTimeToRunner(allRunners[1], 13.2f);
        allRaces[1].addRunner(allRunners[0]); allRaces[1].addTimeToRunner(allRunners[0], 11.8f);
        allRaces[1].addRunner(allRunners[3]); allRaces[1].addTimeToRunner(allRunners[3], 12.9f);

        // 6.12 Comprovar bestRunner i bestTime
        Race c1 = allRaces[0];
        System.out.printf("Millor corredor/a de la carrera %s és %s amb temps %.2f.\n"
                , c1.getRaceID(), c1.bestRunner(), c1.bestTime());

        // 6.13 Comprovar bestProfessionalRunnerOfTeam
        System.out.printf("%s és el millor corredor/a de l'equip %s.\n"
                , bestProfessionalRunnerOfTeam(t1), t1.getName());

        // 6.14 Comprovar printClassifiedRunners
        printClassifiedRunners(allRaces[0], allTeams[0].getName());

        // 6.15 Comprovar bestTeam
        System.out.printf("%s és el millor equip.\n", bestTeam(allTeams));

    }

    public static String bestTeam(Team[] teams) {
        float minTime= Float.MAX_VALUE;
        int index=-1;
        for (int i=0; i< teams.length; i++){
            if(teams[i]!= null) {
                float time = teams[i].averageTimes();
                if (time < minTime) {
                    minTime = time;
                    index = i;
                }
            }
        }
        return teams[index].getName();
    }

    public static String bestProfessionalRunnerOfTeam (Team t){
        float minTime = Float.MAX_VALUE;
        String name = "";
        for(int i=0; i<t.getNumRunners();  i++){
            Runner r = t.getRunners()[i];
            if(r.isProfessional()){
                float time = r.bestTime();
                if(time < minTime){
                    minTime = time;
                    name = r.getName();
                }
            }
        }
        return name;
    }

    public static void printClassifiedRunners(Race r, String nameTeam) {
        System.out.printf("Corredors classificats a la carrera %s: \n", r.getRaceID());
        for (int i=0; i< r.getNumRunners(); i++){
            float time= r.getTimes()[i];
            Runner runner = r.getRunner()[i];
            if (time<=r.getClassificationTime() && runner.getTeam().equals(nameTeam)){
                System.out.printf("\t%s amb temps %.2f\n", runner.getName(), time);
            }
        }

    }

    public static boolean hasImproved(Runner r, Race[] races) {
        float tempsAnterior = Float.MAX_VALUE;
        for(int i=0; i<races.length; i++){
            for(int nr=0; nr<races[i].getNumRunners(); nr++){
                if(races[i].getRunner()[nr].equals(r)){
                    float temps = races[i].getTimes()[nr];
                    if(temps > tempsAnterior){
                        return false;
                    }
                    else {
                        tempsAnterior = temps;
                    }
                }
            }
        }
        return true;
    }

    public static boolean everClassified(Runner r, Race[] races) {
        for(int i=0; i<races.length; i++){
            Race race = races[i];
            for(int nr=0; nr<race.getNumRunners(); nr++){
                Runner rr = race.getRunner()[nr];
                float times = race.getTimes()[nr];
                if(r.equals(rr) &&
                        times > race.getClassificationTime()){
                    return false;
                }
            }
        }
        return true;

    }

    public static float avgNumRunners(Race[] races) {
        float sum=0;
        for (int i=0; i<races.length; i++){
            sum += races[i].getNumRunners();
        }
        return sum/races.length;
    }

    public static float avgTimesRaces(Race[] races) {
        float sum=0;
        for (int i=0; i<races.length; i++){
            sum += races[i].averageTimes();
        }
        return sum/races.length;
    }

    public static String[] racesWhereWinnerIsNotProfessional(Race[] races){
        String[] racesIDs = new String[races.length];
        int numWinners = 0;

        for(int i=0; i<races.length; i++){
            String winnerName = races[i].bestRunner();
            for(int j=0; j<races[i].getNumRunners(); j++){
                Runner r = races[i].getRunner()[j];
                if(r.getName().equals(winnerName)){
                    if(!r.isProfessional()){
                        racesIDs[numWinners] = races[i].getRaceID();
                        numWinners++;
                    }
                    break;
                }
            }
        }
        return racesIDs;

    }

    }
