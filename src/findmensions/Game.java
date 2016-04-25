package findmensions;

/**
 * Represents a game that can be saved/loaded
 * @author Tiffany Sawyer
 */
public class Game {
    
    final int dimensionSize = 10; // Length of an axis, may make this changable depending on how game goes
            
    private int numberOfPlayers;
    private int numberOfDimensions;
    private int radix; // Assume 10 for now but keep this in mind when developing so it's easy to put in
    
    private String[] players;
    
    private String[] assignedRoles;
    private String[] unassignedRoles;
    
    /**
     * Initialize a game
     */
    public Game() {
        
    }
    
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
    
    /**
     * Whew, could be a doozy of a function
     * Handle a player sending a move command
     * @param p
     * The player doing the move
     * @param move 
     * The move
     * 
     * Can be 1 of 2 things: 
     *   0 to change dimensions
     *   DX to move
     *     Where D is the dimension on which you're moving
     *     and X is the coordinate on that axis
     * @return 
     * Exit code:
     * 0 - Success
     * Other - Failure
     * 666 - Not supported yet
     */
    public int doMove(Player p, String move) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        // Call clojure file to handle this I guess
    }
    
    /**
     * Creates a list of random roles for a game
     * Must include 1 Rick and 1 Jerry
     * Size must be at least 3
     * @param size
     * @return 
     * A list of random roles
     */
    public String[] getRandomListOfRoles(int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Return an unassigned role and mark it
     * as assigned to a player
     * @return 
     * A role
     */
    public Role getRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
