package com.example.gamecollection.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.gamecollection.dto.GameMinDTO;
import com.example.gamecollection.entities.Game;
import com.example.gamecollection.repositories.GameRepository;

@Service
public class GameService {

    private final GameRepository gameRepository;

    GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDTO> findAll() {
        List<Game> list = gameRepository.findAll();
        return list.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
