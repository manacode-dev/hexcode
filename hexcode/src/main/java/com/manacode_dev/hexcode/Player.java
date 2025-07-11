package com.manacode_dev.hexcode;

public class Player {
	
	// Basic player attributes
	private String name;
	private int level = 1;
	private int exp = 0;
	private int xpToNextLevel = 100;
	
	// Initialize player class
	private Discipline playerClass;

	// Offensive stats
	private int str = 10;
	private int dex = 10;
	private int intellect = 10;
	private int foc = 10;
	
	// Defensive stats
	private int vit = 10;
	private int def = 20;
	private int res = 5;
	private int hp = 0;
	private int mp = 0;
	
	
	// Constructor of the player class
	public Player(String name, Discipline playerClass) {
		this.name = name;
		this.playerClass = playerClass;

		// Stat bonuses based on class
		applyStartingBonuses();
	}
	
	/*
	 * ===============
	 * Player Info
	 * ===============
	 */
	
	public String getName() {
		return name;
	}
	
	public void showPlayerClass() {
		System.out.println("\n---Current Class---");
		System.out.println("\nClass: " + playerClass.getName());
		System.out.println("\nLevel: " + level);
		System.out.println("\nExp: " + exp);
		System.out.println("\n" + playerClass.toString());
	}
	
	/*
	 * ===============
	 * XP & Leveling
	 * ===============
	 */
	
	public void gainXP(int amt) {
		exp += amt;
		System.out.println("\nGained " + amt + "XP!");
		
		if(exp >= xpToNextLevel) {
			levelUp();
		} else {
			int xpRemaining = xpToNextLevel - exp;
			System.out.println(xpRemaining + " XP needed to reach next level.");
		}
	}
	
	private void levelUp() {
		level++;
		exp = 0; // Resetting XP bar
		xpToNextLevel = (int)Math.ceil(xpToNextLevel * 1.5); // Since we're using an int we want to round up on decimals
		
		System.out.println("\n" + name + " leveled up to Level " + level + "!");
		System.out.println("Next level requires " + xpToNextLevel + " XP.");

		applyLevelUpBonuses();
		showStats();
	}
	
	private void applyStartingBonuses() {
		// Getting starting bonuses from the Disciplines StatBlock set
		StatBlock bonus = playerClass.getStartingBonuses();
		str += bonus.str;
		dex += bonus.dex;
		intellect += bonus.intel;
		foc += bonus.foc;
		vit += bonus.vit;
		def += bonus.def;
		res += bonus.res;
		
		System.out.println("\nStats Increased on Level-Up!");
		showStats();
	}

	private void applyLevelUpBonuses() {

		// Getting level up bonuses from Disciplines' StatBlock set
		StatBlock levelBonus = playerClass.getLevelUpBonuses();

		str += levelBonus.str;
		dex += levelBonus.dex;
		intellect += levelBonus.intel;
		foc += levelBonus.foc;
		vit += levelBonus.vit;
		def += levelBonus.def;
		res += levelBonus.res;

		System.out.println("\nStats Increased on Level-Up!");
		System.out.println("\nBonuses applied: " + levelBonus.toString());
	}
	
	// Getters & setters for external access (if needed)
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int l) {
		this.level = l;
	}
	
	public void setXP(int xp) {
		this.exp = xp;
	}
	
	public int getXP() {
		return exp;
	}
	
	/*
	 * ===============
	 * Stats & Scaling
	 * ===============
	 */
	
	public void showStats() {
		System.out.println("\n-------Player Stats ------");
		System.out.println("\nName: " + name);
		System.out.println("\nClass: " + playerClass.getName());
		System.out.println("\nSTR: " + str + " | DEX: " + dex + " | VIT: " + vit + " | INT: " + intellect + " | FOC: " + foc);
		System.out.println("VIT: " + vit + " | DEF: " + def + " | RES: " + res);
		System.out.println("\nMax HP: " + getMaxHP() + " | Max MP: " + getMaxMP());
		showPowerStats();
	}
	
	public void showPowerStats() {
		
		switch(playerClass.getName().toLowerCase()) {
		case "ironveil" -> System.out.println("Melee Power: " + getMeleePower());
		case "hollowshot" -> System.out.println("Ranged Power: " + getRangedPower());
		case "runeweaver" -> System.out.println("Magic Power: " + getMagicPower());
		default -> System.out.println("Power stats unavailable");
		}
		
	}
	
	public int getMaxHP() {
		return hp + (vit * 10); // Vitality increases HP pool
	}
	
	public int getMaxMP() {
		return mp + (foc * 5); // Focus increases MP pool
	}
	
	public int getMeleePower() {
		return str * 2;
	}
	
	public int getRangedPower() {
		return dex * 2;
	}
	
	public int getMagicPower() {
		return intellect * 2;
	}
	
}
