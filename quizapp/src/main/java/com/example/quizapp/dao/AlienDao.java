package com.example.quizapp.dao;

import com.example.quizapp.entity.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienDao  extends JpaRepository<Alien,Integer> {

}
