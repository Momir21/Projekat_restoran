package com.example.projekat_restoran.dao;

import com.example.projekat_restoran.entity.Rezervacija;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RezervacijaRepository extends JpaRepository<Rezervacija, Integer> {
}
