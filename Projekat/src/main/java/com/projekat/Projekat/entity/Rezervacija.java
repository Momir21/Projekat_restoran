package com.projekat.Projekat.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = " rezervacija")
public class Rezervacija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "vreme")
    private Time vreme;

    @Column(name = "broj_osoba")
    private int broj_osoba;

    @Column(name = "kontakt_info")
    private String kontakt;

    public Rezervacija() {
    }

    public Rezervacija(int id, Date datum, Time vreme, int broj_osoba, String kontakt) {
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

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Time getVreme() {
        return vreme;
    }

    public void setVreme(Time vreme) {
        this.vreme = vreme;
    }

    public int getBroj_osoba() {
        return broj_osoba;
    }

    public void setBroj_osoba(int broj_osoba) {
        this.broj_osoba = broj_osoba;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    @Override
    public String toString() {
        return "Rezervacija{" +
                "id=" + id +
                ", datum=" + datum +
                ", vreme=" + vreme +
                ", broj_osoba=" + broj_osoba +
                ", kontakt='" + kontakt + '\'' +
                '}';
    }
}
