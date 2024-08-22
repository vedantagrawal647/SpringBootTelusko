package com.example.quizapp.service;

import com.example.quizapp.entity.Alien;

import java.util.List;

public interface AlienInterface {

    public List<Alien> getAllAlien();
    public Alien addAliens(Alien a);

    public Alien getSingleAlien(int alienId);

    public Alien updateAlien(Alien a);

    public Alien deleteAlien(int alienId);


}
