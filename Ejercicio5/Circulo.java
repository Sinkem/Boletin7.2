package Ejercicio5;

public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) throws ValidezDatosException {
        this.radio = radio;

        if (radio <= 0) {
            throw new ValidezDatosException("Los numeros introducidos no son validos");
        }
    }

    @Override
    public double getArea() {
        return pi * (radio * radio);
    }

    public class ValidezDatosException extends Exception {
        public ValidezDatosException(String msg) {
            super(msg);
        }
    }

}
