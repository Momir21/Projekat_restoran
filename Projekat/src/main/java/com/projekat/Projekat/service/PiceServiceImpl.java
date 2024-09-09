package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Pice;
import com.projekat.Projekat.dao.PiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class PiceServiceImpl implements PiceService {

    @Autowired
    private PiceRepository piceRepository;

    @Override
    public List<Pice> svoPice() {
        return piceRepository.findAll();
    }

    @Override
    public Pice sacuvajPice(Pice pice) {
        return piceRepository.save(pice);
    }

    @Override
    public void obrisiPicePoNazivu(String naziv) {
        Optional<Pice> pice = piceRepository.findByNaziv(naziv);
        if (pice.isPresent()) {
            piceRepository.deleteByNaziv(naziv);
        } else {
            throw new RuntimeException("Pice sa nazivom " + naziv + " nije pronađeno.");
        }
    }
}
