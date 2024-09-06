package com.example.projekat_restoran.controller;

import com.example.projekat_restoran.entity.Rezervacija;
import com.example.projekat_restoran.service.RezervacijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezervacija")
public class RezervacijaController {

    @Autowired
    private RezervacijaService rezervacijaService;

    @GetMapping("/rezervacija")
    public List<Rezervacija> findAll() {
        return  rezervacijaService.findAll();
    }

    @GetMapping("/rezervacija/{id}")
    public Rezervacija findById(int id) {
        return rezervacijaService.findById(id);
    }

    @PostMapping("/rezervacija")
    public Rezervacija addRezervacija(@RequestBody Rezervacija rezervacija) {
        return rezervacijaService.save(rezervacija);
    }

    @DeleteMapping("/rezervacija/{id}")
    public String removeRezervacija(@PathVariable int id) {
        return rezervacijaService.deleteById(id);
    }
}
