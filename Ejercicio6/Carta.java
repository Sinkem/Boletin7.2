package Ejercicio6;

public class Carta {

    private double sumaTotal;

    enum Palo {
        COPAS, ESPADAS, BASTOS, OROS
    }

    public Carta(double sumaTotal) {
        this.sumaTotal = sumaTotal;

        int numeroPalo = (int) Math.random() * 3 + 1;
        Palo palo;

        switch (numeroPalo) {
            case 1:
                Palo.valueOf("COPAS");
                break;
            case 2:
                Palo.valueOf("ESPADAS");
                break;
            case 3:
                Palo.valueOf("BASTOS");
                break;
            case 4:
                Palo.valueOf("OROS");
                break;
        }

    }

}
