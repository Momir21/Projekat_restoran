package com.projekat.Projekat.controller;

import com.projekat.Projekat.entity.Rezervacija;
import com.projekat.Projekat.service.RezervacijaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rezervacija")
@RestController
public class RezervacijaController {

    @Autowired
    private RezervacijaService rezervacijaService;

    @GetMapping
    public List<Rezervacija> sveRezervacije(){
        return rezervacijaService.sveRezervacije();
    }

    @PostMapping
    public Rezervacija sacuvajRezervaciju(Rezervacija rezervacija) {
        return rezervacijaService.sacuvajRezervaciju(rezervacija);
    }

    @DeleteMapping("/id")
    public void obrisiRezervacijuPoId(int id) {
        rezervacijaService.obrisiRezervacijuPoId(id);
    }
}
