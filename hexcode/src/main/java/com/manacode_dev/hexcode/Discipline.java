package com.manacode_dev.hexcode;

public class Discipline {
	
	private String description;
	private String name = "";
	private int bonusStr;
	private int bonusInt;
	private int bonusDex;
	private int bonusFoc;
	private int bonusVit;
	private int bonusDef;
	private int bonusRes;
	
	public Discipline(String name, int str, int dex,
			int intellect, int foc, int vit, int def, int res, String description) {
		this.name = name;
		this.bonusStr = str;
		this.bonusDex = dex;
		this.bonusInt = intellect;
		this.bonusFoc = foc;
		this.bonusVit = vit;
		this.bonusDef = def;
		this.bonusRes = res;
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
	
	public int getBonusStr() {
		return bonusStr;
	}
	
	public int getBonusDex() {
		return bonusDex;
	}
	
	public int getBonusInt() {
		return bonusInt;
	}
	
	public int getBonusFoc() {
		return bonusFoc;
	}
	
	public int getBonusVit() {
		return bonusVit;
	}
	
	public int getBonusDef() {
		return bonusDef;
	}
	
	public int getBonusRes() {
		return bonusRes;
	}
	
	@Override
	public String toString() {
	    return name + " \n" +
	           "Bonus STR: " + bonusStr + ", Bonus DEX: " + bonusDex + ", Bonus INT: " + bonusInt + ", Bonus FOC: " + bonusFoc + "\n" +
	           "Bonus VIT: " + bonusVit + ", Bonus DEF: " + bonusDef + ", Bonus RES: " + bonusRes + "\n\n" +
	           description;
	}
}
