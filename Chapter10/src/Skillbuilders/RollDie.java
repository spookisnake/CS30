package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RollDie {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RollDie window = new RollDie();
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
	public RollDie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon die1 = new ImageIcon("../Chapter10/src/Skillbuilders/die1.gif");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/Skillbuilders/die2.gif");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/Skillbuilders/die3.gif");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/Skillbuilders/die4.gif");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/Skillbuilders/die5.gif");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/Skillbuilders/die6.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel dieFace = new JLabel("");
		dieFace.setBackground(new Color(0, 128, 0));
		dieFace.setBounds(80, 109, 103, 108);
		panel.add(dieFace);
		
		JLabel dieFace2 = new JLabel("");
		dieFace2.setBackground(new Color(0, 128, 0));
		dieFace2.setBounds(257, 109, 103, 108);
		panel.add(dieFace2);
		
		JButton roll = new JButton("Roll Die");
		roll.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1) 
				{
					dieFace.setIcon(die1);
				}
				else if(newRoll == 2) 
				{
					dieFace.setIcon(die2);
				}
				else if(newRoll == 3) 
				{
					dieFace.setIcon(die3);
				}
				else if(newRoll == 4) 
				{
					dieFace.setIcon(die4);
				}
				else if(newRoll == 5) 
				{
					dieFace.setIcon(die5);
				}
				else if(newRoll == 6) 
				{
					dieFace.setIcon(die6);
				}
				
				newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1) 
				{
					dieFace2.setIcon(die1);
				}
				else if(newRoll2 == 2) 
				{
					dieFace2.setIcon(die2);
				}
				else if(newRoll2 == 3) 
				{
					dieFace2.setIcon(die3);
				}
				else if(newRoll2 == 4) 
				{
					dieFace2.setIcon(die4);
				}
				else if(newRoll2 == 5) 
				{
					dieFace2.setIcon(die5);
				}
				else if(newRoll2 == 6) 
				{
					dieFace2.setIcon(die6);
				}
				//#hello
			}
		});
		roll.setBounds(80, 11, 280, 60);
		panel.add(roll);
		
		
	}
}
