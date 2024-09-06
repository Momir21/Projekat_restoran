package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Narudzbina;

import com.projekat.Projekat.dao.JeloRepository;
import com.projekat.Projekat.dao.NarudzbinaRepository;
import com.projekat.Projekat.dao.PiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NarudzbinaServiceImpl implements NarudzbinaService {

    @Autowired
    private NarudzbinaRepository narudzbinaRepository;

    @Autowired
    private JeloRepository jeloRepository;

    @Autowired
    private PiceRepository piceRepository;

    @Override
    public List<Narudzbina> sveNarudzbine() {
        return narudzbinaRepository.findAll();
    }

    @Override
    public Narudzbina sacuvajNarudzbinu(Narudzbina narudzbina) {
        double cenaJela = narudzbina.getJelo().getCena() * narudzbina.getKolicina_jela();
        double cenaPica = narudzbina.getPice().getCena() * narudzbina.getKolicina_pica();
        narudzbina.setUkupan_iznos(cenaJela + cenaPica);

        return narudzbinaRepository.save(narudzbina);
    }
    @Override
    public void obrisiNarudzbinuPoId(int id) {
        Optional<Narudzbina> narudzbina = narudzbinaRepository.findById(id);
        if (narudzbina.isPresent()) {
            narudzbinaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Narudzbina sa id-om " + id + " nije pronađeno.");
        }
    }
}

