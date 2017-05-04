package tiffit.realmrpg.items;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public abstract class Item {
    
    public final String type;
    public final String name;
    public final int id;
    public final String description;
    
    public final int minDamage, maxDamage;
    public final int shots;
    public final ArrayList<StatIncrease> stats;
    
    public Item(String name, int id, String description) {
        this("item", name, id, description, 0, 0, 0, new int[8]);
    }
    
    public Item(String type, String name, int id, String description,
    		int shots, int minDmg, int maxDmg, int[] stats) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.description = description;
        this.shots = shots;
        this.minDamage = minDmg;
        this.maxDamage = maxDmg;
        this.stats = StatIncrease.parse(stats);
    }
    
	public static Item getData(int id){
		File itemFolder = new File("./data/items");
		itemFolder.mkdirs();
		File itemFile = new File(itemFolder, id + ".json");
		
		if(itemFile.exists()){
			Gson gson = new GsonBuilder().create();
			try {
				return gson.fromJson(new FileReader(itemFile), Item.class);
			} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		} return null;
	}
    
}