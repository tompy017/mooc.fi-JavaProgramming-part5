
/**
 *
 * @author tom
 */
public class Item {
    private String identifier;
    private String name;
    
    //constructor
    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        String formattedName = this.identifier + ": " + this.name;
        return formattedName;
    }
    
    @Override
    public boolean equals(Object toCompare) {
        
        if (this == toCompare) {
            return true;
        }
        
        if (!(toCompare instanceof Item)) {
            return false;
        }
        
        Item newItem = (Item) toCompare;
        if (this.identifier.equals(newItem.identifier)) {
            return true;
        }
        
        return false;
    }
    
}
