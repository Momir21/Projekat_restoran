package com.example.projekat_restoran.service;

import com.example.projekat_restoran.entity.Jelo;

import java.util.List;

public interface JeloService {

    List<Jelo> findAll();

    Jelo findById(int id);

    Jelo save(Jelo jelo);

    String deleteById(int id);


}
