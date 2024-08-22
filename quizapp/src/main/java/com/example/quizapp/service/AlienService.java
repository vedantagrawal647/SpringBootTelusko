package com.example.quizapp.service;

import com.example.quizapp.dao.AlienDao;
import com.example.quizapp.entity.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlienService implements AlienInterface{

        @Autowired
    private AlienDao alienDao;

    public List<Alien> getAllAlien() {
        List<Alien> allAlien = alienDao.findAll();
        return allAlien;
    }


    public Alien addAliens( Alien a) {
            alienDao.save(a);
            return a;
    }


    public Alien getSingleAlien(int alienId) {
        Alien aa =  alienDao.findById(alienId).orElse(null);
        return aa;
    }


    public Alien updateAlien(Alien a) {
        alienDao.save(a);
        return a;
    }


    public Alien deleteAlien(int alienId) {
        Alien aa = alienDao.findById(alienId).orElse(null);
        alienDao.delete(aa);
        return aa;

    }
}
