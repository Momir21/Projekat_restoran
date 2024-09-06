package com.example.projekat_restoran.controller;

import com.example.projekat_restoran.entity.Zalihe;
import com.example.projekat_restoran.service.ZaligeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zalihe")
public class ZaliheController {

    @Autowired
    private ZaligeService zaligeService;

    @GetMapping("/zalihe")
    public List<Zalihe> findAll() {
        return zaligeService.findAll();
    }

    @GetMapping("/zalihe/{id}")
    public Zalihe findById(int id) {
        return zaligeService.findById(id);
    }

    @PostMapping("/zalihe")
    public Zalihe addZalihe(@RequestBody Zalihe zalihe) {
        return zaligeService.save(zalihe);
    }

    @DeleteMapping("/zalihe/{id}")
    public String remoceZalihe(@PathVariable int id) {
        return zaligeService.deleteById(id);
    }
}
