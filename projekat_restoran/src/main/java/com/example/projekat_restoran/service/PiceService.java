package com.example.projekat_restoran.service;

import com.example.projekat_restoran.entity.Pice;

import java.util.List;

public interface PiceService {

    List<Pice> findAll();

    Pice findById(int id);

    Pice save(Pice pice);

    String deleteById(int id);
}
