package com.projekat.Projekat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jelo")
public class Jelo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "kategorija")
    private String kategorija;

    @Column(name = "cena")
    private double cena;

    @Column(name = "opis")
    private String opis;

    public Jelo() {
    }

    public Jelo(int id, String naziv, String kategorija, double cena, String opis) {
        this.id = id;
        this.naziv = naziv;
        this.kategorija = kategorija;
        this.cena = cena;
        this.opis = opis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", cena=" + cena +
                ", opis='" + opis + '\'' +
                '}';
    }
    public enum Kategorija {
        PREDJELO, GLAVNO_JELO, DESERT
    }
}
