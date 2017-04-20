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
	
	public int exp;
	
	public Character(ClassEnum clss, int exp) {
		this.clss = clss;
		this.exp = exp;
	}
	
	public int getExp() {
		return this.exp;
	}
	
	public int getLevel() {
		int levelExp = 0;
		for (int i = 0; i < 20; i++) {
			levelExp += i*100 + 50;
			if (this.exp < levelExp) {
				return i+1;
			}
		}
		return 20;
	}
}
