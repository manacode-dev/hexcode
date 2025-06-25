package com.manacode_dev.hexcode;

public class DisciplineFactory {
	
	public static Discipline createIronveil() {
		return new Discipline(
				"Ironveil",
				5, // Bonus STR
				0, // Bonus DEX
				0, // Bonus INT
				0, // Bonus FOC
				3, // Bonus VIT
				2, // Bonus DEF
				0, // Bonus RES
				"Forged from the geothermal underground heat, the Ironveil cleave and slash their way through turmoil and danger with the hardened resolve of iron and relentless perseverance of moving water in a melee dance. Their strength is not just raw force - it's tempered, focused, and unshakable."
				);
				
	}
	
	public static Discipline createHollowshot() {
		return new Discipline(
				"Hollowshot",
				0, // Bonus STR
				5, // Bonus DEX
				0, // Bonus INT
				0, // Bonus FOC
				2, // Bonus VIT
				0, // Bonus DEF
				3, // Bonus RES
				"Born from the forgotten elevated cities where line of sight is everything, Hollowshots fuse arc-vision implants with ghostcode reflexes to read the battlefield before a blade even swings. Their movements are graceful and lethal, like shadows threaded through a sniper's scope. Every shot is a promise; every blink, a blur between presence and disappearance."
				);
	}
	
	public static Discipline createRuneweaver() {
		return new Discipline(
				"Runeweaver",
				0, // Bonus STR
				0, // Bonus DEX
				5, // Bonus INT
				3, // Bonus FOC
				0, // Bonus VIT
				0, // Bonus DEF
				2, // Bonus RES
				"In the ruins of the old datacrypts, Runeweavers found truth not in books, but in the scripts written between pulses of mana. They code reality with sigils drawn from memory and intuition, bending heat, gravity, and perception to their will. Theirs is a dangerous art - beautiful, volatile, and never fully understood - even by them."
				);
	}

}
