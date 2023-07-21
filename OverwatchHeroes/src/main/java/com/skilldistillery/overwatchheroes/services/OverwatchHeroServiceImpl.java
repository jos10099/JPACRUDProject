package com.skilldistillery.overwatchheroes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.overwatchheroes.data.OverwatchHeroesDAO;
import com.skilldistillery.overwatchheroes.entities.OverwatchHero;

@Service
public class OverwatchHeroServiceImpl implements OverwatchHeroService {
    
    @Autowired
    private OverwatchHeroesDAO overwatchHeroesDAO;

    @Override
    public OverwatchHero findById(int id) {
        return overwatchHeroesDAO.findById(id);
    }

    @Override
    public List<OverwatchHero> findAll() {
        return overwatchHeroesDAO.findAll();
    }

    @Override
    public OverwatchHero create(OverwatchHero overwatchHero) {
        return overwatchHeroesDAO.create(overwatchHero);
    }

    @Override
    public OverwatchHero update(OverwatchHero overwatchHero) {
        return overwatchHeroesDAO.update(overwatchHero);
    }

    @Override
    public boolean delete(int id) {
        return overwatchHeroesDAO.delete(id);
    }
}
