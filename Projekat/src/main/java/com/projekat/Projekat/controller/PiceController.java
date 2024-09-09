package com.projekat.Projekat.controller;

import com.projekat.Projekat.entity.Pice;
import com.projekat.Projekat.service.PiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pice")
@RestController
public class PiceController {

    @Autowired
    private PiceService piceService;

    @GetMapping
    public List<Pice> svoPice(){
        return piceService.svoPice();
    }

    @PostMapping
    public Pice sacuvajPice( @RequestBody Pice pice) {
        return piceService.sacuvajPice(pice);
    }

    @DeleteMapping("/pice/{naziv}")
    public void obrisiPicePoNazivu(@PathVariable String naziv) {
        piceService.obrisiPicePoNazivu(naziv);
    }
}
