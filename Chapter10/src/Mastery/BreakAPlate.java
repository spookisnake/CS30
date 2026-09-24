package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon allBroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
		ImageIcon twoBroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
		ImageIcon platesRegular = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
		ImageIcon tiger = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel plates = new JLabel("");
	
		plates.setBounds(148, 24, 278, 90);
		panel.add(plates);
		
		JLabel prize = new JLabel("");
		prize.setBounds(230, 169, 108, 90);
		panel.add(prize);
		
		JButton play = new JButton("Click to break");
		play.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				int breakPlate;
				
				breakPlate = (int)(2 * Math.random() + 1);
				
				if(breakPlate == 1) 
				{
					plates.setIcon(twoBroken);
					prize.setIcon(sticker);
				}
				
				else if(breakPlate == 2) 
				{
					plates.setIcon(allBroken);
					prize.setIcon(tiger);
				}
			}
		});
		play.setBounds(210, 125, 145, 33);
		panel.add(play);
		
		
	}
}
