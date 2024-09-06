package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Pice;

import java.util.List;

public interface PiceService {

    List<Pice> svoPice();

    Pice sacuvajPice(Pice pice);

    void obrisiPicePoNazivu(String naziv);
}
