package com.example.projekat_restoran.controller;

import com.example.projekat_restoran.entity.Jelo;
import com.example.projekat_restoran.service.JeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jelo")
public class JeloController {

    @Autowired
    private JeloService jeloService;

    @GetMapping("/jelo")
    public List<Jelo> findAll() {
        return jeloService.findAll();
    }

   /* @GetMapping//("/jelo/{id}")
    public Jelo findById(int id) {
        return jeloService.findById(id);
    }*/
    

    @PostMapping//("/jelo")
    public Jelo addJElo(@RequestBody Jelo jelo) {
        return jeloService.save(jelo);
    }

    @DeleteMapping//("/jelo/{id}")
    public String removeJelo(@PathVariable int id) {
        return jeloService.deleteById(id);
    }
}
