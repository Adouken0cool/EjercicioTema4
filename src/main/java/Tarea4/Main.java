package Tarea4;

import Herencia.SmartPhone;
import Herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone samsun = new SmartPhone();
        samsun.modelo = "SmartPhone Sansum";
        samsun.marca = "S10";
        samsun.numSerie = "ASE45";
        samsun.versionSoftware = 12.4;
        samsun.nuevo =false;

        System.out.println("Modelo: "+samsun.modelo);
        System.out.println("Marca: "+samsun.marca);
        System.out.println("Serie: "+samsun.numSerie);
        System.out.println("Version: "+samsun.versionSoftware);
        System.out.println("Estado: "+samsun.nuevo);

        SmartWatch apple = new SmartWatch();
        apple.modelo = "Smartwatch Apple";
        apple.marca = "Serie 7";
        apple.numSerie = "iOS";
        apple.versionSoftware = 16.7;
        apple.nuevo =true;

        System.out.println("Modelo: "+apple.modelo);
        System.out.println("Marca: "+apple.marca);
        System.out.println("Serie: "+apple.numSerie);
        System.out.println("Version: "+apple.versionSoftware);
        System.out.println("Estado: "+apple.nuevo);






    }
}
