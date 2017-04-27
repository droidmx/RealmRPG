package tiffit.realmrpg.data;

import tiffit.realmrpg.encounters.Encounter;

public class Character {

	public static enum ClassEnum{
		Rogue(150, 100, 10, 0, 15, 15, 15, 10,
				720, 252, 50, 25, 75, 75, 40, 50,
				20, 2, 0, 0, 1, 1, 0, 0,
				30, 8, 2, 0, 2, 2, 1, 2),
		Archer(130, 100, 12, 0, 12, 12, 12, 10,
				700, 252, 75, 25, 50, 50, 40, 50,
				20, 2, 1, 0, 0, 0, 0, 0,
				30, 8, 2, 0, 2, 2, 1, 2),
		Wizard(100, 100, 12, 0, 10, 15, 12, 12,
				670, 385, 75, 25, 50, 75, 40, 60,
				20, 5, 1, 0, 0, 1, 0, 0,
				30, 15, 2, 0, 2, 2, 1, 2),
		Priest(100, 100, 12, 0, 12, 12, 10, 15,
				670, 385, 50, 25, 55, 55, 40, 75,
				20, 5, 0, 0, 1, 0, 0, 1,
				30, 15, 2, 0, 2, 2, 1, 2),
		Warrior(200, 100, 15, 0, 7, 10, 10, 10,
				770, 252, 75, 25, 50, 50, 75, 70,
				20, 2, 1, 0, 0, 0, 1, 0,
				30, 8, 2, 0, 2, 2, 2, 2),
		Knight(200, 100, 15, 0, 7, 10, 10, 10,
				770, 252, 50, 40, 50, 50, 75, 50,
				20, 2, 1, 0, 0, 0, 1, 0,
				30, 8, 2, 0, 2, 2, 2, 2),
		Paladin(200, 100, 12, 0, 12, 10, 10, 10,
				770, 252, 50, 30, 55, 45, 40, 75,
				20, 2, 1, 0, 0, 0, 0, 1,
				30, 8, 2, 0, 2, 2, 1, 2),
		Assassin(150, 100, 12, 0, 15, 15, 15, 10,
				720, 252, 60, 25, 75, 75, 40, 60,
				20, 2, 0, 0, 1, 1, 0, 1,
				30, 8, 2, 0, 2, 2, 1, 2),
		Necromancer(100, 100, 12, 0, 10, 15, 10, 12,
				670, 385, 75, 25, 50, 60, 30, 75,
				20, 5, 1, 0, 0, 1, 0, 1,
				30, 15, 2, 0, 2, 2, 1, 2),
		Huntress(130, 100, 12, 0, 12, 12, 12, 10,
				700, 252, 75, 25, 50, 50, 40, 50,
				20, 2, 1, 0, 0, 0, 0, 0,
				30, 8, 2, 0, 2, 2, 1, 2),
		Mystic(100, 100, 10, 0, 12, 10, 15, 15,
				670, 385, 60, 25, 60, 55, 40, 75,
				20, 5, 1, 0, 0, 0, 0, 1,
				30, 15, 2, 0, 2, 2, 1, 2),
		Trickster(150, 100, 10, 0, 12, 15, 12, 12,
				720, 252, 65, 25, 75, 75, 40, 60,
				20, 2, 1, 0, 1, 1, 0, 0,
				30, 8, 2, 0, 2, 2, 1, 2),
		Sorcerer(100, 100, 10, 0, 12, 12, 10, 15,
				670, 385, 60, 25, 60, 60, 75, 60,
				20, 5, 1, 0, 1, 0, 1, 1,
				30, 15, 2, 0, 2, 2, 2, 2),
		Ninja(150, 100, 15, 0, 10, 12, 10, 12,
				720, 252, 70, 25, 60, 70, 40, 70,
				20, 2, 1, 0, 0, 1, 0, 1,
				30, 8, 2, 0, 2, 2, 1, 2);
		
		public final int LIFE_START, MANA_START, ATT_START, DEF_START, SPD_START, DEX_START, VIT_START, WIS_START;
		public final int LIFE_MAX, MANA_MAX, ATT_MAX, DEF_MAX, SPD_MAX, DEX_MAX, VIT_MAX, WIS_MAX;
		public final int LIFE_GAIN_MAX, MANA_GAIN_MAX, ATT_GAIN_MAX, DEF_GAIN_MAX,
			SPD_GAIN_MAX, DEX_GAIN_MAX, VIT_GAIN_MAX, WIS_GAIN_MAX;
		public final int LIFE_GAIN_MIN, MANA_GAIN_MIN, ATT_GAIN_MIN, DEF_GAIN_MIN,
			SPD_GAIN_MIN, DEX_GAIN_MIN, VIT_GAIN_MIN, WIS_GAIN_MIN;
		
		private ClassEnum(int l, int m, int a, int d, int s, int x, int v, int w,
				int lx, int mx, int ax, int dx, int sx, int xx, int vx, int wx,
				int ln, int mn, int an, int dn, int sn, int xn, int vn, int wn,
				int lm, int mm, int am, int dm, int sm, int xm, int vm, int wm) {
			this.LIFE_START = l;
			this.MANA_START = m;
			this.ATT_START = a;
			this.DEF_START = d;
			this.SPD_START = s;
			this.DEX_START = x;
			this.VIT_START = v;
			this.WIS_START = w;
			this.LIFE_MAX = lx;
			this.MANA_MAX = mx;
			this.ATT_MAX = ax;
			this.DEF_MAX = dx;
			this.SPD_MAX = sx;
			this.DEX_MAX = xx;
			this.VIT_MAX = vx;
			this.WIS_MAX = wx;
			this.LIFE_GAIN_MAX = lm;
			this.MANA_GAIN_MAX = mm;
			this.ATT_GAIN_MAX = am;
			this.DEF_GAIN_MAX = dm;
			this.SPD_GAIN_MAX = sm;
			this.DEX_GAIN_MAX = xm;
			this.VIT_GAIN_MAX = vm;
			this.WIS_GAIN_MAX = wm;
			this.LIFE_GAIN_MIN = ln;
			this.MANA_GAIN_MIN = mn;
			this.ATT_GAIN_MIN = an;
			this.DEF_GAIN_MIN = dn;
			this.SPD_GAIN_MIN = sn;
			this.DEX_GAIN_MIN = xn;
			this.VIT_GAIN_MIN = vn;
			this.WIS_GAIN_MIN = wn;
		}
	}
	
	public final ClassEnum clss;
	
	public int weapon;
	public int ability;
	public int armor;
	public int ring;
	public int[] inventory = new int[8];
	
	public int level;
	public long exp;
	
	public int hp, mp, att, def, spd, dex, vit, wis;
	
	public Character(ClassEnum clss) {
		this.clss = clss;
		this.exp = 0;
		this.level = Character.getLevelForExp(this.exp);
		this.weapon = 0;
		this.ability = 0;
		this.armor = 0;
		this.ring = 0;
		this.inventory = new int[8];
		this.hp = clss.LIFE_START;
		this.mp = clss.MANA_START;
		this.att = clss.ATT_START;
		this.def = clss.DEF_START;
		this.spd = clss.SPD_START;
		this.dex = clss.DEX_START;
		this.vit = clss.VIT_START;
		this.wis = clss.WIS_START;
	}
	
	public Character(ClassEnum clss, int exp, int weapon, int ability, int armor, int ring, int[] inventory,
			int hp, int mp, int att, int def, int spd, int dex, int vit, int wis) {
		this.clss = clss;
		this.exp = exp;
		this.level = Character.getLevelForExp(this.exp);
		this.weapon = weapon;
		this.ability = ability;
		this.armor = armor;
		this.ring = ring;
		this.inventory = inventory;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.spd = spd;
		this.dex = dex;
		this.vit = vit;
		this.wis = wis;
	}

	public long getExp() {
		return this.exp;
	}
	
	public void gainExp(long e) {
		this.exp += e;
		if (this.level < 20 && this.exp >= Character.totalExpThisLevel(this.level)) {
			this.levelUp();
		}
	}
	
	public void levelUp() {
		if (this.level < 20) {
			this.level++;
			this.hp += (int) (this.clss.LIFE_GAIN_MIN + Math.random()*(this.clss.LIFE_GAIN_MAX-this.clss.LIFE_GAIN_MIN+1));
			this.hp = Math.min(this.hp, this.clss.LIFE_MAX);
			this.mp += (int) (this.clss.MANA_GAIN_MIN + Math.random()*(this.clss.MANA_GAIN_MAX-this.clss.MANA_GAIN_MIN+1));
			this.mp = Math.min(this.mp, this.clss.MANA_MAX);
			this.att += (int) (this.clss.ATT_GAIN_MIN + Math.random()*(this.clss.ATT_GAIN_MAX-this.clss.ATT_GAIN_MIN+1));
			this.att = Math.min(this.att, this.clss.ATT_MAX);
			this.def += (int) (this.clss.DEF_GAIN_MIN + Math.random()*(this.clss.DEF_GAIN_MAX-this.clss.DEF_GAIN_MIN+1));
			this.def = Math.min(this.def, this.clss.DEF_MAX);
			this.spd += (int) (this.clss.SPD_GAIN_MIN + Math.random()*(this.clss.SPD_GAIN_MAX-this.clss.SPD_GAIN_MIN+1));
			this.spd = Math.min(this.spd, this.clss.SPD_MAX);
			this.dex += (int) (this.clss.DEX_GAIN_MIN + Math.random()*(this.clss.DEX_GAIN_MAX-this.clss.DEX_GAIN_MIN+1));
			this.dex = Math.min(this.dex, this.clss.DEX_MAX);
			this.vit += (int) (this.clss.VIT_GAIN_MIN + Math.random()*(this.clss.VIT_GAIN_MAX-this.clss.VIT_GAIN_MIN+1));
			this.vit = Math.min(this.vit, this.clss.VIT_MAX);
			this.wis += (int) (this.clss.WIS_GAIN_MIN + Math.random()*(this.clss.WIS_GAIN_MAX-this.clss.WIS_GAIN_MIN+1));
			this.wis = Math.min(this.wis, this.clss.WIS_MAX);
		}
	}
	
	public static int getLevelForExp(long e) {
		for (int i = 0; i < 20; i++) {
			if (e < Character.totalExpThisLevel(i+1)) {
				return i+1;
			}
		}
		return 20;
	}
	
	public int getExpThisLevel() {
		if (this.level != 20) {
			long tempExp = this.exp;
			for (int i = 0; i < 20; i++) {
				if (tempExp >= Character.expThisLevel(i+1)) {
					tempExp -= Character.expThisLevel(i+1);
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
		return (l >= 20) ? 0 : (l-1)*100 + 50;
	}
	
	public static int totalExpThisLevel(int l) {
		return (l >= 20) ? 0 : (int) (l/2.0 * (100 + (l-1)*100));
	}
	
	
	public void fight(Encounter e) {
		
	}
}
