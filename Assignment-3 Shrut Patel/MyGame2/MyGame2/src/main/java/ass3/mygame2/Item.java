
package ass3.mygame2;
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;
   // A demo item is to be created. It will be accessibile privately
    private String DemoItem;
    
    public Item(String name, String description, int destructivePower)
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }
    
    public Item(String name, String description, double healingPower)
    {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }
    
    // Comment for Method for DemoItem
    //public Item(String name, String description, String DemoItem)
    //{
     // this.name = name;
       // this.description = description;
      //  this.DemoItem = DemoItem;
    //}
    
    
    
    //write accessors and mutators
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    //Return Type
    public String DemoItem(){
        return DemoItem;
    }
    
    
    /**
     * 
     *  
     */
    public int getPower(){
        return destructivePower;

    }
}
