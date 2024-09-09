package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Zaliha;
import com.projekat.Projekat.dao.ZalihaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class ZalihaServiceImpl implements ZalihaService {

    @Autowired
    private ZalihaRepository zalihaRepository;

    @Override
    public List<Zaliha> sveZalihe() {
        return zalihaRepository.findAll();
    }

    @Override
    public Zaliha sacuvajZalihe(Zaliha zaliha ) {
        return zalihaRepository.save(zaliha);

    }

    @Override
    public void obrisiZalihuPoId(int id) {
        Optional<Zaliha> rezervacija = zalihaRepository.findById(id);
        if (rezervacija.isPresent()) {
            zalihaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Zaliha sa id-om " + id + " nije pronađeno.");
        }
    }
}



