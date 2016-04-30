package findmensions.GUI;

import findmensions.*;

/**
 * A client can create a player and can receive a player with a role and make moves as that player
 * @author Tiffany Sawyer
 */
public interface Client {
    
    public void receiveMessage(String s); // Game gives client a message
    
    public void receivePlayer(Player p); // Game gives client a player object
    
    public void doMove(String m); // Send move to game
    
    public void rickAttack();
    
    public void addGame(Game g); // Add reference to game client is part of

}
