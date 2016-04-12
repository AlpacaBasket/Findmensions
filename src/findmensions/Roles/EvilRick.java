package findmensions.Roles;

/**
 * Evil Rick's goal is to kill Rick
 * @author Tiffany Sawyer
 */
public class EvilRick extends SuperRole {
    
    /**
     * Rick does an attack on a dimension
     */
    public void attack(int dimension) {
        game.RickAttack(dimension, player);
    }
    
}