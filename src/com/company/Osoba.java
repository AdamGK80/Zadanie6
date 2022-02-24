package com.company;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    String imie;
    String nazwisko;

    private static List<Osoba> obiekty = new ArrayList<>();

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        obiekty.add(this);
    }

    public static List<Osoba> getObiekty() {
        return obiekty;
    }

    public void opis() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public String toString() {
        return imie + " " + nazwisko;
    }
}
