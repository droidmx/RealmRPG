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
	public int equip;
	public int ability;
	public int armor;
	public int ring;
	public int[] inventory = new int[8];
	
	public Character(ClassEnum clss) {
		this.clss = clss;
	}

}
