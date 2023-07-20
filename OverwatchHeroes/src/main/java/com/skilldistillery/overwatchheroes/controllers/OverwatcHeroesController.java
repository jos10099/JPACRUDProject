package com.skilldistillery.overwatchheroes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class OverwatcHeroesController {
	
	
	
	
	@RequestMapping(path= {"/" , "home.do"})
	public String goHome(Model model) {
		return "home";
	}

}
