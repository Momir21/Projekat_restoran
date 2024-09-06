package com.example.projekat_restoran.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "narudzbina")
public class Narudzbina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int broj_porcija;
    private int broj_pica;
    private int cena;
    private int jelo_id;
    private int pice_id;
    @Enumerated(EnumType.STRING)
    private StatusNarudzbine status;

    public Narudzbina() {
    }

    public Narudzbina(int id, int broj_porcija, int broj_pica, int cena, int jelo_id, int pice_id, StatusNarudzbine status) {
        this.id = id;
        this.broj_porcija = broj_porcija;
        this.broj_pica = broj_pica;
        this.cena = cena;
        this.jelo_id = jelo_id;
        this.pice_id = pice_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBroj_porcija() {
        return broj_porcija;
    }

    public void setBroj_porcija(int broj_porcija) {
        this.broj_porcija = broj_porcija;
    }

    public int getBroj_pica() {
        return broj_pica;
    }

    public void setBroj_pica(int broj_pica) {
        this.broj_pica = broj_pica;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getJelo_id() {
        return jelo_id;
    }

    public void setJelo_id(int jelo_id) {
        this.jelo_id = jelo_id;
    }

    public int getPice_id() {
        return pice_id;
    }

    public void setPice_id(int pice_id) {
        this.pice_id = pice_id;
    }

    public StatusNarudzbine getStatus() {
        return status;
    }

    public void setStatus(StatusNarudzbine status) {
        this.status = status;
    }
}
