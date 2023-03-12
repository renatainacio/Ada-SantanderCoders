package com.ada.games.controllers;

import com.ada.games.model.Game;
import com.ada.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@Controller
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping("/games")
    public String getAllGames(Model model){
        List<Game> games = gameService.findAll();
        model.addAttribute("games", games);
        return "games";
    }

    @PostMapping("/games")
    public String addGame(@RequestParam("name") String name,
                          @RequestParam("developer") String developer,
                          @RequestParam("publisher") String publisher,
                          @RequestParam("platforms") String platforms,
                          @RequestParam("genre") String genre,
                          @RequestParam("score") String score)
    {
        Game game = new Game();
        game.setName(name);
        game.setDeveloper(developer);
        game.setPublisher(publisher);
        game.setPlatforms(Stream.of(platforms.split(",")).toList());
        game.setGenre(Stream.of(genre.split(",")).toList());
        game.setScore(Double.valueOf(score));
        gameService.save(game);
        return "redirect:games";
    }

    @GetMapping("add-game")
        public String createGame(){
            return "add-game";
    }

    @PostMapping("/games/delete/{id}")
    public String deleteGame(@PathVariable("id") Long id) {
        gameService.deleteById(id);
        return "redirect:/games/games";
    }

    @PostMapping("/search")
    public String searchFor(@RequestParam("namePart") String namePart, Model model){
        List<Game> games = gameService.findByPartialName(namePart);
        model.addAttribute("games", games);
        return "games";
    }



}
