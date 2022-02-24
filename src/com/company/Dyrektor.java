package com.company;

public class Dyrektor extends Osoba {
    String szkola;
    private int pensja;

    public Dyrektor(String imie, String nazwisko, String szkola, int pensja) {
        super(imie, nazwisko);
        this.szkola = szkola;
        this.pensja = pensja;
    }

    public void opis() {
        super.opis();
        System.out.println("Jestem Dyrektorem, moja szkoła to " + szkola);
    }
}
