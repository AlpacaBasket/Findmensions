package TestClasses;

import findmensions.*;
import findmensions.Roles.*;
import java.util.ArrayList;

/**
 * A pre-made Game object used for test purposes
 * @author Tiffany Sawyer
 */
public class PremadeGame extends Game {

    /**
     * Constructs a game in a pre-made state for
     * test purposes. 
     */
    public PremadeGame () {
        super();
        
        this.stateOfGame = GameState.INPROGRESS;
        this.players = new ArrayList<>();
        this.numberOfPlayers = 4;
        this.numberOfDimensions = 5;
        this.radix = 10;
    }
    
    /**
     * Make the first pre-designed test game
     * This is to be called by a test to set up
     * the first debug game environment. This game
     * is the same as the default one made by the
     * constructor
     */
    public void setupTestGame1() {
        
        // Set up array of 5 coordinates
        int[] coord = new int[]{0, 0, 0, 0, 0};
        
        Role role1 = new Rick();
        Role role2 = new Jerry();
        Role role3 = new Morty();
        Role role4 = new Squanchy();
        
        // All players start at 00000 for this test
        this.addPlayer(new Player(coord, role1));
        this.addPlayer(new Player(coord, role2));
        this.addPlayer(new Player(coord, role3));
        this.addPlayer(new Player(coord, role4));
        
    }
    
    // Etc, however many environments there are
    
}
