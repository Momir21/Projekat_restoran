package com.example.projekat_restoran.service;

import com.example.projekat_restoran.dao.JeloRepository;
import com.example.projekat_restoran.entity.Jelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JeloServiceImpl implements JeloService{

    @Autowired
    private JeloRepository jeloRepository;

    @Override
    public List<Jelo> findAll() {
        return jeloRepository.findAll();
    }

    @Override
    public  Jelo findById(int id) {
        return jeloRepository.findById(id).orElse(null);
    }

    @Override
    public Jelo save(Jelo jelo) {
        return jeloRepository.save(jelo);
    }

    @Override
    public String deleteById(int id) {
        Jelo jelo = findById(id);
        if(jelo != null) {
            jeloRepository.deleteById(id);
            return "Jelo sa id-em (" + id + ") je obrisano";
        } else {
            return "Jelo sa id-em (" + id + ") nije pronadjeno";
        }
    }

}
