package tiffit.realmrpg.items;

public class Item {
    
    private final String type;
    private final String name;
    private final int id;
    private final String description;
    
    public Item(String name, int id, String description) {
        this("item", name, id, description);
    }
    
    public Item(String type, String name, int id, String description) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.description = description;
    }
    
    public String getType() { return type; }
    public String getName() { return name; }

}