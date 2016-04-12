package findmensions;

import Middleware.Middleware;

/**
 * A character role
 * @author Tiffany Sawyer
 */
public abstract interface Role {
    
    /**
     * Create pointer to the game this is part of
     */
    public void setGame(Middleware g);
    
    /**
     * Move the character
     */
    public void move();
    
    /**
     * Reveal a dimension
     */
    public void revealDimension();
    
    /**
     * What to do when the character is killed by the targeted kill
     */
    public void onDeath();
    
    /**
     * What to do when the character is hit by Rick
     */
    public void hitByRick();

    /**
     * Pass a reference to the player this role belongs to
     * @param p 
     * The player object
     */
    public void passReferenceToPlayer(Player p);
    
    /**
     * Get a string representation of the role
     * @return 
     * The name of the role, as a string
     */
    public String getRole();
}
