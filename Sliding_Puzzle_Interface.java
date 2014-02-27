import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
 
import java.awt.event.ActionEvent;
 
import java.awt.event.ActionListener;
 
import java.util.ArrayList;
import java.util.Collections;
 
import java.util.Random;
 
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Sliding_Puzzle_Interface extends JPanel {
    JPanel pnlTiles;
    JButton btnNewGame;
    JButton btnTiles[] = new JButton[9];
    final int n=0,k=0;
 
    public Sliding_Puzzle_Interface() {
 
        super(null);
 
        pnlTiles = new JPanel();
        pnlTiles.setLayout(new GridLayout(3, 3));
        pnlTiles.setBounds(10, 10, 200, 200);
        pnlTiles.setBackground(Color.blue);
        add(pnlTiles);
 
        for (int n = 0; n< btnTiles.length; n++) {
            btnTiles[n] = new JButton();
            btnTiles[n].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       String number = e.getActionCommand();
                     System.out.println(number);
                        String[] indices = number.split(" ");
                        int i = Integer.parseInt(indices[0]);
                       // System.out.println(i);

 
                      
                       int canMoveNum[]={i-3,i+1,i+3,i-1};
                        for (int k = 0; k < 4; k++) {
                            if(canMoveNum[k]>=0 && canMoveNum[k]<9){
                             JButton button=btnTiles[canMoveNum[k]];
                                if (button.getText().equals("")) {
                                    button.setText(btnTiles[i].getText());
                                    btnTiles[i].setText("");
                                }
                            }
                        }
                        
                       
                    }
                });
            pnlTiles.add(btnTiles[n]);
 
        }
 
        btnNewGame = new JButton("New Game");
        btnNewGame.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
 
                    ArrayList a = new ArrayList();
                    int k;
                    int val = 0;
 
                    for (k = 1; k <= 8; k++) {
                        a.add(k);
                    }
 
                    Random rand = new Random();
                    
                    while (a.size()> 0) {
                        int index = rand.nextInt(a.size());
 
                        val = (Integer)(a.remove(index));
                        /** It can show random numbers without duplicating */
 
                        
                        btnTiles[a.size()].setText(val + "");
                        btnTiles[a.size()].setActionCommand(a.size()+" ");
                        
                      
 
                    
                    }
 

                }
 
            });
 

        btnNewGame.setBounds(20, 430, 130, 40);
        add(btnNewGame);
        add(pnlTiles);
 
    }
}
 

 
import java.awt.Dimension;
import java.awt.Toolkit;
 
import javax.swing.JFrame;
public class Sliding_Puzzle_Main {
 
    public static void main(String[] args) {
        Sliding_Puzzle_Interface spi = new Sliding_Puzzle_Interface();
 
        JFrame window = new JFrame(" puzzles");
 
 
        window.setVisible(true);
        window.setSize(600, 600);
 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((int)(screenSize.getWidth() / 2 -
                                 window.getWidth() / 2),
                           (int)(screenSize.getHeight() / 2 -
                                 window.getWidth() / 2));
 
        window.add(spi);
    }
}