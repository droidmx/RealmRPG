package tiffit.realmrpg.items;

public class StatIncrease {
	
	public enum Stat {
		LIFE, MANA, ATT, DEF, SPD, DEX, VIT, WIS;
	}
	
	private Stat stat;
	private int value;
	
	public StatIncrease(Stat stat, int value) {
		this.stat = stat;
	}

	public Stat getStat() {
		return stat;
	}

	public int getValue() {
		return value;
	}
	
	
}
