package com.skilldistillery.overwatchheroes.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.overwatchheroes.entities.OverwatchHero;

class OverwatchHerosTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private OverwatchHero hero;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAOverwatchHeroes");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
	   em = emf.createEntityManager();
	   hero = em.find(OverwatchHero.class, 1);
	   System.out.println("Retrieved hero: " + hero);
	}


	@AfterEach
	void tearDown() throws Exception {
		em.close();
		hero = null;
	}

	@Test
	void test_OverwatchHero_entity_mapping() {
	   assertNotNull(hero);
	   assertEquals("Tracer", hero.getName());
	}


}
