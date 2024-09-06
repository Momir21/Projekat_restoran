package com.example.projekat_restoran.service;

import com.example.projekat_restoran.entity.Zalihe;

import java.util.List;

public interface ZaligeService {

    List<Zalihe> findAll();

    Zalihe findById(int id);

    Zalihe save(Zalihe zalihe);

    String deleteById(int id);
}
