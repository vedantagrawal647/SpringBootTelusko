package com.example.quizapp.controller;

import com.example.quizapp.entity.Alien;
import com.example.quizapp.service.AlienInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    private AlienInterface alienService;

    @GetMapping("/aliens")
    public List<Alien> getAllAlienData(){
        return this.alienService.getAllAlien();
    }

    @GetMapping("/alien/{alienId}")
    public Alien getSingleAlienData(@PathVariable String alienId){
        return this.alienService.getSingleAlien(Integer.parseInt(alienId));
    }

    @PostMapping("/aliens")
    public Alien addAlienData(@RequestBody Alien a) {
        return  this.alienService.addAliens(a);
    }

    @PutMapping("/aliens")
    public Alien addSingleAlienData(@RequestBody Alien a)
    {
     return this.alienService.updateAlien(a);
    }

    @DeleteMapping("/alien/{alienId}")
    public Alien deleteAlienData(@PathVariable("alienId") int alienId) {
        return this.alienService.deleteAlien(alienId);
    }


}
