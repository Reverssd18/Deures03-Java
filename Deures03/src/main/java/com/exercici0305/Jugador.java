package com.exercici0305;

public class Jugador extends Participant implements Esportista, Competidor {

    private String equip;

    public Jugador(String nom, int edat, String equip) {
        super(nom, edat);
        this.equip = equip;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String value) {
        this.equip = value;
    }

    public void entrenar() {
        System.out.println("El jugador " + getNom() + " està entrenant");
    }

    public void competir() {
        System.out.println("El jugador " + getNom() + " està competint amb l'equip " + equip);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nom='" + getNom() + '\'' +
                ", edat=" + getEdat() +
                ", equip='" + equip + '\'' +
                '}';
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPuntuacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
