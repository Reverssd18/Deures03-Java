package com.exercici0305;

public class Participant {
    protected String nom;
    protected int edat;

    public Participant(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int value) {
        this.edat = value;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }

    void entrenar() {
        // Implement the training logic here
        System.out.println(nom + " está entrenant.");
    }

    void competir() {
        // Implement the competition logic here
        System.out.println(nom + " está competint.");
    }
}
