package tiffit.realmrpg.encounters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Encounter {
	
	public String name;
	public Enemy[] enemies;
	
	public static Encounter getData(String name){
		File encounterFolder = new File("./data/encounters");
		encounterFolder.mkdirs();
		File encounterFile = new File(encounterFolder, name + ".json");
		
		if(encounterFile.exists()){
			Gson gson = new GsonBuilder().create();
			try {
				return gson.fromJson(new FileReader(encounterFile), Encounter.class);
			} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}
}
