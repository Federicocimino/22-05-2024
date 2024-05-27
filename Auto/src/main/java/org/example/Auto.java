package org.example;

public class Auto extends Veicolo {
    private int numeroPorte;
    private String colore;

    public Auto(String marca, String modello, int numeroPorte ,String colore) {
        super(marca, modello);
        this.numeroPorte = numeroPorte;
        this.colore = colore;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}