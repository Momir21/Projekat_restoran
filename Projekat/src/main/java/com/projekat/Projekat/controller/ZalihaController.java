package com.projekat.Projekat.controller;

import com.projekat.Projekat.entity.Zaliha;
import com.projekat.Projekat.service.ZalihaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zaliha")
public class ZalihaController {

    @Autowired
    private ZalihaService zalihaService;

    @GetMapping
    public List<Zaliha> sveZalihe() {
        return zalihaService.sveZalihe();
    }

    @PostMapping
    public Zaliha sacuvajZalihhu(@RequestBody Zaliha zaliha) {
        return zalihaService.sacuvajZalihe(zaliha);
    }

    @DeleteMapping("/zaliha/{id}")
    public void obrisiZalihuPoId(@PathVariable int id){
        zalihaService.obrisiZalihuPoId(id);
    }
}
