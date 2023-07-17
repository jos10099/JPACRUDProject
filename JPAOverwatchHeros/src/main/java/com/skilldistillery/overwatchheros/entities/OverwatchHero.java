package com.skilldistillery.overwatchheros.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OverwatchHero {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Column(name = "ultimate_ability")
	private String ultimateAbility;
	private String role;
	private int age;
	private String nationality;
	private String weapon;

	public OverwatchHero() {

	}

	public String getUltimateAbility() {
		return ultimateAbility;
	}

	public void setUltimateAbility(String ultimateAbility) {
		this.ultimateAbility = ultimateAbility;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverwatchHero other = (OverwatchHero) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OverwatchHero [id=").append(id).append(", name=").append(name).append(", ultimateAbility=")
				.append(ultimateAbility).append(", role=").append(role).append(", age=").append(age)
				.append(", nationality=").append(nationality).append(", weapon=").append(weapon).append("]");
		return builder.toString();
	}

}
