package com.projekat.Projekat.service;

import com.projekat.Projekat.entity.Narudzbina;

import java.util.List;

public interface NarudzbinaService {

    List<Narudzbina> sveNarudzbine();
    Narudzbina sacuvajNarudzbinu(Narudzbina narudzbina);
    void obrisiNarudzbinuPoId(int id);


}
