package Ejercicio6;

import java.util.Scanner;

public class Carta {

    private double sumaTotal;
    private double valorCarta;

    enum Palo {
        COPAS, ESPADAS, BASTOS, OROS
    }

    enum Valor{
        UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, SOTA, CABALLO, REY
    }

    public Carta(double sumaTotal) {
        this.sumaTotal = sumaTotal;

        int numeroPalo = (int) Math.random() * 3 + 1;
        int numeroValor = (int) Math.random() * 11 + 1;
        Palo palo;
        Valor valor;

        switch (numeroPalo) {
            case 1:
                palo = Palo.COPAS;
                break;
            case 2:
                palo = Palo.ESPADAS;
                break;
            case 3:
                palo = Palo.BASTOS;
                break;
            case 4:
                palo = Palo.OROS;
                break;
        }

        switch (numeroValor){
            case 1: 
                valor = Valor.UNO; 
                valorCarta = 1.0;
                break;
            case 2: 
                valor = Valor.DOS;
                valorCarta = 2.0;
                break;
            case 3: 
                valor = Valor.TRES; 
                valorCarta = 3.0;
                break;
            case 4: 
                valor = Valor.CUATRO;
                valorCarta = 4.0; 
                break;
            case 5: 
                valor = Valor.CINCO;
                valorCarta = 5.0; 
                break;
            case 6: 
                valor = Valor.SEIS;
                valorCarta = 6.0; 
                break;
            case 7: 
                valor = Valor.SIETE;
                valorCarta = 7.0; 
                break;
            case 8: 
                valor = Valor.OCHO;
                valorCarta = 8.0; 
                break;
            case 9: 
                valor = Valor.NUEVE;
                valorCarta = 9.0;
                break;
            case 10: 
                valor = Valor.SOTA;
                valorCarta = 0.5; 
                break;
            case 11: 
                valor = Valor.CABALLO; 
                valorCarta = 0.5; 
                break;
            case 12: 
                valor = Valor.REY;
                valorCarta = 0.5;
                break;
        }

        sumaTotal += valorCarta;

        Carta carta;

    }

    public void pedirCarta(){

        Scanner scn = new Scanner(System.in);
        int respuestaUsuario;

        while(sumaTotal <= 7.5){
            System.out.println("****************");
            System.out.println("1. Pedir carta");
            System.out.println("2. Plantarse");
            System.out.println("****************");
            respuestaUsuario = scn.nextInt();

            switch(respuestaUsuario){
                case 1: 
                    Carta();
                    System.out.println( + " de " + carta.palo);
                    System.out.println("Total: " + sumaTotal);
                    if(sumaTotal <= 7.5){
                        pedirCarta();
                    } else{
                        System.out.println("Te has pasado. Fin del juego");
                        sumaTotal = 8.0;
                    }
                    break;
                case 2:
                    plantarse();
                    sumaTotal = 8.0;
                    break;
            }

        }
    }

    public void plantarse(){
        System.out.println("Bien jugado");
    }

    public double getSumaTotal() {
        return this.sumaTotal;
    }

    public double getValorCarta() {
        return this.valorCarta;
    }

}
