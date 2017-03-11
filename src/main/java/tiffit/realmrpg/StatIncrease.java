package tiffit.realmrpg;

import tiffit.realmrpg.EquippableItem.Stat;

public class StatIncrease {
	private Stat stat;
	private int value;
	
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
