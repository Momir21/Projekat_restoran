package com.projekat.Projekat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "zalihe")
public class Zaliha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "kolicina")
    private int kolicina;

    public Zaliha() {
    }

    public Zaliha(int id, String naziv, int kolicina) {
        this.id = id;
        this.naziv = naziv;
        this.kolicina = kolicina;
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

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Zalihe{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
