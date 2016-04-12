package findmensions.Roles;

import Middleware.Middleware;
import findmensions.Game;
import findmensions.Player;
import findmensions.Role;

/**
 * Role that other roles inherit behavior from
 * @author Tiffany Sawyer
 */
public class SuperRole implements Role {

    Middleware game;
    Player player;
    String roleString;
    
    @Override
    public void setGame(Middleware g) {
        this.game = g;
    }
    
    @Override
    public String getRole() {
        return this.roleString;
    }

    /**
     * Player changes a coordinate
     */
    @Override
    public void move() {
        
    }
    
    /**
     * If this is not overridden then assume it is
     * a standard death and the player simply loses
     */
    @Override
    public void onDeath() {
        
    }
    
    /**
     * If this is not overridden then assume it is
     * a standard attack
     */
    @Override
    public void hitByRick() {
        
    }

    @Override
    public void passReferenceToPlayer(Player p) {
        this.player = p;
    }
    
    /**
     * Reveal a dimension that can be moved along
     */
    @Override
    public void revealDimension() {
        
    }

}
