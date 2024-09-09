package com.projekat.Projekat.nit;

import com.projekat.Projekat.dao.ZalihaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component

public class ZalihaNit {

    @Autowired
    private ZalihaRepository zalihaRepository;

    @Scheduled(fixedRate = 60000) // Svakih 60 sekundi
    public void proveriStanjeZaliha() {
        zalihaRepository.findAll().forEach(zaliha -> {
            if (zaliha.getKolicina() < 20) {
                try (FileWriter writer = new FileWriter("obavestenja.txt", true)) {
                    writer.write("Niske zalihe za: " + zaliha.getNaziv() );
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

