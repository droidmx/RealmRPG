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
	
	public long exp;
	
	public Character(ClassEnum clss, int exp) {
		this.clss = clss;
		this.exp = exp;
	}
	
	public long getExp() {
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
	
	public int getExpThisLevel() {
		if (this.getLevel() != 20) {
			long tempExp = this.exp;
			for (int i = 0; i < 20; i++) {
				if (tempExp > 50 + i*100) {
					tempExp -= 50 + i*100;
				} else {
					return (int) tempExp;
				}
			}
		} return 0;
	}
	
	public int getFame() {
		if (this.exp <= 20000) {
			return (int) (this.exp/2000);
		} else if (this.exp <= 45000) {
			return (int) (20 + (this.exp-20000)/500);
		} else if (this.exp <= 45400) {
			return (int) (70 + (this.exp-45000)/400);
		} else if (this.exp <= 79734) {
			return (int) (71 + (this.exp-45400)*1000/3);
		} else if (this.exp <= 80100) {
			return (int) (174 + (this.exp-79734)/366);
		} else if (this.exp <= 101100) {
			return (int) (175 + (this.exp-80100)/500);
		} else if (this.exp <= 102800) {
			return (int) (217 + (this.exp-101100)/1700);
		} else {
			return (int) (218 + (this.exp-102800)/2000);
		}
	}
	
	public static int expThisLevel(int l) {
		return (l-1)*100 + 50;
	}
}
