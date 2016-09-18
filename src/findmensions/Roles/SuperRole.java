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
    int hp = 1;
    
    @Override
    public String getRole() {
        return this.roleString;
    }
    
    @Override
    public int getHP() {
        return this.hp;
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
        
        if (this.player.getMeeseeksAmount() == 0) {
            this.game.playerDied(this.player);
        }
        else {
            this.player.removeMeeseeks();
        }
        
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
