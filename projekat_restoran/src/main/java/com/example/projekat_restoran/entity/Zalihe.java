package com.example.projekat_restoran.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "zalihe")
public class Zalihe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int pice_id;
    private int kolicina;

    public Zalihe() {
    }

    public Zalihe(int id, int pice_id, int kolicina) {
        this.id = id;
        this.pice_id = pice_id;
        this.kolicina = kolicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPice_id() {
        return pice_id;
    }

    public void setPice_id(int pice_id) {
        this.pice_id = pice_id;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
}
