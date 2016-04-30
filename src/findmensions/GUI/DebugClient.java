package findmensions.GUI;

import findmensions.Game;
import findmensions.Player;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Class used as a server and client to create a game and play as a debugger (single screen)
 * @author Tiffany Sawyer
 */
public class DebugClient extends JPanel implements Client, ActionListener {
    
    JPanel titleHolder; // JPanel that holds the text for the title
    JTextField title; // Title as text
    
    JButton next; // Button to move to the waiting screen
    JButton nextPlayerMove; // Button to move to the next player on the waiting screen
    JButton rickAttack; // Button to perform next action and do a rick attack
    
    JTextArea coordinateInput; // Text box for putting in the coordinates you want to move to
    JTextField textField; // Field where output is displayed
    
    Game game; // The game this is controlling
    
    Player currentPlayer; // The player currently doing a move or viewing their role
    
    /**
     * Just a constructor
     */
    public DebugClient() {
        
        // Instantiate all the components
        
        titleHolder = new JPanel();
        
        next = new JButton();
        next.addActionListener(this);
        
        nextPlayerMove = new JButton();
        nextPlayerMove.addActionListener(this);
        
        rickAttack = new JButton();
        rickAttack.addActionListener(this);
        
        coordinateInput = new JTextArea();
        
    }
    
    /**
     * Starts the game
     */
    public void begin() {
        
        waitingScreen(); // Wait for player to show moves
        
    }

    @Override
    public void receiveMessage(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        // Populate text field I suppose
        
    }

    /**
     * Unnecessary for this class since it acts for every player in the game
     * @param p 
     */
    @Override
    public void receivePlayer(Player p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doMove(String m) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        // this.game.doMove(currentPlayer, m);
        // Put in loop so keep asking to do the move until you get a valid return code
        
    }

    @Override
    public void addGame(Game g) {
        this.game = g;
    }
    
    @Override
    public void rickAttack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Changes GUI to the waiting screen
     */
    public void waitingScreen() {
        
        this.setLayout(new BorderLayout());
        
    }
    
    /**
     * Changes GUI to the screen that allows a player to make a move
     */
    public void moveScreen() {
        
        this.setLayout(new BorderLayout());
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.nextPlayerMove) {
            moveScreen();
        }
        else if (e.getSource() == this.next) {
            doMove(coordinateInput.getText());
            waitingScreen();
        }
        else if (e.getSource() == this.rickAttack) {
            doMove(coordinateInput.getText());
            rickAttack();
            waitingScreen();
        }
        
    }
    
}