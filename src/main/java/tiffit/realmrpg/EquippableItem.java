package tiffit.realmrpg;

public class EquippableItem extends Item {
	
	public enum Stat {
		LIFE, MANA, ATT, DEF, SPD, DEX, VIT, WIS;
	}
	
	public EquippableItem(String name, int id, String[] args) {
		super("equip", name, id, args);
	}
}
