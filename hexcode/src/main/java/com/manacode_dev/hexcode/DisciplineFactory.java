package com.manacode_dev.hexcode;

import java.util.HashMap;
import java.util.Map;

/**
 * NOTE: USE FOR CONSTRUCTION
 * 
 * public Discipline(String name, int level, int exp, int str, int dex,
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
 * 
 * IRONVEIL:
 *  STR: 5
 *  VIT: 2
 *  DEF: 3
 *  
 * HOLLOWSHOT:
 *  DEX: 5
 *  FOC: 3
 *  RES: 2
 *  
 *  RUNEWEAVER:
 *   INT: 5
 *   FOC: 3
 *   RES: 3
 */


public class DisciplineFactory {
	
	public static Map<String, Discipline> createDefaults() {
		Map<String, Discipline> map = new HashMap<>();
		
		// Ironveil construction
		map.put("Ironveil", new Discipline(
				"Ironveil",
				1,
				0,
				5, 0, 0, 0, 3, 2, 0,
				"Forged from the geothermal underground heat, the Ironveil cleave and slash their way through turmoil and danger with the hardened resolve of iron and relentless perseverance of moving water in a melee dance. Their strength is not just raw force - it's tempered, focused, and unshakable."
				));
		
		// Hollowshot construction
		map.put("Hollowshot", new Discipline(
				"Hollowshot",
				1,
				0,
				0, 5, 0, 3, 0, 0, 2,
				"Born from the forgotten elevated cities where line of sight is everything, Hollowshots fuse arc-vision implants with ghostcode reflexes to read the battlefield before a blade even swings. Their movements are graceful and lethal, like shadows threaded through a sniper's scope. Every shot is a promise; every blink, a blur between presence and disappearance."
				));
		
		// Runeweaver construction
		map.put("Runeweaver", new Discipline(
				"Runeweaver",
				1,
				0,
				0, 0, 5, 3, 0, 0, 3,
				"In the ruins of the old datacrypts, Runeweavers found truth not in books, but in the scripts written between pulses of mana. They code reality with sigils drawn from memory and intuition, bending heat, gravity, and perception to their will. Theirs is a dangerous art - beautiful, volatile, and never fully understood - even by them."
				));
		
		return map;
	}
	

}
