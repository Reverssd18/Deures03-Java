package com.exercici0305;

public class Arbitre extends Participant {
    private String nivell;

    public Arbitre(String nom, int edat, String nivell) {
        super(nom, edat);
        this.nivell = nivell;
    }

    public String getNivell() {
        return nivell;
    }

    public void setNivell(String value) {
        this.nivell = value;
    }
    public void entrenar() {
        System.out.println("L'àrbitre " + getNom() + " està entrenant " );
    }

    public void competir() {
        System.out.println("L'àrbitre " + getNom() + " està arbitrant a nivell " + nivell);
    }

    @Override
    public String toString() {
        return "Arbitre{" +
                "nom='" + getNom() + '\'' +
                ", edat=" + getEdat() +
                ", nivell='" + nivell + '\'' +
                '}';
    }
}
