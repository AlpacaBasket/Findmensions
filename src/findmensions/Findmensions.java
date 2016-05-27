package findmensions;

import TestClasses.PremadeGame;
import findmensions.GUI.DebugClient;
import javax.swing.JFrame;

/*
TODO: Lots

Finish all roles
Create middleware between player client and game server
Separate client/server/middleware into different applications to be distributed among devices
*/

/**
 *
 * @author Tiffany Sawyer
 */
public class Findmensions {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DebugClient client = new DebugClient();
        client.addGame(new PremadeGame());
        client.begin();
        
        frame.add(client);
        
        frame.setVisible(true);
        
    }

}
