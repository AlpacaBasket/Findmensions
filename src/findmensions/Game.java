package findmensions;

import java.util.ArrayList;

/**
 * Represents a game that can be saved/loaded
 * @author Tiffany Sawyer
 */
public class Game {
    
    private int dimensionSize = 10; // Length of an axis, may make this changable depending on how game goes
            
    private int numberOfPlayers;
    private int numberOfDimensions;
    private int radix; // Assume 10 for now but keep this in mind when developing so it's easy to put in
    
    private ArrayList<Player> players;
    
    private String[] assignedRoles;
    private String[] unassignedRoles;
    
    private enum GameState { INPROGRESS, RICKWON, ANTIRICKWON, EVILRICKWON }
    private GameState stateOfGame;
    
    /**
     * DO NOT USE!!!
     * This is only used for subclass purposes and doesn't instantiate the class properly
     */
    public Game() {
        throw new UnsupportedOperationException("ERROR: Used incorrect Game() constructor");
    }
    
    /**
     * Initialize a game
     * @param playerNum
     * @param dimensionNum
     * @param radix
     */
    public Game(int playerNum, int dimensionNum, int r) {
        
        this.stateOfGame = GameState.INPROGRESS; // Set the game as in progress
        this.players = new ArrayList<>(); // Initialize empty list of players
        this.numberOfPlayers = playerNum;
        this.numberOfDimensions = dimensionNum;
        this.radix = r;
        
    }
    
    /**
     * Send a string to any clients listening to this
     * @param s 
     * String to send
     */
    public void showMessage(String s) {
        
    }
    
    public void RickWins() {
        this.stateOfGame = GameState.RICKWON;
    }

    public void AntiRickTeamWins() {
        this.stateOfGame = GameState.ANTIRICKWON;
    }

    public void EvilRickWins() {
        this.stateOfGame = GameState.EVILRICKWON;
    }

    public void RickAttack(int dimension, Player attacker) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        // Check if attacker has a meeseeks
        // If so, iterate through player list
          // If coordinate of a player matches Rick's on the chosen dimension
          // then call hitByRick() on that player
          // Don't hurt attacker (can either be Rick or evil Rick)
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
    
    public void addPlayer(Player p) {
        this.players.add(p);
    }
    
}
