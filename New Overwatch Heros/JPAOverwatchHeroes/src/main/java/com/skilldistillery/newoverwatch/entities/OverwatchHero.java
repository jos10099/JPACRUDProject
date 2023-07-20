package com.skilldistillery.newoverwatch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "overwatch_heros")
public class OverwatchHero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@Column(name = "image_url")
	private String imageUrl;
	private int age;
	private String nationality;
	private String role;
	private String weapon;
	@Column(name = "ultimate_ability")
	private String ultimateability;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getUltimateability() {
		return ultimateability;
	}

	public void setUltimateability(String ultimateability) {
		this.ultimateability = ultimateability;
	}

	@Override
	public String toString() {
		return "OverwatchHeros [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", age=" + age
				+ ", nationality=" + nationality + ", role=" + role + ", weapon=" + weapon + ", ultimateability="
				+ ultimateability + "]";
	}

}
