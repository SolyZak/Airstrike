package spacegame;
import java.util.Scanner;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;


public class Airstrike extends JFrame  {

    public Airstrike() throws MalformedURLException {
    	splashInit();
        initUI();
    }

    private void initUI() {

        add(new Screen());

        setTitle("Airstrike");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    private void splashInit() throws MalformedURLException {
    	JWindow window = new JWindow();
    	window.getContentPane().add(
    	    new JLabel("Welcome", new ImageIcon("src/images/player.png"), SwingConstants.CENTER));
    	window.setBounds(500, 150, 358, 350);
    	window.setVisible(true);
    	JFrame frame = new JFrame();
    	frame.add(new JLabel("Wlecome to Airstrike, mission: protect the baae from the Enemy. /n Current difficulty : Meduim"), SwingConstants.CENTER);
    	frame.setVisible(true);
    	frame.setSize(358,350);
    	
    	window.setVisible(false);

    	
    	window.dispose();    
    }

    public static void main(String[] args) {

    	// will become buttons
//    	Scanner scanner = new Scanner(System.in);  
//    	String diff = scanner.next();
//        
//    	
//    	Difficulty level = new Difficulty(diff, g);
   	
    	EventQueue.invokeLater(() -> {

            Airstrike ex = null;
			try {
				ex = new Airstrike();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ex.setVisible(true);
        });
    }
}
