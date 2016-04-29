package findmensions.GUI;

import findmensions.Game;
import findmensions.Player;
import javax.swing.JPanel;

/**
 * Class used as a server and client to create a game and play as a debugger
 * @author Tiffany Sawyer
 */
public class DebugClient extends JPanel implements Client {
    
    public DebugClient() {
        
    }

    @Override
    public void receiveMessage(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void receivePlayer(Player p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doMove(String m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addGame(Game g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}