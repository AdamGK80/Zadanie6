package com.company;

import java.util.ArrayList;
import java.util.List;

public class Uczen extends Osoba {
    String klasa;
    double srednia;

    private static List<Uczen> uczniowie = new ArrayList<>();

    public Uczen(String imie, String nazwisko, String klasa, double srednia) {
        super(imie, nazwisko);
        this.klasa = klasa;
        this.srednia = srednia;

        uczniowie.add(this);
    }

    public static List<Uczen> getUczniowie() {
        return uczniowie;
    }

    public void opis() {
        super.opis();
        System.out.println("Jestem uczniem klasy " + klasa + ", moja srednia ocen: " + srednia);
    }
}
