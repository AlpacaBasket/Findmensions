package findmensions;

/**
 * Represents a single player with a role and coordinates
 * @author Tiffany Sawyer
 */
public class Player {
    
    private int[] coordinates;
    private Role role;
    private int meeseeks;

    public Player(int[] startingPoint, Role r) {
        
        this.coordinates = startingPoint;
        this.role = r;
        this.meeseeks = 0;
        
        role.passReferenceToPlayer(this);
    }
    
    /**
     * Return a position for a given dimension
     * @param d
     * The dimension
     * @return
     * Position
     */
    public int getCoordinate(int d) {
        return this.coordinates[d];
    }
    
    public Role getRole() {
        return this.role;
    }

    public int getMeeseeksAmount() {
        return this.meeseeks;
    }
    
    /**
     * Set the amount of meeseeks for this player
     * Note: may change it to only being able to increment by 1
     * @param n 
     * Number of meeseeks
     */
    public void setMeeseeksAmount(int n) {
        this.meeseeks = n;
    }
    
}
