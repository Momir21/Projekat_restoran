package com.example.projekat_restoran.service;

import com.example.projekat_restoran.dao.ZaliheRepository;
import com.example.projekat_restoran.entity.Zalihe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZaliheServiceOmpl implements ZaligeService {

    @Autowired
    private ZaliheRepository zaliheRepository;

    @Override
    public List<Zalihe> findAll(){
        return zaliheRepository.findAll();
    }

    @Override
    public Zalihe findById(int id) {
        return zaliheRepository.findById(id).orElse(null);
    }

    @Override
    public Zalihe save(Zalihe zalihe) {
        return zaliheRepository.save(zalihe);
    }

    @Override
    public String deleteById(int id) {
        Zalihe zalihe = findById(id);
        if(zalihe != null) {
            zaliheRepository.deleteById(id);
            return "Zalihe sa id-em (" + id + ") su obrisane";
        } else {
            return "Zalihe sa id-em (" + id + ") nisu pronadjene";
        }
    }
}
