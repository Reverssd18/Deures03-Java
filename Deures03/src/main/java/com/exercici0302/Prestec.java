package com.exercici0302;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestec {
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Prestec(Llibre llibre, String dataPrestec, String dataRetorn) {
        this.llibre = llibre;
        this.dataPrestec = LocalDate.parse(dataPrestec, formatter);
        this.dataRetorn = LocalDate.parse(dataRetorn, formatter);
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }

    public String getDataPrestec() {
        return dataPrestec.format(formatter);
    }

    public void setDataPrestec(String dataPrestec) {
        this.dataPrestec = LocalDate.parse(dataPrestec, formatter);
    }

    public String getDataRetorn() {
        return dataRetorn.format(formatter);
    }

    public void setDataRetorn(String dataRetorn) {
        this.dataRetorn = LocalDate.parse(dataRetorn, formatter);
    }

    public boolean estaEnTermini() {
        return LocalDate.now().isBefore(dataRetorn) || LocalDate.now().isEqual(dataRetorn);
    }
}



