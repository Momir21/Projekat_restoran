package com.example.projekat_restoran.service;

import com.example.projekat_restoran.dao.PiceRepository;
import com.example.projekat_restoran.entity.Pice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiceServiceImpl implements PiceService{

    @Autowired
    private PiceRepository piceRepository;

    @Override
    public List<Pice> findAll(){
        return piceRepository.findAll();
    }

    @Override
    public Pice findById(int id){
        return piceRepository.findById(id).orElse(null);
    }

    @Override
    public Pice save(Pice pice) {
        return piceRepository.save(pice);
    }

    @Override
    public String deleteById(int id){
        Pice pice = findById(id);
        if(pice != null){
            piceRepository.deleteById(id);
            return "Pice sa id-em (" + id + ") je obrisano";
        } else {
            return "Pice sa id-em (" + id + ") nije pronadjeno";
        }
    }
}
