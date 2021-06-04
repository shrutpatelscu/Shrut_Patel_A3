
package ass3.mygame2;
/**
 * 
 *
 * @author Shrut Patel
 * @version (29-05-2021)
 */
public class Item
{
    // Initialised the details such as power, names and description.
    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;
   
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
    
    //  DemoItem
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
