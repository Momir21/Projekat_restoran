package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Jelo;
import com.projekat.Projekat.dao.JeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class JeloServiceImpl implements JeloService {

    @Autowired
    private JeloRepository jeloRepository;

    @Override
    public List<Jelo> svaJela() {
        return jeloRepository.findAll();
    }

    @Override
    public Jelo sacuvajJelo(Jelo jelo) {
        return jeloRepository.save(jelo);
    }

    @Override
    public void obrisiJeloPoNazivu(String naziv) {
        Optional<Jelo> jelo = jeloRepository.findByNaziv(naziv);
        if (jelo.isPresent()) {
            jeloRepository.deleteByNaziv(naziv);
        } else {
            throw new RuntimeException("Jelo sa nazivom " + naziv + " nije pronađeno.");
        }
    }


}
