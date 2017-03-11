package tiffit.realmrpg;

import java.util.ArrayList;

public class EquippableItem extends Item {
	
	public enum Stat {
		LIFE, MANA, ATT, DEF, SPD, DEX, VIT, WIS;
	}
	
	private ArrayList<StatIncrease> stats;
	
	public EquippableItem(String name, int id, String[] args) {
		super("equip", name, id, args);
	}
	
}
