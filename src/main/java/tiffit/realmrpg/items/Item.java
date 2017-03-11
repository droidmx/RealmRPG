package tiffit.realmrpg.items;

public class Item {
    
    private String type;
    private String name;
    private int id;
    private String description;
    
    public Item(String name, int id, String[] args) {
        this.type = "item";
        this.name = name;
        this.id = id;
    }
    
    public Item(String type, String name, int id, String[] args) {
        this.type = type;
        this.name = name;
        this.id = id;
    }
    
    public String getType() { return type; };
    public String getName() { return name; };

}