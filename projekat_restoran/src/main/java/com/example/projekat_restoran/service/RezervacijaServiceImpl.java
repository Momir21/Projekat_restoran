package com.example.projekat_restoran.service;

import com.example.projekat_restoran.dao.RezervacijaRepository;
import com.example.projekat_restoran.entity.Rezervacija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervacijaServiceImpl implements RezervacijaService {

    @Autowired
    private RezervacijaRepository rezervacijaRepository;

    @Override
    public List<Rezervacija> findAll(){
        return rezervacijaRepository.findAll();
    }

    @Override
    public Rezervacija findById(int id) {
        return rezervacijaRepository.findById(id).orElse(null);
    }

    @Override
    public Rezervacija save(Rezervacija rezervacija) {
        return  rezervacijaRepository.save(rezervacija);
    }

    @Override
    public String deleteById(int id) {
        Rezervacija rezervacija = findById(id);
        if(rezervacija != null) {
            rezervacijaRepository.deleteById(id);
            return "Rezervacija sa id-em (" + id + ") je obrisana";
        } else
            return "Rezervacija sa id-em (" + id + ") nije pronadjena";
    }
}
