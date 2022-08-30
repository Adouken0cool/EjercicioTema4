package Tarea4;

public class SmartDevice {
   protected String marca;
    protected String modelo;
    protected double versionSoftware;
    protected String numSerie;




    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, double versionSoftware, String numSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.versionSoftware = versionSoftware;
        this.numSerie = numSerie;
    }

}

