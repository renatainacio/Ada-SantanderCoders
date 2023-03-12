package com.ada.games.services;

import com.ada.games.model.Game;
import com.ada.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Game save(Game game){
        return gameRepository.save(game);
    }
    public List<Game> findAll(){
        return gameRepository.findAll();
    }

    public List<Game> findByName(String name) {
        return gameRepository.findByName(name);
    }

    public List<Game> findByPartialName(String namePart) {
        return gameRepository.findByNameContaining(namePart);
    }

    public List<Game> findByPlatform(String platform) {
        return gameRepository.findByPlatformsContains(platform);
    }

    public Game findById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        gameRepository.deleteById(id);
    }

}
