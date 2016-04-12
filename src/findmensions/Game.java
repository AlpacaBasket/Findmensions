package findmensions;

/**
 * Represents a game that can be saved/loaded and works as a nifty pointer
 * @author Tiffany Sawyer
 */
public class Game {
    
    final int dimensionSize = 10; // May make this changable depending on how game goes
            
    private int numberOfPlayers;
    private int numberOfDimensions;
    private int radix;
    
    public void showMessage(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void RickWins() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void AntiRickTeamWins() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void RickAttack(int dimension, Player attacker) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        // Check if attacker has a meeseeks
        // If so, iterate through player list
          // If coordinate of a player matches Rick's on the chosen dimension
          // then call hitByRick() on that player
          // Don't hurt attacker (can either be Rick or evil Rick)
    }

    public void EvilRickWins() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
