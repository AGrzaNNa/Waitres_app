package com.example.myapplication;

public class Dania {
    String nazwa;
    double cena;

    public Dania(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwaDania() {
        return nazwa;
    }

    public double getCenaDania() {
        return cena;
    }
}
