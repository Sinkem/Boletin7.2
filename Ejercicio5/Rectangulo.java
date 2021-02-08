package Ejercicio5;

public class Rectangulo implements Figura {

    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) throws ValidezDatosException {

        this.alto = alto;
        this.ancho = ancho;

        if (alto <= 0 || ancho <= 0) {
            throw new ValidezDatosException("Los numeros introducidos no son validos");
        }
    }

    @Override
    public double getArea() {
        return alto * ancho;
    }

    public class ValidezDatosException extends Exception {
        public ValidezDatosException(String msg) {
            super(msg);
        }
    }

    public double getAlto() {

        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

}
