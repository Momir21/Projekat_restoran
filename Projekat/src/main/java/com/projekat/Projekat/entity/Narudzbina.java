package com.projekat.Projekat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "narudzbina")
public class Narudzbina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "jelo_id")
    private Jelo jelo;

    @ManyToOne
    @JoinColumn(name = "pice_id")
    private Pice pice;

    @Column(name = "kolicina_jela")
    private int kolicina_jela;

    @Column(name = "kolicina_pica")
    private int kolicina_pica;

    @Column(name = "ukupan_iznos")
    private double ukupan_iznos;

    @Column(name = "status_narudzbine")
    private StatusNarudzbine status;

    public Narudzbina() {
    }

    public Narudzbina(int id, Jelo jelo, Pice pice, int kolicina_jela, int kolicina_pica, double ukupan_iznos, StatusNarudzbine status) {
        this.id = id;
        this.jelo = jelo;
        this.pice = pice;
        this.kolicina_jela = kolicina_jela;
        this.kolicina_pica = kolicina_pica;
        this.ukupan_iznos = ukupan_iznos;
        this.status = status;
    }

    public StatusNarudzbine getStatus() {
        return status;
    }

    public void setStatus(StatusNarudzbine status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    public Pice getPice() {
        return pice;
    }

    public void setPice(Pice pice) {
        this.pice = pice;
    }

    public int getKolicina_jela() {
        return kolicina_jela;
    }

    public void setKolicina_jela(int kolicina_jela) {
        this.kolicina_jela = kolicina_jela;
    }

    public int getKolicina_pica() {
        return kolicina_pica;
    }

    public void setKolicina_pica(int kolicina_pica) {
        this.kolicina_pica = kolicina_pica;
    }

    public double getUkupan_iznos() {
        return ukupan_iznos;
    }

    public void setUkupan_iznos(double ukupan_iznos) {
        this.ukupan_iznos = ukupan_iznos;
    }

    @Override
    public String toString() {
        return "Narudzbina{" +
                "id=" + id +
                ", jelo=" + jelo +
                ", pice=" + pice +
                ", kolicina_jela=" + kolicina_jela +
                ", kolicina_pica=" + kolicina_pica +
                ", ukupan_iznos=" + ukupan_iznos +
                ", status=" + status +
                '}';
    }

    public enum StatusNarudzbine{
        na_cekanju, u_pripremi, dostavljeno
    }
}
