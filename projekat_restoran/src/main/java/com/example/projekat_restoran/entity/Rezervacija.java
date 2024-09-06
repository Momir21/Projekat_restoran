package com.example.projekat_restoran.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "rezervacija")
public class Rezervacija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private LocalDate datum;
    private LocalTime vreme;
    private int broj_osoba;
    private int kontakt;

    public Rezervacija() {
    }

    public Rezervacija(int id, LocalDate datum, LocalTime vreme, int broj_osoba, int kontakt) {
        this.id = id;
        this.datum = datum;
        this.vreme = vreme;
        this.broj_osoba = broj_osoba;
        this.kontakt = kontakt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getVreme() {
        return vreme;
    }

    public void setVreme(LocalTime vreme) {
        this.vreme = vreme;
    }

    public int getBroj_osoba() {
        return broj_osoba;
    }

    public void setBroj_osoba(int broj_osoba) {
        this.broj_osoba = broj_osoba;
    }

    public int getKontakt() {
        return kontakt;
    }

    public void setKontakt(int kontakt) {
        this.kontakt = kontakt;
    }
}
