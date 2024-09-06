package com.example.projekat_restoran.service;

import com.example.projekat_restoran.entity.Narudzbina;

import java.util.List;

public interface NarudbinaService {

    List<Narudzbina> findAll();

    Narudzbina findById(int id);

    Narudzbina save(Narudzbina narudzbina);

    String deleteById(int id);
}
