package tiffit.realmrpg.items;

import java.util.ArrayList;

public class EquippableItem extends Item {
	
	private ArrayList<StatIncrease> stats;
	private int fameBonus;
	
	public EquippableItem(String name, int id, String description, int fameBonus, int[] stats) {
		super("equip", name, id, description);
		this.fameBonus = fameBonus;
		this.stats = StatIncrease.parse(stats);
	}
	
	public EquippableItem(String type, String name, int id, String description, int fameBonus, int[] stats) {
		super(type, name, id, description);
		this.fameBonus = fameBonus;
		this.stats = StatIncrease.parse(stats);
	}
}
