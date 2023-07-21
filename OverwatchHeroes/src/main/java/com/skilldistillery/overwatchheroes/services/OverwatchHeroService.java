package com.skilldistillery.overwatchheroes.services;

import java.util.List;
import com.skilldistillery.overwatchheroes.entities.OverwatchHero;

public interface OverwatchHeroService {
    OverwatchHero findById(int id);
    List<OverwatchHero> findAll();
    OverwatchHero create(OverwatchHero overwatchHero);
    OverwatchHero update(OverwatchHero overwatchHero);
    boolean delete(int id);
    

}
