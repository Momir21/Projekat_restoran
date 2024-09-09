package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Zaliha;

import java.util.List;

public interface ZalihaService {

    List<Zaliha> sveZalihe();
    Zaliha sacuvajZalihe(Zaliha zaliha);
    void obrisiZalihuPoId(int id);
}
