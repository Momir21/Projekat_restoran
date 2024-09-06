package com.example.projekat_restoran.service;

import com.example.projekat_restoran.dao.NarudzbinaRepository;
import com.example.projekat_restoran.entity.Narudzbina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NarudzbinaServiceImpl implements NarudbinaService{

    @Autowired
    private NarudzbinaRepository narudzbinaRepository;

    @Override
    public List<Narudzbina> findAll(){
        return narudzbinaRepository.findAll();
    }

    @Override
    public Narudzbina findById(int id) {
        return narudzbinaRepository.findById(id).orElse(null);
    }

    @Override
    public Narudzbina save(Narudzbina narudzbina) {
        return narudzbinaRepository.save(narudzbina);
    }

    @Override
    public String deleteById(int id) {
        Narudzbina narudzbina = findById(id);
        if(narudzbina != null) {
            narudzbinaRepository.deleteById(id);
            return "Narudzbina sa id-em (" + id + ") je obrisana";
        } else {
            return  "Narudzbina sa id-em (" + id + ") nije pronadjena";
        }
    }
}
