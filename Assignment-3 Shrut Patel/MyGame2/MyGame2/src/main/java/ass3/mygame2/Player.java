package ass3.mygame2;


import java.util.ArrayList;


/**
 * Player class is used to Add and remove items from the inventory
 *
 * @author Shrut Patel
 * @version 29-05-2021
 */
public class Player
{
    
    private ArrayList<Item> playerItem;
    
    public Player()
    {
        playerItem = new ArrayList();
    }
    
    /**
    * Remove items from the inventory and add items to the inventory.
    *
    * @param ()
    * @return (29-05-2021)
    * @exception (29-05-2021)
    * @see (29-05-2021)
    */
    
    public void addItemInventory(Item item){
        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
        
    }

    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    
    //public void AddDemo(Item item){
    // playerItem.remove(item);   
    //}
    
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    public String printAllInventory(){

        String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    
}
