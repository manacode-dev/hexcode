package com.manacode_dev.hexcode;

public class Discipline {
	
	private String description = "";
	private String name = "";
	private StatBlock startingBonuses = null;
	private StatBlock levelUpBonuses = null;
	
	public Discipline(String name, StatBlock startingBonuses, StatBlock levelUpBonuses, String description) {
		this.name = name;
		this.startingBonuses = startingBonuses;
		this.levelUpBonuses = levelUpBonuses;
		this.description = description;
	}
	
	// Setters and getters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	/*
	 * ==================
	 * Stat bonus getters
	 * ==================
	 */
	
	public StatBlock getStartingBonuses () {
		return startingBonuses;
	}

	public StatBlock getLevelUpBonuses() {
		return levelUpBonuses;
	}
	
	@Override
	public String toString() {
		return name + " \n" +
				"Starting Bonuses → " + (startingBonuses != null ? startingBonuses.toString() : "N/A") + "\n" +
				"Level-Up Bonuses → " + (levelUpBonuses != null ? levelUpBonuses.toString() : "N/A")+ "\n\n" +
				description;
	}
}
