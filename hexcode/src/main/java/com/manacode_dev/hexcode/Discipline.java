package com.manacode_dev.hexcode;

public class Discipline {
	
	private String description;
	private String name = "";
	private int level = 0;
	private int exp = 0;
	private int bonusStr;
	private int bonusInt;
	private int bonusDex;
	private int bonusFoc;
	private int bonusVit;
	private int bonusDef;
	private int bonusRes;
	
	public Discipline(String name, int level, int exp, int str, int dex,
			int intellect, int foc, int vit, int def, int res, String description) {
		this.name = name;
		this.level = level;
		this.exp = exp;
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

	public int getLevel() {
		return level;
	}
	
	public void setLevel(int l) {
		this.level = l;
	}
	
	public void gainXP(int amt) {
		this.exp += amt;
	}
	
	public int getXP() {
		return exp;
	}
	
	@Override
	public String toString() {
	    return name + " (Level " + level + ")\n" +
	           "STR+" + bonusStr + ", DEX+" + bonusDex + ", INT+" + bonusInt + ", FOC+" + bonusFoc + "\n" +
	           "VIT+" + bonusVit + ", DEF+" + bonusDef + ", RES+" + bonusRes + "\n\n" +
	           description;
	}
}
