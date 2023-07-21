package com.skilldistillery.overwatchheroes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.overwatchheroes.data.OverwatchHeroesDAO;
import com.skilldistillery.overwatchheroes.entities.OverwatchHero;

@Controller
@RequestMapping(path = { "/", "home.do" })
public class OverwatchHeroController {

	@Autowired
	private OverwatchHeroesDAO overwatchHeroesDAO;

	@GetMapping("/{id}")
	public String findById(@PathVariable int id, Model model) {
		OverwatchHero hero = overwatchHeroesDAO.findById(id);
		model.addAttribute("hero", hero);
		return "hero/show";
	}

	@GetMapping
	public String findAll(Model model) {
		List<OverwatchHero> heroes = overwatchHeroesDAO.findAll();
		model.addAttribute("heroes", heroes);
		return "hero/index";
	}

	@PostMapping
	public String create(@RequestBody OverwatchHero overwatchHero) {
		OverwatchHero newHero = overwatchHeroesDAO.create(overwatchHero);
		return "redirect:/api/heroes/" + newHero.getId();
	}

	@PutMapping("/{id}")
	public String update(@PathVariable int id, @RequestBody OverwatchHero overwatchHero) {
		OverwatchHero updatedHero = overwatchHeroesDAO.update(overwatchHero);
		if (updatedHero != null) {
			return "redirect:/api/heroes/" + updatedHero.getId();
		} else {
			return "hero/notfound";
		}
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		boolean deleted = overwatchHeroesDAO.delete(id);
		if (deleted) {
			return "redirect:/api/heroes";
		} else {
			return "hero/notfound";
		}
	}
}
