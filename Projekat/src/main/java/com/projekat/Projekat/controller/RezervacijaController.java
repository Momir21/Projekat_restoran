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
    public Rezervacija sacuvajRezervaciju( @RequestBody Rezervacija rezervacija) {
        return rezervacijaService.sacuvajRezervaciju(rezervacija);
    }

    @DeleteMapping("/rezervacija/{id}")
    public void obrisiRezervacijuPoId(@PathVariable int id) {
        rezervacijaService.obrisiRezervacijuPoId(id);
    }
}
