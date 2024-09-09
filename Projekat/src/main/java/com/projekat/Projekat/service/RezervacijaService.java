package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Rezervacija;

import java.util.List;

public interface RezervacijaService {

    List<Rezervacija> sveRezervacije();
    Rezervacija sacuvajRezervaciju(Rezervacija rezervacija);
    void obrisiRezervacijuPoId(int id);
}
