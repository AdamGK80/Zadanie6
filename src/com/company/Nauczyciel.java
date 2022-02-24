package com.company;

import java.util.ArrayList;
import java.util.List;

public class Nauczyciel extends Osoba {
    String przedmiot;
    private int pensja;

    private static List<Nauczyciel> nauczyciele = new ArrayList<>();

    public Nauczyciel(String imie, String nazwisko, String przedmiot, int pensja) {
        super(imie, nazwisko);
        this.przedmiot = przedmiot;
        this.pensja = pensja;

        nauczyciele.add(this);
    }

    public static List<Nauczyciel> getNauczyciele() {
        return nauczyciele;
    }

    public void opis() {
        super.opis();
        System.out.println("Jestem nauczycielem, moj przedmiot to " + przedmiot);
    }
}
