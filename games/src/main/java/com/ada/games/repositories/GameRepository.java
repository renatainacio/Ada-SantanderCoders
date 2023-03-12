package com.ada.games.repositories;

import com.ada.games.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByName(String name);
    List<Game> findByNameContaining(String namePart);
    List<Game> findByPlatformsContains(String platform);

}
