package ass3.mygame2;

import java.util.ArrayList;


/**
 * This class is used to create items used in the game.
 * an item is added in this class.
 * 
 * @author Shrut Patel
 * @version 29-05-2021
 */
public class ItemCreation
{
    
    private ArrayList<Item> allItemsInGame;
    
    public ItemCreation()
    {       
        allItemsInGame = new ArrayList();
        createItems();
    }
    // Method to create Items that is DemoItem
    
    public void createItems(){
        
        Item item1, item2, excaliburSword, key, frontGateKey,demoItem;
        
        
        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        // adding demoItem
        demoItem = new Item("demoItem", "Hie this is a demo code", 100);
        
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
        // adding demoItem
        allItemsInGame.add(demoItem);
    }
   
    public Item getItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: allItemsInGame){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        
       // Returning Return type
        return itemToReturn;
    }
  
    
}
