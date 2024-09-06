package com.example.projekat_restoran.service;

import com.example.projekat_restoran.entity.Rezervacija;

import java.util.List;

public interface RezervacijaService {

    List<Rezervacija> findAll();

    Rezervacija findById(int id);

    Rezervacija save(Rezervacija rezervacija);

    String deleteById(int id);
}
