package tiffit.realmrpg.data;

public class Character {

	public static enum ClassEnum{
		Rogue,
		Archer,
		Wizard,
		Priest,
		Warrior,
		Knight,
		Paladin,
		Assassin,
		Necromancer,
		Huntress,
		Mystic,
		Trickster,
		Sorcerer,
		Ninja;
	}
	
	public final ClassEnum clss;
	
	public Character(ClassEnum clss) {
		this.clss = clss;
	}

}
