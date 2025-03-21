
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String name;
    private double price;
    private int itemId;
    
    
    public Item(String itemName, int Id){
        name = itemName;
        itemId = Id;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        String out = "itemID: " + itemId + "  " + name + "  €" + String.format("%.2f", price) + "\n";
        return out;
    }
    



}
