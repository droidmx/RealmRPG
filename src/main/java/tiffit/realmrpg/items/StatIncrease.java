package tiffit.realmrpg.items;

public class StatIncrease {
	
	public enum Stat {
		LIFE, MANA, ATT, DEF, SPD, DEX, VIT, WIS;
	}
	
	private final Stat stat;
	private final int value;
	
	public StatIncrease(Stat stat, int value) {
		this.stat = stat;
		this.value = value;
	}

	public Stat getStat() {
		return stat;
	}

	public int getValue() {
		return value;
	}
	
	
}
