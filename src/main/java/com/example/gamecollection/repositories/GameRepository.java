package com.example.gamecollection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gamecollection.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
