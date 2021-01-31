package Ejercicio2;

public class Ordenador {

    Integer tamanioRam, velocidadRam, iva = 21;
    String tipoRam, tipoDD, modeloCPU;
    Double tamanioDD, velocidadCPU, precioBase = 1000.0, precioMercado;

    public Ordenador(Integer tamanioRam, Integer velocidadRam, String tipoRam, String tipoDD, Double tamanioDD,
            String modeloCPU, Double velocidadCPU) {
        this.tamanioRam = tamanioRam;
        this.velocidadRam = velocidadRam;
        this.tipoRam = tipoRam;
        this.tipoDD = tipoDD;
        this.tamanioDD = tamanioDD;
        this.modeloCPU = modeloCPU;
        this.velocidadCPU = velocidadCPU;
    }

    public void mostrarDD() {
        System.out.println("Tamanio DD: " + tamanioDD + " Tipo DD: " + tipoDD);
    }

    public void mostrarRam() {
        System.out.println("Tamanio RAM: " + tamanioRam + " Velocidad RAM: " + velocidadRam + " Tipo RAM: " + tipoRam);
        ;
    }

    public void mostrarCPU() {
        System.out.println("Modelo CPU: " + modeloCPU + " Velocidad CPU: " + velocidadCPU);
    }

    public void mostrarPrecioMercado() {
        precioMercado = precioBase + ((precioBase * iva) / 100);

        System.out.println("Precio mercado: " + precioMercado);
    }

    public void mostrarPC() {
        mostrarDD();
        mostrarRam();
        mostrarCPU();
        mostrarPrecioMercado();
    }

    public class VelocidadRamException extends Exception {
        public VelocidadRamException(String msg) {
            super(msg);
        }
    }

    public class TamanioRamException extends Exception {
        public TamanioRamException(String msg) {
            super(msg);
        }
    }

    public class TipoRamException extends Exception {
        public TipoRamException(String msg) {
            super(msg);
        }
    }

    public Integer getTamanioRam() {
        return this.tamanioRam;
    }

    public void setTamanioRam(Integer tamanioRam) throws TamanioRamException {
        if (tamanioRam < 2 && tamanioRam > 128) {
            throw new TamanioRamException("El tamanio de RAM no es valido");
        } else {
            this.tamanioRam = tamanioRam;
        }
    }

    public Integer getVelocidadRam() {
        return this.velocidadRam;
    }

    public void setVelocidadRam(Integer velocidadRam) throws VelocidadRamException {
        if (velocidadRam < 200 && velocidadRam > 4400) {
            throw new VelocidadRamException("La velocidad de RAM no es valida");
        } else {
            this.velocidadRam = velocidadRam;
        }
    }

    public Integer getIva() {
        return this.iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    public String getTipoRam() {
        return this.tipoRam;
    }

    public void setTipoRam(String tipoRam) throws TipoRamException {
        if (tipoRam != "DDR" || tipoRam != "DDR2" || tipoRam != "DDR3" || tipoRam != "DDR4") {
            throw new TipoRamException("Tipo de RAM no valido");
        } else {
            this.tipoRam = tipoRam;
        }
    }

    public String getTipoDD() {
        return this.tipoDD;
    }

    public void setTipoDD(String tipoDD) {
        this.tipoDD = tipoDD;
    }

    public String getModeloCPU() {
        return this.modeloCPU;
    }

    public void setModeloCPU(String modeloCPU) {
        this.modeloCPU = modeloCPU;
    }

    public Double getTamanioDD() {
        return this.tamanioDD;
    }

    public void setTamanioDD(Double tamanioDD) {
        this.tamanioDD = tamanioDD;
    }

    public Double getVelocidadCPU() {
        return this.velocidadCPU;
    }

    public void setVelocidadCPU(Double velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public Double getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPrecioMercado() {
        return this.precioMercado;
    }

    public void setPrecioMercado(Double precioMercado) {
        this.precioMercado = precioMercado;
    }

}
