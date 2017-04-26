package tiffit.realmrpg.encounters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class EnemyData {
	
	public String name;
	public int hp;
	public int def;
	public int exp;
	
	public static EnemyData getData(String name){
		File enemyFolder = new File("./data/enemies");
		enemyFolder.mkdirs();
		File enemyFile = new File(enemyFolder, name + ".json");
		
		if(enemyFile.exists()){
			Gson gson = new GsonBuilder().create();
			try {
				return gson.fromJson(new FileReader(enemyFile), EnemyData.class);
			} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}
	
}
