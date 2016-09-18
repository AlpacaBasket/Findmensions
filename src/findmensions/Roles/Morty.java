package findmensions.Roles;

/**
 * You lose if you kill Morty, you bastard
 * @author Tiffany Sawyer
 */
public class Morty extends SuperRole {
    
    /**
     * Rick wins if Anti-Rick team hits Morty
     */
    @Override
    public void onDeath() {
        game.RickWins();
    }
    
    /**
     * Anti-Rick team wins if Rick hits Morty
     */
    @Override
    public void hitByRick() {
        if (super.player.getMeeseeksAmount() == 0) {
            game.AntiRickTeamWins(); // Rick loses if he kills Morty
        }
        else {
            super.player.removeMeeseeks();
        }
    }
    
}
