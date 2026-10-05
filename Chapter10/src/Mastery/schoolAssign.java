package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class schoolAssign {

	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schoolAssign window = new schoolAssign();
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
	public schoolAssign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon northBeaver = new ImageIcon("../Chapter10/src/Mastery/beaver.png");
		ImageIcon southBulldog = new ImageIcon("../Chapter10/src/Mastery/bulldog.jpg");
		ImageIcon eastPuma = new ImageIcon("../Chapter10/src/Mastery/puma.jpg");
		ImageIcon westBear = new ImageIcon("../Chapter10/src/Mastery/bear.jpg");
		ImageIcon centerHawk = new ImageIcon("../Chapter10/src/Mastery/hawk.jpg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		firstName = new JTextField();
		firstName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(firstName.getText().equals("First Name")) 
				{
					firstName.setText("");
				}
			}
		});
		firstName.setText("First Name");
		firstName.setBounds(10, 24, 165, 41);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(lastName.getText().equals("Last Name")) 
				{
					lastName.setText("");
				}
			}
		});
		lastName.setText("Last Name");
		lastName.setColumns(10);
		lastName.setBounds(214, 24, 165, 41);
		panel.add(lastName);

		JComboBox grade = new JComboBox();
		grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		grade.setBounds(10, 96, 165, 35);
		panel.add(grade);
		
		JComboBox district = new JComboBox();
		district.setModel(new DefaultComboBoxModel(new String[] {"North", "South", "East", "West", "Center"}));
		district.setBounds(214, 96, 165, 35);
		panel.add(district);
		
		JLabel desc = new JLabel("");
		desc.setBounds(10, 155, 409, 60);
		panel.add(desc);
		
		JLabel placeholder = new JLabel("");
		placeholder.setBounds(10, 226, 409, 206);
		panel.add(placeholder);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				desc.setText(firstName.getText() + " " + lastName.getText() 
                + " is in grade " + grade.getSelectedItem() 
                + " and goes to " + district.getSelectedItem() + " high school.");
				
				 if(district.getSelectedItem().equals("North")) 
			        {
			            placeholder.setIcon(northBeaver);
			        }
			        else if(district.getSelectedItem().equals("South"))
			        {
			            placeholder.setIcon(southBulldog);
			        }
			        else if(district.getSelectedItem().equals("East"))
			        {
			            placeholder.setIcon(eastPuma);
			        }
			        else if(district.getSelectedItem().equals("West"))
			        {
			            placeholder.setIcon(westBear);
			        }
			        else if(district.getSelectedItem().equals("Center"))
			        {
			            placeholder.setIcon(centerHawk);
			        }
			}
		});
		submit.setBounds(448, 11, 126, 251);
		panel.add(submit);
		
		
	}
}
