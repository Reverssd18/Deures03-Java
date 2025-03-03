package com.exercici0300;

public class Estudiant {
    
    // Constructor
    private String nom;
    private String id;
    private static int comptadorEstudiants = 0;
    private static final int MAX_ESTUDIANTS = 100;

    public Estudiant(String nom, String id) {
        this.nom = nom;
        this.id = id;
        comptadorEstudiants++;
    }

    // Mètodes públics estàtics
    public static int getComptadorEstudiants() {
        return comptadorEstudiants;
    }

    public static boolean hiHaCapacitat() {
        return comptadorEstudiants < MAX_ESTUDIANTS;
    }
}
