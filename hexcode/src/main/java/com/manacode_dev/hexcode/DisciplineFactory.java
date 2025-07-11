package com.manacode_dev.hexcode;

public class DisciplineFactory {
	
	public static Discipline createIronveil() {

		// Bonus stats in a StatBlock class
		StatBlock starting = new StatBlock(5, 0, 0, 0, 3, 2, 0);
		StatBlock levelUp = new StatBlock(2, 0, 0, 0, 1, 1, 0);

		return new Discipline(
				"Ironveil",
				starting,
				levelUp,
				"Forged from the geothermal underground heat, the Ironveil cleave and slash their way through turmoil and danger with the hardened resolve of iron and relentless perseverance of moving water in a melee dance. Their strength is not just raw force - it's tempered, focused, and unshakable."
				);
				
	}
	
	public static Discipline createHollowshot() {

		// Bonus stats in a StatBlock class
		StatBlock starting = new StatBlock(0, 5, 0, 0, 2, 0, 3);
		StatBlock levelUp = new StatBlock(0, 2, 0, 0, 1, 0, 1);

		return new Discipline(
				"Hollowshot",
				starting,
				levelUp,
				"Born from the forgotten elevated cities where line of sight is everything, Hollowshots fuse arc-vision implants with ghostcode reflexes to read the battlefield before a blade even swings. Their movements are graceful and lethal, like shadows threaded through a sniper's scope. Every shot is a promise; every blink, a blur between presence and disappearance."
				);
	}
	
	public static Discipline createRuneweaver() {

		// Bonus stats in a StatBlock class
		StatBlock starting = new StatBlock(0, 0, 5, 3, 0, 0, 2);
		StatBlock levelUp = new StatBlock(0, 0, 2, 1, 0, 0, 1);

		return new Discipline(
				"Runeweaver",
				starting,
				levelUp,
				"In the ruins of the old datacrypts, Runeweavers found truth not in books, but in the scripts written between pulses of mana. They code reality with sigils drawn from memory and intuition, bending heat, gravity, and perception to their will. Theirs is a dangerous art - beautiful, volatile, and never fully understood - even by them."
				);
	}

}
