package Herencia;

import Tarea4.SmartDevice;

public class SmartPhone extends SmartDevice {
    public boolean nuevo;
public SmartPhone(){

}
    public SmartPhone(String marca, String modelo, double versionSoftware, String numSerie, boolean nuevo) {
        super(marca, modelo, versionSoftware, numSerie);
        this.nuevo = nuevo;
    }
}
