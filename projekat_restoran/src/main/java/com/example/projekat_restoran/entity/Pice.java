package com.example.projekat_restoran.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pice")
public class Pice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String ime;
    private int cena;
    @Enumerated(EnumType.STRING)
    private TipPica tip;

    public Pice() {
    }

    public Pice(int id, String ime, int cena, TipPica tip) {
        this.id = id;
        this.ime = ime;
        this.cena = cena;
        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public TipPica getTip() {
        return tip;
    }

    public void setTip(TipPica tip) {
        this.tip = tip;
    }
}
