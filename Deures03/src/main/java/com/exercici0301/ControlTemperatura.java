package com.exercici0301;

public class ControlTemperatura {

    private String nomZona;
    private double temperatura;
    private static double sumaTemperatures = 0.0;
    private static int numZones = 0;

    public ControlTemperatura(String nomZona, double temperatura) {
        this.nomZona = nomZona;
        this.temperatura = temperatura;
        sumaTemperatures += temperatura;
        numZones++;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void ajustaTemperatura(double novaTemperatura) {
        sumaTemperatures -= this.temperatura;
        this.temperatura = novaTemperatura;
        sumaTemperatures += novaTemperatura;
    }

    public static double getTemperaturaMitjana() {
        if (numZones == 0) return 0.0;
        return sumaTemperatures / numZones;
    }
}

