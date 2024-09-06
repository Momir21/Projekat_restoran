package com.example.projekat_restoran.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "jelo")
public class Jelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String ime;
    private int cena;
    private String opis;
    @Enumerated(EnumType.STRING)
    private KategorijaJela kategorija;

    public Jelo() {
    }

    public Jelo(int id, String ime, int cena, String opis, KategorijaJela kategorija) {
        this.id = id;
        this.ime = ime;
        this.cena = cena;
        this.opis = opis;
        this.kategorija = kategorija;
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public KategorijaJela getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaJela kategorija) {
        this.kategorija = kategorija;
    }
}
