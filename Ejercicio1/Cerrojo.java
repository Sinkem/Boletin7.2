package Ejercicio1;

import java.lang.IllegalArgumentException;

public class Cerrojo {

    private int primerNum, segundoNum, tercerNum;
    private boolean combinacionCorrecta = false;

    public Cerrojo() {
        primerNum = 5;
        segundoNum = 6;
        tercerNum = 1;
    }

    public void abrir(int numPrimero, int numSegundo, int numTercero) throws CombinacionIncorrectaException {
        if (numPrimero == primerNum && numSegundo == segundoNum && numTercero == tercerNum) {
            System.out.println("Combinacion correcta");
            combinacionCorrecta = true;
        } else {
            throw new CombinacionIncorrectaException("Combinacion incorrecta");
        }
    }

    public void cambiarCombinacion(int nuevoPrimerNum, int nuevoSegundoNum, int nuevoTercerNum)
            throws CambiarCombinacionException {
        if (combinacionCorrecta == true) {
            primerNum = nuevoPrimerNum;
            segundoNum = nuevoSegundoNum;
            tercerNum = nuevoTercerNum;
        } else {
            throw new CambiarCombinacionException("No conoces la combinacion, no puedes cambiarla");
        }
    }

    public class CombinacionIncorrectaException extends Exception {
        public CombinacionIncorrectaException(String msg) {
            super(msg);
        }
    }

    public class CambiarCombinacionException extends Exception {
        public CambiarCombinacionException(String msg) {
            super(msg);
        }
    }

    public int getPrimerNum() {
        return this.primerNum;
    }

    public void setPrimerNum(int primerNum) {
        this.primerNum = primerNum;
    }

    public int getSegundoNum() {
        return this.segundoNum;
    }

    public void setSegundoNum(int segundoNum) {
        this.segundoNum = segundoNum;
    }

    public int getTercerNum() {
        return this.tercerNum;
    }

    public void setTercerNum(int tercerNum) {
        this.tercerNum = tercerNum;
    }

}