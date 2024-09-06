package com.example.projekat_restoran.controller;

import com.example.projekat_restoran.entity.Narudzbina;
import com.example.projekat_restoran.service.NarudbinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/narudzbina")
public class NarudzbinaController {

    @Autowired
    private NarudbinaService narudbinaService;

    @GetMapping("/narudzbina")
    public List<Narudzbina> findAll() {
        return narudbinaService.findAll();
    }

    @GetMapping("/narudzbina/{id}")
    public Narudzbina findById(int id) {
        return narudbinaService.findById(id);
    }

    @PostMapping("/narudzbina")
    public Narudzbina addNarudzbina(@RequestBody Narudzbina narudzbina) {
        return narudbinaService.save(narudzbina);
    }

    @DeleteMapping("/narudzbina/{id}")
    public String removeNarudzbina(@PathVariable int id){
        return narudbinaService.deleteById(id);
    }
}
