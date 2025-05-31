package com.manacode_dev.hexcode;

import java.util.Map;
import java.util.HashMap;

public class Player {
	
	// Basic player attributes
	private String name = "";
	//private int level = 0;
	private Map<String, Discipline> disciplines = new HashMap<>();
	private Discipline currentDiscipline;

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
	
	
	
	/*
	 * Adding player mechanics for:
	 *   Discipline
	 *   EXP
	 *   Leveling
	 *   Stat scaling
	 */
	
	/*
	 * ===============
	 * Discipline
	 * ===============
	 */
	public void addDiscipline(Discipline d) {
		if (!disciplines.containsKey(d.getName())) {
			disciplines.put(d.getName(), d);
		} else {
			System.out.println("Discipline '" + d.getName() + "' already exists.");
		}
		
	}
	
	public void switchDisciplines(String name) {
		if(disciplines.containsKey(name)) {
			currentDiscipline = disciplines.get(name);
			System.out.println("Switched to '" + name + "' discipline");
			System.out.println("Discipline: " + name + "\n Level " + currentDiscipline.getLevel());
		} else {
			System.out.println("Discipline '" + name + "' not found.");
		}
	}
	
	public void showDisciplines() {
		for (String name : disciplines.keySet()) {
			Discipline d = disciplines.get(name);
			System.out.println("Discipline: " + name + " | Level: " + d.getLevel() + " | XP: " + d.getXP());
			System.out.println("--------------");
			if (currentDiscipline != null) {
				System.out.println("\nCurrently Equipped: " + currentDiscipline.getName() + 
									" (Level: " + currentDiscipline.getLevel() + 
									", XP: " + currentDiscipline.getXP() + ")");
			} else {
				System.out.println("\nNo discipline currently equipped.");
			}
		}
	}
	
	public int getTotalDisciplineLevel() {
		int total = 0;
		for (Discipline d : disciplines.values()) {
			total += d.getLevel();
		}
		
		return total;
	}
	
	/*
	 * ===============
	 * XP
	 * ===============
	 */
	
	public void gainXP(int amt) {
		currentDiscipline.gainXP(amt);
	}
	
	/*
	 * ===============
	 * Stats & Scaling
	 * ===============
	 */
	
	public void showStats() {
		System.out.println("\n-------Player Stats ------");
		System.out.println("STR: " + str + " | DEX: " + dex + " | VIT: " + vit + " | INT: " + intellect + " | FOC: " + foc);
		System.out.println("VIT: " + vit + " | DEF: " + def + " | RES: " + res);
		System.out.println("HP: " + getMaxHP() + " | MP: " + getMaxMP());
		System.out.println("Melee Power: " + getMeleePower() + 
							" | Ranged Power: " + getRangedPower() + 
							" | Magic Power: " + getMagicPower());
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
