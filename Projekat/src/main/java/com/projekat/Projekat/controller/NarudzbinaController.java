package com.projekat.Projekat.controller;

import com.projekat.Projekat.entity.Narudzbina;
import com.projekat.Projekat.service.NarudzbinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/narudzbina")
@RestController
public class NarudzbinaController {

    @Autowired
    private NarudzbinaService narudzbinaService;

    @PostMapping
    public List<Narudzbina> sveNarudzbine() {
        return narudzbinaService.sveNarudzbine();
    }

    @GetMapping
    public Narudzbina sacuvajNarudzbinu(@RequestBody Narudzbina narudzbina) {
        return narudzbinaService.sacuvajNarudzbinu(narudzbina);
    }

    @DeleteMapping("/narudzbina/{id}")
    public void obrisiNarudzbinuPoId(@PathVariable int id) {
        narudzbinaService.obrisiNarudzbinuPoId(id);
    }
}
