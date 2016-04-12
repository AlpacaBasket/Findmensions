package findmensions.Roles;

/**
 * Well *buuuurp* obviously in a game about Rick
 * and Morty you have to have Rick, the
 * tautology club called: they want their idiot who's
 * stupid back.
 * @author Tiffany Sawyer
 */
public class Rick extends SuperRole {
    
    /**
     * Evil Rick is the only other role that can do the
     * attack command so it must be Evil Rick attacking
     * unless something has went wrong
     */
    @Override
    public void hitByRick() {
        game.EvilRickWins();
    }
    
    /**
     * Anti-Rick team wins if Rick is hit
     */
    @Override
    public void onDeath() {
        game.AntiRickTeamWins();
    }
    
    /**
     * Rick does an attack on a dimension
     */
    public void attack(int dimension) {
        game.RickAttack(dimension, player);
    }
    
}
