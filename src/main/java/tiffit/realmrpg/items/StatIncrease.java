package tiffit.realmrpg.items;

import java.util.ArrayList;
import java.util.Collections;

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
	
	public static ArrayList<StatIncrease> parse(int[] values) {
		ArrayList<StatIncrease> stats = new ArrayList<StatIncrease>();
		try {
			stats.add((values[0] != 0 ? new StatIncrease(Stat.LIFE, values[0]) : null));
			stats.add((values[1] != 0 ? new StatIncrease(Stat.MANA, values[1]) : null));
			stats.add((values[2] != 0 ? new StatIncrease(Stat.ATT, values[2]) : null));
			stats.add((values[3] != 0 ? new StatIncrease(Stat.DEF, values[3]) : null));
			stats.add((values[4] != 0 ? new StatIncrease(Stat.SPD, values[4]) : null));
			stats.add((values[5] != 0 ? new StatIncrease(Stat.DEX, values[5]) : null));
			stats.add((values[6] != 0 ? new StatIncrease(Stat.VIT, values[6]) : null));
			stats.add((values[7] != 0 ? new StatIncrease(Stat.WIS, values[7]) : null));
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
		stats.removeAll(Collections.singleton(null));
		return stats;
	}
}
