package tiffit.realmrpg;

public class Item {
	
	private String type;
	private String name;
	private int id;
	private String description;
	
	public Item(String name, int id, String[] args) {
		this.type = "item";
		this.id = id;
		this.name = name;
	}
	
	public Item(String type, String name, int id, String[] args) {
		this.type = type;
		this.id = id;
		this.name = name;
	}
	
	public String getType() { return type; };
	public String getName() { return name; };

}
