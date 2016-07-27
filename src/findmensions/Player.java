package findmensions;

/**
 * Represents a single player with a role and coordinates
 * @author Tiffany Sawyer
 */
public class Player {
    
    protected int[] coordinates;
    protected final Role role;
    protected int meeseeks;

    public Player(int[] startingPoint, Role r) {
        
        this.coordinates = startingPoint;
        this.role = r;
        this.meeseeks = 0;
        
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
    
    public void setCoordinate(int[] c) {
        this.coordinates = c;
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

    /**
     * Add a single meeseeks to this player
     */
    public void addMeeseeks() {
        this.meeseeks += 1;
    }

    /**
     * Remove a single meeseeks from this player
     */
    public void removeMeeseeks() {
        this.meeseeks -= 1;
    }
    
}
