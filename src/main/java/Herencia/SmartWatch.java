package Herencia;

import Tarea4.SmartDevice;

public class SmartWatch extends SmartDevice {
    public boolean nuevo;
public SmartWatch(){

}
    public SmartWatch(String marca, String modelo, double versionSoftware, String numSerie, boolean nuevo) {
        super(marca, modelo, versionSoftware, numSerie);
        this.nuevo = nuevo;
    }
}
