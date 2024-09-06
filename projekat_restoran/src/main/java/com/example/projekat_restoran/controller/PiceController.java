package com.example.projekat_restoran.controller;

import com.example.projekat_restoran.entity.Pice;
import com.example.projekat_restoran.service.PiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pice")
public class PiceController {

    @Autowired
    private PiceService piceService;

    @GetMapping("/pice")
    public List<Pice> findAll() {
        return piceService.findAll();
    }

    @GetMapping("/pice/{id}")
    public Pice findById(int id) {
        return piceService.findById(id);
    }

    @PostMapping("/pice")
    public Pice addPice(@RequestBody Pice pice) {
        return piceService.save(pice);
    }

    @DeleteMapping("/pice/{id}")
    public String removePice(@PathVariable int id) {
        return piceService.deleteById(id);
    }
}
