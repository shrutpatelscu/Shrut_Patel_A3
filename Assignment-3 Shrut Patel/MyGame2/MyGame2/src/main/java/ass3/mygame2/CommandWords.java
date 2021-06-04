/**
 * zull game
 * 
 * Command words used in the game- Zull game.
 * 
 *
 * @author  Shrut Patel
 * @version 2016.02.29
 */
package ass3.mygame2;

public class CommandWords
{
    // a constant array that holds all valid command words
    private static final String[] validCommands = {
        "go", "quit", "help", "take", "drop", "use", "inventory", "inspect"
    };

    /**
     * initialise the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if it is, false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
      
        return false;
    }

    /**
     * Print all valid commands to System.out.
     */
    public void showAll() 
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
