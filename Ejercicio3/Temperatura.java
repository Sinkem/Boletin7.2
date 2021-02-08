package Ejercicio3;

public class Temperatura {

    double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void subirTemperatura(double grados) {
        temperatura = temperatura + grados;
    }

    public void alarma() {
        if (temperatura > 45) {
            System.out.println("BRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        }
    }

    public void bajarTemperatura() {
        temperatura = temperatura - 10;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}