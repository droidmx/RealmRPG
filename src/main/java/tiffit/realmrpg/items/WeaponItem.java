package tiffit.realmrpg.items;

public class WeaponItem extends EquippableItem {
	
	private double dps;
	
	public WeaponItem(String name, int id, String description, int fameBonus, int[] stats, double dps) {
		super("weapon", name, id, description, fameBonus, stats);
		this.dps = dps;
	}
}
