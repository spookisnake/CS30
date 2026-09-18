package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class SemesterAvg {

	private JFrame frame;
	private JTextField Gr1;
	private JTextField Gr2;
	private JTextField Gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 342, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Gr1 = new JTextField();
		Gr1.setText("Enter First Grade: ");
		Gr1.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(Gr1.getText().equals("Enter First Grade: ")) 
				{
					Gr1.setText("");
				}	
			}
		});
		Gr1.setBounds(10, 11, 141, 43);
		panel.add(Gr1);
		Gr1.setColumns(10);
		
		Gr2 = new JTextField();
		Gr2.setText("Enter Second Grade: ");
		Gr2.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(Gr2.getText().equals("Enter Second Grade: ")) 
				{
					Gr2.setText("");
				}	
			}
		});
		Gr2.setColumns(10);
		Gr2.setBounds(10, 84, 141, 43);
		panel.add(Gr2);
		
		Gr3 = new JTextField();
		Gr3.setText("Enter Third Grade: ");
		Gr3.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(Gr3.getText().equals("Enter Third Grade: ")) 
				{
					Gr3.setText("");
				}
			}
		});
		Gr3.setColumns(10);
		Gr3.setBounds(10, 157, 141, 43);
		panel.add(Gr3);
		
		JLabel display = new JLabel("");
		display.setBounds(10, 211, 304, 43);
		panel.add(display);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Papyrus", Font.PLAIN, 20));
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String g1 = Gr1.getText();
				String g2 = Gr2.getText();
				String g3 = Gr3.getText();
				
				double G1 = Double.parseDouble(g1);
				double G2 = Double.parseDouble(g2);
				double G3 = Double.parseDouble(g3);
				
				double avgGrade = (G1 + G2 + G3)/3;
				
				DecimalFormat dc = new DecimalFormat("0.0");
				
				
				display.setText("Your semester average is: "
						+ dc.format(avgGrade));	
			}
		});
		submit.setBounds(161, 11, 153, 189);
		panel.add(submit);
		
		
	}
}
