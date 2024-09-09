package com.projekat.Projekat.dao;

import com.projekat.Projekat.entity.Pice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PiceRepository extends JpaRepository<Pice, Integer> {


    Optional<Pice> findByNaziv(String naziv);
    void deleteByNaziv(String naziv);

}
