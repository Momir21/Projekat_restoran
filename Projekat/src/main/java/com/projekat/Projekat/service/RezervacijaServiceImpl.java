package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Rezervacija;
import com.projekat.Projekat.dao.RezervacijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class RezervacijaServiceImpl implements RezervacijaService {

    @Autowired
    private RezervacijaRepository rezervacijaRepository;

    @Override
    public List<Rezervacija> sveRezervacije(){
        return rezervacijaRepository.findAll();
    }

    @Override
    public Rezervacija sacuvajRezervaciju(Rezervacija rezervacija) {
        return rezervacijaRepository.save(rezervacija);
    }

    @Override
    public void obrisiRezervacijuPoId(int id) {
        Optional<Rezervacija> rezervacija = rezervacijaRepository.findById(id);
        if (rezervacija.isPresent()) {
            rezervacijaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Rezervacija sa id-om " + id + " nije pronađeno.");
        }
    }

}



