package TresEnRalla;

import processing.core.PApplet;

public class Tauler {
    float midaCasella;
    Casella[][] caselles;
    boolean hihaGuanyador;
    char guanyador;
    boolean finalPartida;
    int numTirades;
    Casella[] casellesBuides;
    enum PLAYER {HUMA, ORDINADOR};
    Casella[] valors;
    int numValors = 0;
    Casella[] rootValues;
    int numRootValues;

    public Tauler(int n, float w){
        caselles = new Casella[n][n];
        this.midaCasella = w / n;
        this.hihaGuanyador=false;
        guanyador = ' ';
        finalPartida = false;
        numTirades = 0;
        for(int f = 0; f < caselles.length; f++){
            for(int c = 0; c < caselles[f].length; c++){
                caselles[f][c] = new Casella(f, c, (int)midaCasella*c, (int)midaCasella*f, (int)midaCasella);
            }
        }

    }

    public void display(PApplet p5){
            for(int f=0; f<caselles.length; f++) {
                for (int c = 0; c < caselles[f].length; c++) {
                    caselles[f][c].display(p5);
                }
            }
    }

    public void casellaPitjada(PApplet p5){
        if(!finalPartida) {
            for (int f = 0; f < caselles.length; f++) {
                for (int c = 0; c < caselles[f].length; c++) {
                    if (caselles[f][c].estaDins(p5.mouseX, p5.mouseY)&&caselles[f][c].valor == Casella.VALOR.BLANC) {
                        if (numTirades%2==0) {
                            caselles[f][c].setValor(Casella.VALOR.CERCLE);
                        } else {
                            caselles[f][c].setValor(Casella.VALOR.CREU);
                        }
                        numTirades++;
                        break;

                    }
                }
            }
        }
    }

    public boolean filaIguals(int f){
        if (caselles[f][0].valor == caselles[f][1].valor &&
                caselles[f][1].valor == caselles[f][2].valor &&
                caselles[f][0].valor != Casella.VALOR.BLANC){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean columnaIguals(int c){
        if (caselles[0][c].valor == caselles[1][c].valor &&
                caselles[1][c].valor == caselles[2][c].valor &&
                caselles[0][c].valor != Casella.VALOR.BLANC){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean diagonalDescIguals(){
        if (caselles[0][0].valor == caselles[1][1].valor &&
                caselles[1][1].valor == caselles[2][2].valor &&
                caselles[0][0].valor != Casella.VALOR.BLANC){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean diagonalAscIguals(){
        if (caselles[2][0].valor == caselles[1][1].valor &&
                caselles[1][1].valor == caselles[0][2].valor &&
                caselles[2][0].valor != Casella.VALOR.BLANC){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean comprovaGuanyador(){
        for(int f=0; f<caselles.length;f++){
            if(filaIguals(f)==true){
                return true;
            }
        }
        for(int c=0; c<caselles[0].length;c++){
            if(columnaIguals(c)==true){
                return true;
            }
        }
        return diagonalAscIguals()||diagonalDescIguals();
    }

    public void actualitzaGuanyador(){
        hihaGuanyador = comprovaGuanyador();
        if(hihaGuanyador){
            guanyador = numTirades%2==0 ? 'X' : 'O';
        }
        if(numTirades == 9 || hihaGuanyador){
            finalPartida = true;
        }
    }

    public int numCaselles(){
        return caselles.length*caselles.length;
    }

    boolean estaPle(){
        return numTirades == numCaselles();
    }

    boolean guanyaOrdinador(){
        hihaGuanyador = comprovaGuanyador();
        return  hihaGuanyador && numTirades%2==0;
    }

    boolean guanyaPersona(){
        hihaGuanyador = comprovaGuanyador();
        return  hihaGuanyador && numTirades%2==1;
    }

    boolean enJoc() {
        if (guanyaOrdinador() || guanyaPersona()){
            return false;
        }
        else if (estaPle()){
            return false;
        }
        else {
            return true;
        }
    }

    public Casella[] getCasellesBuides() {

        casellesBuides = new Casella[numCaselles() - numTirades];

        int numBuida = 0;
        for (int f = 0; f < caselles.length; f++) {
            for (int c = 0; c < caselles[f].length; c++) {
                if (caselles[f][c].valor == Casella.VALOR.BLANC){
                    casellesBuides[numBuida] = caselles[f][c];
                    numBuida++;
                }
            }
        }
        return casellesBuides;
    }

    public int retornaMin(int[] llista) {

        int min = Integer.MAX_VALUE;
        int index = Integer.MIN_VALUE;

        for (int i = 0; i < llista.length; ++i) {
            if (llista[i] < min) {
                min = llista[i];
                index = i;
            }
        }
        return llista[index];
    }

    int retornaMax(int[] llista) {
        int max = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < llista.length; ++i) {
            if (llista[i] > max) {
                max = llista[i];
                index = i;
            }
        }

        return llista[index];
    }

    public void mou(Casella c, PLAYER jugador) {
        if(jugador==PLAYER.HUMA) {
            caselles[c.fila][c.columna].valor = Casella.VALOR.CERCLE;
        }
        else if(jugador==PLAYER.ORDINADOR) {
            caselles[c.fila][c.columna].valor = Casella.VALOR.CREU;
        }
    }

    int minimax(int depth, PLAYER player) {

        if (guanyaOrdinador()){ return +1; }
        if (guanyaPersona()){return -1; }

        Casella[] casellesBuides = getCasellesBuides();

        if (casellesBuides.length==0){ return 0; }

        int[] marcadors = new int[casellesBuides.length];
        int numMarcadors = 0;

        for (int i = 0; i < casellesBuides.length; i++) {

            Casella c = casellesBuides[i];

            if(c!=null) {

                if (player == PLAYER.ORDINADOR) {
                    mou(c, PLAYER.ORDINADOR);
                    int currentScore = minimax(depth + 1, PLAYER.HUMA);
                    marcadors[numMarcadors] = currentScore;
                    numMarcadors++;

                    if (depth == 0) {
                        c.setValorMiniMax(currentScore);
                        rootValues[numRootValues] = c;
                        numRootValues++;

                        valors[numValors] = c;
                        numValors++;
                    }
                }else if (player == PLAYER.HUMA) {
                    mou(c, PLAYER.HUMA);
                    marcadors[numMarcadors] = minimax(depth + 1, PLAYER.ORDINADOR);
                    numMarcadors++;
                }

                caselles[c.fila][c.columna].valor = Casella.VALOR.BLANC;
            }
        }

        if( player == PLAYER.ORDINADOR ){
            return retornaMax(marcadors);
        }
        else {
            return retornaMin(marcadors);
        }

    }

    Casella getMillorMoviment() {
        int max = Integer.MIN_VALUE;
        int best = 0;

        for (int i = 0; i < numRootValues; ++i) {
            if (rootValues[i].valorMiniMax > max) {
                max = rootValues[i].valorMiniMax;
                best = i;
            }
        }

        return rootValues[best];
    }

    void cridadaMinimax(int depth, PLAYER player){
        valors = new Casella[numCaselles()];
        numValors = 0;

        rootValues = new Casella[numCaselles()];
        numRootValues = 0;

            minimax(depth, player);
    }




}
