package com.projekat.Projekat.dao;

import com.projekat.Projekat.entity.Rezervacija;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RezervacijaRepository  extends JpaRepository<Rezervacija, Integer> {
}
