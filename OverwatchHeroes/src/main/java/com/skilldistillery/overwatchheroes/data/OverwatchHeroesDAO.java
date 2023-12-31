package com.skilldistillery.overwatchheroes.data;

import java.util.List;
import com.skilldistillery.overwatchheroes.entities.OverwatchHero;

public interface OverwatchHeroesDAO {

    OverwatchHero findById(int id);

    List<OverwatchHero> findAll();

    OverwatchHero create(OverwatchHero overwatchHero);

    OverwatchHero update(OverwatchHero overwatchHero);

    boolean delete(int id);
}
