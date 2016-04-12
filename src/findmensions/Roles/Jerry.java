package findmensions.Roles;

/**
 * Don't be a Jerry, nobody likes Jerry.
 * @author Tiffany Sawyer
 */
public class Jerry extends SuperRole {
    
    /**
     * Rick wins if Anti-Rick team hits Jerry (they have to defend his
     * useless butt)
     */
    @Override
    public void onDeath() {
        game.RickWins();
    }
    
    /**
     * Rick wins if he hits Jerry
     */
    @Override
    public void hitByRick() {
        game.RickWins();
    }
    
}
