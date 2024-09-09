package com.projekat.Projekat.controller;

import com.projekat.Projekat.entity.Jelo;
import com.projekat.Projekat.service.JeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/jelo")
@RestController
public class JeloController {

    @Autowired
    private JeloService jeloService;

    @GetMapping
    public List<Jelo> svaJela() {
        return jeloService.svaJela();
    }

    @PostMapping
    public Jelo sacuvajJelo(@RequestBody Jelo jelo) {
        return jeloService.sacuvajJelo(jelo);
    }

    @DeleteMapping("/јelo/{naziv}")
    public void obrisiJeloPoNazivu(@PathVariable  String naziv) {
        jeloService.obrisiJeloPoNazivu(naziv);
    }



}
