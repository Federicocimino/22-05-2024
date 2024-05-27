package org.example;

public class Moto extends Veicolo {
    private int numeroCilindri;;
    private int cilindrata;

    public Moto(String marca, String modello, int numeroCilindri, int cilindrata) {
        super(marca, modello);
        this.numeroCilindri = numeroCilindri;
        this.cilindrata = cilindrata;
    }

    public int getNumeroCilindri() {
        return numeroCilindri;
    }

    public void setNumeroCilindri(int numeroCilindri) {
        this.numeroCilindri = numeroCilindri;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

