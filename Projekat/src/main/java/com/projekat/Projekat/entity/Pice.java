package com.projekat.Projekat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pice")
public class Pice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "cena")
    private double cena;

    @Column(name = "tip")
    private String tip;

    public Pice() {
    }

    public Pice(int id, String naziv, double cena, String tip) {
        this.id = id;
        this.naziv = naziv;
        this.cena = cena;
        this.tip = tip;
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

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Pice{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", tip='" + tip + '\'' +
                '}';
    }
}
