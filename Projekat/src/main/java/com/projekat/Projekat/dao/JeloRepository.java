package com.projekat.Projekat.dao;

import com.projekat.Projekat.entity.Jelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JeloRepository extends JpaRepository<Jelo, Integer> {


    /*List<Jelo> findByKategorija(String kategorija);
    List<Jelo> svaJela();*/
    Optional<Jelo> findByNaziv(String naziv);
    void deleteByNaziv(String naziv);
}
