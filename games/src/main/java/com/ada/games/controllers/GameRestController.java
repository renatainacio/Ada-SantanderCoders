package com.ada.games.controllers;

import com.ada.games.model.Game;
import com.ada.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/games")
public class GameRestController {
    @Autowired
    private GameService gameService;

    @PostMapping("/save")
    public Game save(@RequestBody Game game){
        return gameService.save(game);
    }

    @GetMapping("/list")
    public List<Game> getAll()
    {
        return  gameService.findAll();
    }

    @GetMapping("/searchByName/{name}")
    public List<Game> findByName(@PathVariable String name)
    {
        return gameService.findByName(name);
    }
    @GetMapping("/searchByPartialName/{namePart}")
    public List<Game> findByPartialName(@PathVariable String namePart)
    {
        return gameService.findByPartialName(namePart);
    }

    @GetMapping("/searchByPlatform/{platform}")
    public List<Game> findByPlataform(@PathVariable String platform)
    {
        return gameService.findByPlatform(platform);
    }
    @GetMapping("/{id}")
    public Game findById(@PathVariable Long id){
        return gameService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        gameService.deleteById(id);
    }

    @GetMapping("/games")
    public String getAllGames(Model model){
        List<Game> games = gameService.findAll();
        model.addAttribute("games", games);
        return "games";
    }
}
