package org.example;


public class Concessionario {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat", "500", 2,"bianca");
        Moto moto = new Moto("Ducati", "Monster", 2,696);
        System.out.println("Auto: " + auto.getMarca() + " " + auto.getModello() + ", Numero porte: " + auto.getNumeroPorte() + ", Colore: " + auto.getColore());
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModello() + ", Numero cilindri: " + moto.getNumeroCilindri() + ", Cilindrata: " + moto.getCilindrata());
    }
}