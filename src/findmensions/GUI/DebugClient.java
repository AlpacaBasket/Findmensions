package findmensions.GUI;

import findmensions.Game;
import findmensions.Player;
import findmensions.Role;
import findmensions.Roles.Rick;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Class used as a server and client to create a game and play as a debugger (single screen)
 * @author Tiffany Sawyer
 */
public class DebugClient extends JPanel implements Client, ActionListener {
    
    JLabel title; // Title as text
    
    JPanel contentPanel; // To hold some components
    JPanel newContent; // Temporarily hold new content before overwriting old components
    
    JButton next; // Button to move to the next player from the waiting screen
    JButton nextPlayerMove; // Button to move to the waiting screen
    JButton rickAttack; // Button to perform next action and do a rick attack
    
    JTextField coordinateInput; // Text box for putting in the coordinates you want to move to
    JLabel outputArea; // Text area where output is displayed
    
    Game game; // The game this is controlling
    
    Player currentPlayer; // The player currently doing a move or viewing their role
    
    /**
     * Just a constructor
     */
    public DebugClient() {
    }
    
    /**
     * Starts the game
     */
    public void begin() {
        
        // Instantiate all the components
        
        this.setLayout(new BorderLayout());
        
        contentPanel = new JPanel();
        newContent = new JPanel();
        
        title = new JLabel("Findmensions");
        title.setHorizontalAlignment(JLabel.CENTER);
        
        next = new JButton("Start turn");
        next.addActionListener(this);
        
        nextPlayerMove = new JButton("Make move");
        nextPlayerMove.addActionListener(this);
        
        rickAttack = new JButton("Attack");
        rickAttack.addActionListener(this);
        
        coordinateInput = new JTextField(10);
        outputArea = new JLabel();
        
        this.add(title, BorderLayout.NORTH);
        this.add(contentPanel, BorderLayout.CENTER);
        waitingScreen(); // Wait for player to show moves
        
        Role currentPlayerRole = new Rick();
        int[] testCoordinates = {0, 0};
        currentPlayer = new Player(testCoordinates, currentPlayerRole);
        
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
        
        /*int exitCode = 1;
        while (exitCode != 0) {
            exitCode = this.game.doMove(currentPlayer, m);
        }
        */
        
    }

    // Set the game of this client
    @Override
    public void addGame(Game g) {
        this.game = g;
    }
    
    // Do a Rickity Rick
    @Override
    public void rickAttack(int dimension) {
        this.game.RickAttack(dimension, currentPlayer);
    }
    
    /**
     * Changes GUI to the waiting screen
     */
    public void waitingScreen() {
        
        title.setText("Waiting screen");
        
        contentPanel.removeAll();
        contentPanel.add(next, BorderLayout.CENTER);
        
        contentPanel.updateUI();
        this.updateUI();
        
    }
    
    /**
     * Changes GUI to the screen that allows a player to make a move
     */
    public void moveScreen() {
        
        title.setText("User input screen");
        
        contentPanel.removeAll();
        contentPanel.add(coordinateInput, BorderLayout.CENTER);
        contentPanel.add(nextPlayerMove, BorderLayout.CENTER);
        
        // Add Rick Attack button if player is Rick or Evil Rick
        if ((currentPlayer.getRoleName().equals("Rick")) || (currentPlayer.getRoleName().equals("Evil Rick"))) {
            contentPanel.add(rickAttack, BorderLayout.CENTER);
        }
        
        contentPanel.updateUI();
        this.updateUI();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Screen where a player makes a move, to be pressed by the player
        // making the move (other players shouldn't see this screen)
        if (e.getSource() == this.nextPlayerMove) {
            waitingScreen();
        }
        // Player has made their move, go to transition screen between
        // players
        else if (e.getSource() == this.next) {
            // doMove(game.validatePlayerMove(coordinateInput.getText()), currentPlayer);
            moveScreen();
        }
        // Player has done a rick attack, go to transition screen
        else if (e.getSource() == this.rickAttack) {
            // rickAttack(game.validateRickMove(coordinateInput.getText()));
            waitingScreen();
        }
        
    }
    
}