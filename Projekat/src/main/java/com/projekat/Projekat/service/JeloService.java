package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Jelo;

import java.util.List;

public interface JeloService {


    //Jelo save(Jelo jelo);

    List<Jelo> svaJela();

    Jelo sacuvajJelo(Jelo jelo);

    void obrisiJeloPoNazivu(String naziv);
}
